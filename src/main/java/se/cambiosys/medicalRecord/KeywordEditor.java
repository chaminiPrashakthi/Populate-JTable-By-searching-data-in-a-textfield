package se.cambiosys.medicalRecord;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class KeywordEditor {

	private JFrame frmKeywordEditor;
	private JLabel lblDisplayName;
	private JTextField textField;
	private JButton btnSave;
	private JButton btnCancel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeywordEditor window = new KeywordEditor();
					window.frmKeywordEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KeywordEditor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKeywordEditor = new JFrame();
		frmKeywordEditor.setTitle("Keyword editor");
		frmKeywordEditor.setBounds(100, 100, 450, 300);
		frmKeywordEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 68, 57, 146, 89, 0};
		gridBagLayout.rowHeights = new int[]{30, 23, 14, 40, 86, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmKeywordEditor.getContentPane().setLayout(gridBagLayout);
		
		lblDisplayName = new JLabel("Display Name:");
		GridBagConstraints gbc_lblDisplayName = new GridBagConstraints();
		gbc_lblDisplayName.anchor = GridBagConstraints.WEST;
		gbc_lblDisplayName.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisplayName.gridx = 1;
		gbc_lblDisplayName.gridy = 1;
		frmKeywordEditor.getContentPane().add(lblDisplayName, gbc_lblDisplayName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		frmKeywordEditor.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 1;
		frmKeywordEditor.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblTaggedConcepts = new JLabel("Tagged Concepts:");
		GridBagConstraints gbc_lblTaggedConcepts = new GridBagConstraints();
		gbc_lblTaggedConcepts.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTaggedConcepts.insets = new Insets(0, 0, 5, 5);
		gbc_lblTaggedConcepts.gridwidth = 2;
		gbc_lblTaggedConcepts.gridx = 1;
		gbc_lblTaggedConcepts.gridy = 2;
		frmKeywordEditor.getContentPane().add(lblTaggedConcepts, gbc_lblTaggedConcepts);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.gridwidth = 4;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		frmKeywordEditor.getContentPane().add(table, gbc_table);
		
		btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSave.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave.gridx = 2;
		gbc_btnSave.gridy = 4;
		frmKeywordEditor.getContentPane().add(btnSave, gbc_btnSave);
		
		btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 4;
		frmKeywordEditor.getContentPane().add(btnCancel, gbc_btnCancel);
	}

}
