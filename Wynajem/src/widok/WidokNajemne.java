package widok;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import model.TableModelOplaty;

public class WidokNajemne extends JPanel{
	//Tutaj stale dla GridBagLayout
		final static boolean shouldFill = true;
		final static boolean shouldWeightX = true;
		//----------------------------

		private JButton dodajNajemne;
		private JButton usunNajemne;
		private JButton modyfikujNajemne;
		private JButton archiwizujNajemne;
		private JTable tabelaNajemnego;
		private JComboBox comboBoxWyborMieszkan;
		private JLabel zaleglosciNajemne;
		private JLabel zaleglosciCalkowite;
		
		public WidokNajemne(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		dodajNajemne = new JButton("Dodaj");
		usunNajemne = new JButton("Usun");
		modyfikujNajemne = new JButton("Modyfikuj");
		archiwizujNajemne = new JButton("Archiwizuj");
		comboBoxWyborMieszkan = new JComboBox();
		
		comboBoxWyborMieszkan.setBorder(new TitledBorder("Wybor mieszkania"));
		
		Box przyciski = Box.createVerticalBox();
		przyciski.add(dodajNajemne);
		przyciski.add(usunNajemne);
		przyciski.add(modyfikujNajemne);
		przyciski.add(archiwizujNajemne);
		
		przyciski.setBorder(new TitledBorder("Menu"));
		
		tabelaNajemnego = new JTable(new TableModelOplaty());
		
		JScrollPane tabelaNajemnegoScrollPane = new JScrollPane();
		tabelaNajemnegoScrollPane.add(tabelaNajemnego);
		tabelaNajemnegoScrollPane.setViewportView(tabelaNajemnego);
		
		tabelaNajemnegoScrollPane.setBorder(new TitledBorder("Tabela najemnego"));
		
		JPanel statystykiNajemne = new JPanel(new GridLayout(2, 2));
		JLabel zaleglosciNajemneLabel = new JLabel("Zaleglosci - Najemne");
		zaleglosciNajemne = new JLabel("0");
		JLabel zaleglosciCalkowiteLabel = new JLabel("Zaleglosci - Calkowite");
		zaleglosciCalkowite = new JLabel("0");
		
		statystykiNajemne.add(zaleglosciNajemneLabel);
		statystykiNajemne.add(zaleglosciCalkowiteLabel);
		statystykiNajemne.add(zaleglosciNajemne);
		statystykiNajemne.add(zaleglosciCalkowite);
		
		statystykiNajemne.setBorder(new TitledBorder("Statystyki"));
		
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
			add(tabelaNajemnegoScrollPane, c);
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
			add(statystykiNajemne, c);
		}
}
