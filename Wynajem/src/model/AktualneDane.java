package model;

import typy_do_komunikacji_bd.WierszMieszkanie;
import typy_do_komunikacji_bd.WierszNajemne;
import typy_do_komunikacji_bd.WierszOplata;
import java.util.ArrayList;
import java.util.Observable;
//Pomysl: w modelu BD jest metoda update, ktora po utworzeniu lokalnej listy z bd wywoluje
//np. taka konstrukcje: AktualneDane.getListaMieszkan() = listaMieszkanUtworzonaLokalnie;
//efekt: po zakonczeniu metody referencja do lokalnej listy mieszkan przestaje istniec
//a nowiutka aktualna lista trafia tutaj ;).
//Garbage Collector na cale szczescie wywali smieci w postaci starej listy.
public class AktualneDane extends Observable{
	private ArrayList<WierszMieszkanie> listaMieszkan;
	private ArrayList<WierszOplata> listaOplat;
	private ArrayList<WierszNajemne> listaNajemnego;
	
	public ArrayList<WierszMieszkanie> getListaMieszkan() {
		return listaMieszkan;
	}
	public ArrayList<WierszOplata> getListaOplat() {
		return listaOplat;
	}
	public ArrayList<WierszNajemne> getListaNajemnego() {
		return listaNajemnego;
	}
	
	public void updateWidokow()
	{
		setChanged();
		notifyObservers();
	}
}
