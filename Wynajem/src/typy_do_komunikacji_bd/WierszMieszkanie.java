package typy_do_komunikacji_bd;

public class WierszMieszkanie {
	private int id;
	private String adres;
	private String ktowynajmuje;
//gettery
	public int getId(){
		return id;
	}
	
	public String getAdres(){
		return adres;
	}
	
	public String getWynajmujacy(){
		return ktowynajmuje;
	}
//settery	
	public void setId(int id){
		this.id = id;
	}
	
	public void setAdres(String adres){
		this.adres = adres;
	}
	
	public void setWynajmujacy(String ktowynajmuje){
		this.ktowynajmuje = ktowynajmuje;
	}
}
