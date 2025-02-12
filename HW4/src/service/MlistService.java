package service;

import java.util.List;

import model.Mlist;

public interface MlistService {
	//create
	void addMlist(Mlist mlist);
	
	//read
	String AllMlist();
	List<Mlist> findAllMlist();	
	Mlist findById(int id);
	
	//update
	void updateMlist(String name,int id);
	void updateMlist(int pico,int frac,int botul,int slimne,int id);
	void updateMlist(Mlist mlist);
	
	//delete
	void deleteMlistById(int id);

}
