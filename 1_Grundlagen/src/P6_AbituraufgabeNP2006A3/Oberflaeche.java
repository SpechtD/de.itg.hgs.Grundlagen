package P6_AbituraufgabeNP2006A3;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Oberflaeche extends JFrame implements ActionListener {
	private static final long	serialVersionUID	= 1L;
	private Steuerung	      dieSteuerung;
	private JPanel	          contentPane;
	private JButton	          btnEtikettDrucken;
	private JLabel	          lblAuftragsnummer;
	private JTextField	      tfAuftragsnummer;
	private PanelEtikett	  etikett;
	private JPanel	          panelStatus;
	private JLabel	          lbl;
	private JLabel	          lblStatus;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oberflaeche frame = new Oberflaeche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Oberflaeche() {
		dieSteuerung = new Steuerung(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		btnEtikettDrucken = new JButton("Etikett drucken");
		btnEtikettDrucken.addActionListener(this);
		panel.add(btnEtikettDrucken);
		lblAuftragsnummer = new JLabel("Auftragsnummer:");
		panel.add(lblAuftragsnummer);
		tfAuftragsnummer = new JTextField();
		panel.add(tfAuftragsnummer);
		tfAuftragsnummer.setColumns(10);
		panelStatus = new JPanel();
		contentPane.add(panelStatus, BorderLayout.NORTH);
		lbl = new JLabel("Status:");
		panelStatus.add(lbl);
		lblStatus = new JLabel("");
		panelStatus.add(lblStatus);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEtikettDrucken) {
			System.out.println("Etikett drucken geklickt");
			erstelleEtikettClick();
		}
	}

	private void erstelleEtikettClick() {
		dieSteuerung.erstelleEtikett(holeAuftragsNummer());
	}

	private int holeAuftragsNummer() {
		int nr = -1;
		String auftrNrTxt = tfAuftragsnummer.getText();
		try {
			nr = Integer.parseInt(auftrNrTxt);
			System.out.println("Auftragsnummer" + nr + " gelesen.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nr;
	}

	public void loescheEtikett() {
		contentPane.remove(etikett);
		contentPane.revalidate();
		contentPane.repaint();
		zeigeStatus("Etikett gel�scht");
	}

	public void zeigeEtikett(PanelEtikett einEtikett) {
		etikett = einEtikett;
		contentPane.add(etikett, BorderLayout.CENTER);
		contentPane.revalidate();
	}

	public void zeigeStatus(String meldung) {
		lblStatus.setText(meldung);
	}
}
