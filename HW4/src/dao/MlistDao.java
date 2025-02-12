package dao;

import java.util.List;

import model.Mlist;

public interface MlistDao {
	    //create-->void
		void add( Mlist mlist);
		
		//read-->List
		List<Mlist> selectAll();
		List<Mlist> selectById(int id);
		
		//update-->void
		void update(Mlist mlist);
		
		//delete-->void
		void delete(int id);

	}

