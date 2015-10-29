package widok_wprowadzanie_danych;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

public class OknoWprowadzaniaDanychMieszkanie extends JDialog{
	
	private String id;
	private String adres;
	private String wynajmujacy;
	
	JTextField textFieldAdres;
	JTextField textFieldWynajmujacy;
	JButton anuluj;
	JButton zatwierdz;
	
	public OknoWprowadzaniaDanychMieszkanie(JFrame owner, String adres, String wynajmujacy){
		super(owner, "Wprowadzanie danych - Mieszkanie", true);
		this.adres = adres;
		this.wynajmujacy = wynajmujacy;
		
		setLayout(null);
		JPanel panelDialogu = new JPanel(new GridLayout(3, 2));
		panelDialogu.setBorder(new EmptyBorder(10,10,10,10));
		JLabel labelAdres = new JLabel("Adres");
		JLabel labelWynajmujacy = new JLabel("Wynajmujacy");
		
		textFieldAdres = new JTextField(adres);
		textFieldWynajmujacy = new JTextField(wynajmujacy);
		
		anuluj = new JButton("Anuluj");
		zatwierdz = new JButton("Ok");
		
		panelDialogu.add(labelAdres);
		panelDialogu.add(textFieldAdres);
		panelDialogu.add(labelWynajmujacy);
		panelDialogu.add(textFieldWynajmujacy);
		panelDialogu.add(anuluj);
		panelDialogu.add(zatwierdz);
		
		setContentPane(panelDialogu);
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	};
	
	public void addController(ActionListener controller)
	{
		//zrob...
	}
	
	public JTextField getTextFieldAdres()
	{
		return textFieldAdres;
	}
	
	public JTextField getTextFieldWynajmujacy()
	{
		return textFieldWynajmujacy;
	}
	
	
}
