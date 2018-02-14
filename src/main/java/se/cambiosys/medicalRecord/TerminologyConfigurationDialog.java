package se.cambiosys.medicalRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TerminologyConfigurationDialog {

	private JFrame frmTerminologyConfiguration;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerminologyConfigurationDialog window = new TerminologyConfigurationDialog();
					window.frmTerminologyConfiguration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TerminologyConfigurationDialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTerminologyConfiguration = new JFrame();
		frmTerminologyConfiguration.setTitle("Terminology Configuration");
		frmTerminologyConfiguration.setBounds(100, 100, 450, 300);
		frmTerminologyConfiguration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frmTerminologyConfiguration.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Terminology Name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frmTerminologyConfiguration.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 7;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		frmTerminologyConfiguration.getContentPane().add(textField, gbc_textField);
		textField.setColumns(35);
		
		JLabel lblOid = new JLabel("OID");
		GridBagConstraints gbc_lblOid = new GridBagConstraints();
		gbc_lblOid.anchor = GridBagConstraints.WEST;
		gbc_lblOid.insets = new Insets(0, 0, 5, 5);
		gbc_lblOid.gridx = 1;
		gbc_lblOid.gridy = 2;
		frmTerminologyConfiguration.getContentPane().add(lblOid, gbc_lblOid);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 7;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		frmTerminologyConfiguration.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(35);
		
		JLabel lblUri = new JLabel("URI");
		GridBagConstraints gbc_lblUri = new GridBagConstraints();
		gbc_lblUri.anchor = GridBagConstraints.WEST;
		gbc_lblUri.insets = new Insets(0, 0, 5, 5);
		gbc_lblUri.gridx = 1;
		gbc_lblUri.gridy = 3;
		frmTerminologyConfiguration.getContentPane().add(lblUri, gbc_lblUri);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 7;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		frmTerminologyConfiguration.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(35);
		
		JLabel lblInternalTermionolgy = new JLabel("Internal Termionolgy");
		GridBagConstraints gbc_lblInternalTermionolgy = new GridBagConstraints();
		gbc_lblInternalTermionolgy.anchor = GridBagConstraints.WEST;
		gbc_lblInternalTermionolgy.gridwidth = 2;
		gbc_lblInternalTermionolgy.insets = new Insets(0, 0, 5, 5);
		gbc_lblInternalTermionolgy.gridx = 1;
		gbc_lblInternalTermionolgy.gridy = 4;
		frmTerminologyConfiguration.getContentPane().add(lblInternalTermionolgy, gbc_lblInternalTermionolgy);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 7;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 4;
		frmTerminologyConfiguration.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(35);
		
		JLabel lblDescription = new JLabel("Description");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.gridwidth = 2;
		gbc_lblDescription.anchor = GridBagConstraints.WEST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 5;
		frmTerminologyConfiguration.getContentPane().add(lblDescription, gbc_lblDescription);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 7;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 3;
		gbc_textArea.gridy = 5;
		frmTerminologyConfiguration.getContentPane().add(textArea, gbc_textArea);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.WEST;
		gbc_btnSave.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave.gridwidth = 2;
		gbc_btnSave.gridx = 3;
		gbc_btnSave.gridy = 6;
		frmTerminologyConfiguration.getContentPane().add(btnSave, gbc_btnSave);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 6;
		frmTerminologyConfiguration.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
