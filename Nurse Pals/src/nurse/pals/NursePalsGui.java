package nurse.pals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class NursePalsGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JTextField txtSigText;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NursePalsGui window = new NursePalsGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NursePalsGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 67, 193, 510);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea txtrPatienSummary = new JTextArea();
		txtrPatienSummary.setText("Patient Summary\nLast Name: Doe\nFirst Name: John \nDOB: 1967/4/23\nRoom:301");
		txtrPatienSummary.setBounds(6, 6, 181, 498);
		panel.add(txtrPatienSummary);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(278, 67, 646, 510);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Patient Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPatientSearch = new JLabel("Patient Search");
		lblPatientSearch.setBounds(272, 14, 88, 16);
		panel_1.add(lblPatientSearch);
		
		textField = new JTextField();
		textField.setBounds(47, 80, 130, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 80, 130, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(331, 80, 130, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(47, 55, 77, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(194, 53, 77, 16);
		panel_1.add(lblLastName);
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(333, 53, 61, 16);
		panel_1.add(lblSsn);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(47, 112, 61, 16);
		panel_1.add(lblAddress);
		
		textField_3 = new JTextField();
		textField_3.setBounds(47, 140, 272, 26);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(483, 80, 117, 29);
		panel_1.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(47, 194, 548, 244);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("RX", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnEnter = new JButton("Summary");
		btnEnter.setBounds(23, 242, 117, 29);
		panel_2.add(btnEnter);
		
		txtSigText = new JTextField();
		txtSigText.setText("Sig text blah");
		txtSigText.setBounds(165, 208, 440, 94);
		panel_2.add(txtSigText);
		txtSigText.setColumns(10);
		
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(165, 88, 130, 29);
		panel_2.add(comboBox);
		
		JLabel lblChooseRxType = new JLabel("RX Type");
		lblChooseRxType.setBounds(23, 93, 110, 16);
		panel_2.add(lblChooseRxType);
		
		JLabel lblRxName = new JLabel("RX Name");
		lblRxName.setBounds(23, 38, 61, 16);
		panel_2.add(lblRxName);
		
		textField_5 = new JTextField();
		textField_5.setBounds(165, 33, 130, 26);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRxStrenght = new JLabel("Strength");
		lblRxStrenght.setBounds(23, 66, 61, 16);
		panel_2.add(lblRxStrenght);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(165, 61, 130, 26);
		panel_2.add(textField_6);
		
		JLabel lblQty = new JLabel("Dispense Qty");
		lblQty.setBounds(23, 123, 92, 16);
		panel_2.add(lblQty);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(165, 118, 130, 26);
		panel_2.add(textField_7);
		
		JLabel lblPersname = new JLabel("Prescriber Name");
		lblPersname.setBounds(341, 35, 110, 16);
		panel_2.add(lblPersname);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(480, 30, 130, 26);
		panel_2.add(textField_8);
		
		JLabel lblDea = new JLabel("DEA #");
		lblDea.setBounds(341, 63, 61, 16);
		panel_2.add(lblDea);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(480, 58, 130, 26);
		panel_2.add(textField_9);
		
		JLabel lblPrescriberAddress = new JLabel("Prescriber Address");
		lblPrescriberAddress.setBounds(341, 96, 130, 16);
		panel_2.add(lblPrescriberAddress);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(480, 91, 130, 26);
		panel_2.add(textField_10);
		
		JLabel lblPhone = new JLabel("Phone #");
		lblPhone.setBounds(341, 128, 61, 16);
		panel_2.add(lblPhone);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(480, 123, 130, 26);
		panel_2.add(textField_11);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(341, 161, 130, 16);
		panel_2.add(lblDate);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(480, 156, 130, 26);
		panel_2.add(textField_12);
		
		JLabel lblSig = new JLabel("Sig");
		lblSig.setBounds(23, 208, 61, 16);
		panel_2.add(lblSig);
		
		JLabel lblRefill = new JLabel("Refill");
		lblRefill.setBounds(23, 161, 61, 16);
		panel_2.add(lblRefill);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(165, 156, 130, 26);
		panel_2.add(textField_13);
		
		JTextArea txtrRxNamePrednisone = new JTextArea();
		txtrRxNamePrednisone.setText("RX Name: Prednisone ");
		txtrRxNamePrednisone.setBounds(26, 314, 573, 124);
		panel_2.add(txtrRxNamePrednisone);
		
		JButton btnEnter_1 = new JButton("Enter");
		btnEnter_1.setBounds(23, 273, 117, 29);
		panel_2.add(btnEnter_1);
		
		JLabel lblRx = new JLabel("RX");
		lblRx.setBounds(310, 6, 16, 16);
		panel_2.add(lblRx);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Administer RX", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblPrescriptions = new JLabel("Prescription");
		lblPrescriptions.setBounds(45, 44, 82, 16);
		panel_3.add(lblPrescriptions);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(167, 40, 122, 27);
		panel_3.add(comboBox_1);
		
		JTextArea txtrRxNamePrednisone_1 = new JTextArea();
		txtrRxNamePrednisone_1.setText("RX Name: Prednisone\nStrength: 20mg\nRx Type: Tablet\nInstructions: \n1 Tablet by mouth daily");
		txtrRxNamePrednisone_1.setBounds(45, 86, 494, 85);
		panel_3.add(txtrRxNamePrednisone_1);
		
		JLabel lblCalculate = new JLabel("Calculate ");
		lblCalculate.setBounds(45, 201, 82, 16);
		panel_3.add(lblCalculate);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		
		JLabel lblCurrentDate = new JLabel("Current Date & Time");
		lblCurrentDate.setBounds(779, 586, 145, 16);
		frame.getContentPane().add(lblCurrentDate);
		
		JLabel lblCurrentUser = new JLabel("Current User");
		lblCurrentUser.setBounds(817, 6, 79, 16);
		frame.getContentPane().add(lblCurrentUser);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(807, 20, 94, 29);
		frame.getContentPane().add(btnLogOut);
	}

	public JTextField getTxtSigText() {
		return txtSigText;
	}

	public void translate() {
		// TODO Auto-generated method stub
		
	}
}
