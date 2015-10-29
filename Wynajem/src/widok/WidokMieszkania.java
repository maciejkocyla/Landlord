package widok;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.TableModelListener;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Box;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;

import typy_do_komunikacji_bd.WierszMieszkanie;
import model.TableModelMieszkania;

public class WidokMieszkania extends javax.swing.JPanel implements Observer{

//Tutaj stale dla GridBagLayout
final static boolean shouldFill = true;
final static boolean shouldWeightX = true;
//----------------------------

private JButton dodajMieszkanie;
private JButton edytujMieszkanie;
private JButton usunMieszkanie;
private JTable tabelaMieszkan;

public WidokMieszkania(){
	setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	dodajMieszkanie = new JButton("Dodaj");
	edytujMieszkanie = new JButton("Modyfikuj");
	usunMieszkanie = new JButton("Usun");
	
	Box przyciski = Box.createVerticalBox();
	przyciski.add(dodajMieszkanie);
	przyciski.add(usunMieszkanie);
	przyciski.add(edytujMieszkanie);
	
	tabelaMieszkan = new JTable(new TableModelMieszkania());
	
	przyciski.setBorder(new TitledBorder("Menu"));

	JScrollPane tabelaMieszkanScrollPane = new JScrollPane();
	tabelaMieszkanScrollPane.add(tabelaMieszkan);
	tabelaMieszkanScrollPane.setViewportView(tabelaMieszkan);
	
	tabelaMieszkanScrollPane.setBorder(new TitledBorder("Tabela Mieszkan"));

	//Dodaje przyciski i tabele do menagera widoku mieszknaia.
	if (shouldFill) {
	    c.fill = GridBagConstraints.HORIZONTAL;
	    }
	if (shouldWeightX) {
	    c.weightx = 0.5;
	    }
	//dodaje przyciski
	c.fill = GridBagConstraints.BOTH;
    c.gridx = 0;
    c.gridy = 0;
    c.anchor = GridBagConstraints.NORTH;
	add(przyciski, c);
	//dodaje tabele
	c.fill = GridBagConstraints.BOTH;
	c.gridx = 1;
	c.gridy = 0;
	c.gridwidth = 3;
	add(tabelaMieszkanScrollPane, c);
	}

//Dodawanie kontrolerow
public void addControllerMieszkaniaTabela(TableModelListener tableController){
	tabelaMieszkan.getModel().addTableModelListener(tableController);
	}

public void addControllerMieszkaniaPrzyciski(ActionListener przyciskDodajController){
	dodajMieszkanie.addActionListener(przyciskDodajController);
	}
//------------------------

//Update
public void update(Observable obs, Object obj) {
	
	}
}

