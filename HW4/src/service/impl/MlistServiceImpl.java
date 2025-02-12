package service.impl;

import java.util.List;

import dao.impl.MlistDaoImpl;
import model.Mlist;
import service.MlistService;

public class MlistServiceImpl  implements MlistService {

	public static void main(String[] args) {
		System.out.println(new MlistServiceImpl().findById(22));


	}
	
	private static MlistDaoImpl mlistdaoImpl=new MlistDaoImpl();

	@Override
	public void addMlist(Mlist mlist) {
		if(mlist.getPico()>=0 && mlist.getFrac()>=0 && mlist.getBotul()>=0 && mlist.getSlimne()>=0)
		{
			mlistdaoImpl.add(mlist);
		}
		
	}

	@Override
	public String AllMlist() {
		List<Mlist> l=mlistdaoImpl.selectAll();
		String show="";
		for(Mlist m:l)
		{
			int sum=m.getPico()*2000+m.getFrac()*2500+m.getBotul()*3000+m.getSlimne()*3500;
			
			show +=show+"訂單編號:"+m.getId()+
					"\t客戶名稱:"+m.getName()+
					"\tpico:"+m.getPico()+
					"\tfrac:"+m.getFrac()+
					"\tbotul:"+m.getBotul()+
					"\tslimne:"+m.getSlimne()+
					"\t金額:"+sum+"元\n";
		}
		
		return show;
	}

		
	@Override
	public List<Mlist> findAllMlist() {
		return mlistdaoImpl.selectAll();

	}

	@Override
	public Mlist findById(int id) {
		Mlist mlist=null;
		if(id>0)
		{
			List<Mlist> l=mlistdaoImpl.selectById(id);
			if(l.size()>0)
			{
				mlist=l.get(0);
			}
			
		}	
		
		return mlist;
	}


	@Override
	public void updateMlist(String name, int id) {
		Mlist m=findById(id);
		m.setName(name);
		mlistdaoImpl.update(m);
		
	}

	@Override
	public void updateMlist(int pico, int frac, int botul, int slimne, int id) {
	   Mlist m=findById(id);
	   m.setPico(pico);
	   m.setFrac(frac);
	   m.setBotul(botul);
	   m.setSlimne(slimne);
	   mlistdaoImpl.update(m);
		
	}

	@Override
	public void updateMlist(Mlist mlist) {
		Mlist m=findById(mlist.getId());
		
	}

	@Override
	public void deleteMlistById(int id) {
		if(id>0)
		{
			mlistdaoImpl.delete(id);
		}
		
	}

}
