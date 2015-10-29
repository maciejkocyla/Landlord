package typy_do_komunikacji_bd;

public class WierszNajemne {
	private String data;
	private String opis;
	private Double kwota;
	private boolean stan;
	private String dataOplacenia;
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
	public Double getKwota() {
		return kwota;
	}
	public void setKwota(Double kwota) {
		this.kwota = kwota;
	}
	public boolean getStan() {
		return stan;
	}
	public void setStan(boolean stan) {
		this.stan = stan;
	}
	public String getDataOplacenia() {
		return dataOplacenia;
	}
	public void setDataOplacenia(String dataOplacenia) {
		this.dataOplacenia = dataOplacenia;
	}
	
	
}
