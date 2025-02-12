package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MlistDao;
import model.Mlist;
import util.DbConnection;

public class MlistDaoImpl implements MlistDao{

	public static void main(String[] args) {
		Mlist m=new Mlist("abc",1,2,3,4); new MlistDaoImpl().add(m);

	}
	private static Connection conn=DbConnection.getDb();

	@Override
	public void add(Mlist mlist) {
		String Sql="insert into mlist(name,pico,frac,botul,slimne) values(?,?,?,?,?)";//確定SQL語法
		try {
			PreparedStatement preparedstatement =conn.prepareStatement(Sql);
			preparedstatement.setString(1, mlist.getName());
			preparedstatement.setInt(2, mlist.getPico());
			preparedstatement.setInt(3, mlist.getFrac());
			preparedstatement.setInt(4, mlist.getBotul());
			preparedstatement.setInt(5, mlist.getSlimne());
			preparedstatement.executeUpdate();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}
		
	}

	@Override
	public List<Mlist> selectAll() {
		String sql="select * from mlist;";
		List<Mlist> l=new ArrayList();
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next())
			{
				Mlist mlist=new Mlist();
			    mlist.setId(resultset.getInt("id"));
			    mlist.setName(resultset.getString("name"));
			    mlist.setPico(resultset.getInt("pico"));
				mlist.setFrac(resultset.getInt("frac"));
				mlist.setBotul(resultset.getInt("botul"));
				mlist.setSlimne(resultset.getInt("slimne"));
				l.add(mlist);
			}			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		return l;
	}
			
	@Override
	public List<Mlist> selectById(int id) {
		String Sql="select * from  mlist where id=?";
		List<Mlist> l=new ArrayList();
		try {
			
			PreparedStatement preparedstatement=conn.prepareStatement(Sql);
			preparedstatement.setInt(1, id);
			ResultSet resultset=preparedstatement.executeQuery();
			if(resultset.next())
			{
				Mlist mlist=new Mlist();
			    mlist.setId(resultset.getInt("id"));
			    mlist.setName(resultset.getString("name"));
			    mlist.setPico(resultset.getInt("pico"));
				mlist.setFrac(resultset.getInt("frac"));
				mlist.setBotul(resultset.getInt("botul"));
				mlist.setSlimne(resultset.getInt("slimne"));
				l.add(mlist);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public void update(Mlist mlist) {
		String sql="update mlist set name=?,pico=?,frac=?,botul=?,slimne=? where id=?";
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setString(1, mlist.getName());
			preparedstatement.setInt(2, mlist.getPico());
			preparedstatement.setInt(3, mlist.getFrac());
			preparedstatement.setInt(4, mlist.getBotul());
			preparedstatement.setInt(5, mlist.getSlimne());
			preparedstatement.setInt(6, mlist.getId());
			
			preparedstatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from mlist where id=?";
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
