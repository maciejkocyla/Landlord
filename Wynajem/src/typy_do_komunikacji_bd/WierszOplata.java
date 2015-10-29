package typy_do_komunikacji_bd;

public class WierszOplata {
	private int id;
	private String data;
	private String opis;
	private String nr_faktury;
	private double kwota;
	private boolean stanAdministrator;
	private String dataOplaceniaAdministrator;
	private boolean stanWynajmujacy;
	private String dataOplaceniaWynajmujacy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getNr_faktury() {
		return nr_faktury;
	}
	public void setNr_faktury(String nr_faktury) {
		this.nr_faktury = nr_faktury;
	}
	public double getKwota() {
		return kwota;
	}
	public void setKwota(double kwota) {
		this.kwota = kwota;
	}
	public boolean getStanAdministrator() {
		return stanAdministrator;
	}
	public void setStanAdministrator(boolean stanAdministrator) {
		this.stanAdministrator = stanAdministrator;
	}
	public String getDataOplaceniaAdministrator() {
		return dataOplaceniaAdministrator;
	}
	public void setDataOplaceniaAdministrator(String dataOplaceniaAdministrator) {
		this.dataOplaceniaAdministrator = dataOplaceniaAdministrator;
	}
	public boolean getStanWynajmujacy() {
		return stanWynajmujacy;
	}
	public void setStanWynajmujacy(boolean stanWynajmujacy) {
		this.stanWynajmujacy = stanWynajmujacy;
	}
	public String getDataOplaceniaWynajmujacy() {
		return dataOplaceniaWynajmujacy;
	}
	public void setDataOplaceniaWynajmujacy(String dataOplaceniaWynajmujacy) {
		this.dataOplaceniaWynajmujacy = dataOplaceniaWynajmujacy;
	}
	
	
}
