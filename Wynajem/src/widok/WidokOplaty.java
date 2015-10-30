package widok;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import model.TableModelOplaty;

public class WidokOplaty extends javax.swing.JPanel{

	//Tutaj stale dla GridBagLayout
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	//----------------------------

	private JButton dodajOplate;
	private JButton usunOplate;
	private JButton modyfikujOplate;
	private JButton archiwizujOplate;
	private JTable tabelaOplat;
	private JComboBox comboBoxWyborMieszkan;
	private JLabel zaleglosciAdministrator;
	private JLabel zaleglosciWynajmujacy;
	
	public WidokOplaty(){
	setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	dodajOplate = new JButton("Dodaj");
	usunOplate = new JButton("Usun");
	modyfikujOplate = new JButton("Modyfikuj");
	archiwizujOplate = new JButton("Archiwizuj");
	comboBoxWyborMieszkan = new JComboBox();
	
	comboBoxWyborMieszkan.setBorder(new TitledBorder("Wybor mieszkania"));
	
	Box przyciski = Box.createVerticalBox();
	przyciski.add(dodajOplate);
	przyciski.add(usunOplate);
	przyciski.add(modyfikujOplate);
	przyciski.add(archiwizujOplate);
	
	przyciski.setBorder(new TitledBorder("Menu"));
	
	tabelaOplat = new JTable(new TableModelOplaty());
	
	JScrollPane tabelaOplatScrollPane = new JScrollPane();
	tabelaOplatScrollPane.add(tabelaOplat);
	tabelaOplatScrollPane.setViewportView(tabelaOplat);
	
	tabelaOplatScrollPane.setBorder(new TitledBorder("Tabela oplat"));
	
	JPanel statystykiOplaty = new JPanel(new GridLayout(2, 2));
	JLabel zaleglosciAdministratorLabel = new JLabel("Zaleglosci - Administrator");
	zaleglosciAdministrator = new JLabel("0");
	JLabel zaleglosciWynajmujacyLabel = new JLabel("Zaleglosci - Wynajmujacy");
	zaleglosciWynajmujacy = new JLabel("0");
	
	statystykiOplaty.add(zaleglosciAdministratorLabel);
	statystykiOplaty.add(zaleglosciWynajmujacyLabel);
	statystykiOplaty.add(zaleglosciAdministrator);
	statystykiOplaty.add(zaleglosciWynajmujacy);
	
	statystykiOplaty.setBorder(new TitledBorder("Statystyki"));
	
	//Dodaje elementy do menagera widoku oplat.
		if (shouldFill) {
		    c.fill = GridBagConstraints.HORIZONTAL;
		    }
		if (shouldWeightX) {
		    c.weightx = 0.5;
		    }
		//dodaje JComboBoxa z mieszkaniami
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    c.anchor = GridBagConstraints.NORTH;
		add(comboBoxWyborMieszkan, c);
		//dodaje tabele
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 4;
		c.gridheight = 2;
		add(tabelaOplatScrollPane, c);
		//dodaje przyciski
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		add(przyciski, c);
		//dodaje statystyki
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 5;
		add(statystykiOplaty, c);
	}
	
	public void setComboBoxModel(ArrayList<String> listaMieszkan)
	{
		comboBoxWyborMieszkan.setModel(new DefaultComboBoxModel(listaMieszkan.toArray()));
	}
}
