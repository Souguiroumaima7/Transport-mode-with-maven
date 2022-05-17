package transport;
import java.util.*;
public class Transports extends ModeTransport {
	
	private String titre ;
	private ArrayList<ModeTransport> Selectitem;
	public Transports() {
		super();
		this.Selectitem = new ArrayList();
	}



	public ArrayList<ModeTransport> getSelectitem() {
		return Selectitem;
	}
	public void setSelectitemr(ArrayList<ModeTransport> Selectitem) {
		this.Selectitem= Selectitem;
	}
	

	public void addModeTransport(ModeTransport MT) {
		this.Selectitem.add(MT);
	}
	public boolean hasModeTransport(ModeTransport MT) {
		return this.Selectitem.contains(MT);
		
	}
	public void delStudent(ModeTransport MT) {
		 this.Selectitem.remove(MT);
	}
	
	
	public void getListTransports() {
		this.Selectitem.get(getId());
	
		
		 Iterator itr=Selectitem.iterator();
		 
		  while(itr.hasNext()){
		   System.out.println(itr.next()); 
		  }  
		
		
	}
	
}
