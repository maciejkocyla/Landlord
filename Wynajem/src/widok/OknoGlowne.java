package widok;

import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.util.Observer;
import java.util.Observable;

import widok_wprowadzanie_danych.OknoWprowadzaniaDanychMieszkanie;

public class OknoGlowne extends JFrame implements Observer{
	
	OknoWprowadzaniaDanychMieszkanie OknoWprowadzaniaDanychMieszkanie;
	JTabbedPane cards;
	WidokMieszkania widokMieszkania;
	WidokOplaty widokOplaty;
	
	public OknoGlowne()
	{
		super("Wynajem");
		initComponents();
	}
	
	private void initComponents()
	{
		JScrollPane WidokGlowny = new JScrollPane();
		cards = new JTabbedPane();
		WidokGlowny.setViewportView(cards);
		
		widokMieszkania = new WidokMieszkania();
		widokOplaty = new WidokOplaty();
		cards.addTab("Mieszkania", null, widokMieszkania, "Wyswietl, dodaj, edytuj mieszkania");
		cards.addTab("Oplaty", null, widokOplaty, "Wyswietl, dodaj, edytuj, archiwizuj oplaty");
		
		add(WidokGlowny);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public void update(Observable o, Object x)
	{
		
	}
}
