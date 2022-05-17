package transport;

public class ModeTransport {
private int id ; 
private String titre ;
private double prix ;


public ModeTransport(int id, String titre, double prix) {
	super();
	this.id = id;
	this.setTitre(titre);
	this.prix = prix;
}
public ModeTransport () {
	
}

public int getId() {
	return id;
}


public String getTitre() {
	return titre;
}


public double getPrix() {
	return prix;
}




@Override
public String toString() {
	return "ModeTransport [id=" + id + ", titre=" + titre + ", prix=" + prix + "]";
}



public void setTitre(String titre) {
	this.titre = titre;
}




}
