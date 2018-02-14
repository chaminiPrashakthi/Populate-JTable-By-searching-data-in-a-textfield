package se.cambiosys.medicalRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchDialog {

	private JFrame frame;
	public static JTextField textField;
	private JTable table;
	private static DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchDialog window = new SearchDialog();
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
	public SearchDialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 41, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblTerminology = new JLabel("Terminology");
		GridBagConstraints gbc_lblTerminology = new GridBagConstraints();
		gbc_lblTerminology.anchor = GridBagConstraints.WEST;
		gbc_lblTerminology.insets = new Insets(0, 0, 5, 5);
		gbc_lblTerminology.gridx = 0;
		gbc_lblTerminology.gridy = 0;
		frame.getContentPane().add(lblTerminology, gbc_lblTerminology);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 0;
		comboBox.setEditable(false);
		comboBox.setSelectedItem("SNOMED");
		frame.getContentPane().add(comboBox, gbc_comboBox);

		JButton btnBind = new JButton("Bind");

		JLabel lblTerm = new JLabel("Term");
		GridBagConstraints gbc_lblTerm = new GridBagConstraints();
		gbc_lblTerm.anchor = GridBagConstraints.WEST;
		gbc_lblTerm.insets = new Insets(0, 0, 5, 5);
		gbc_lblTerm.gridx = 0;
		gbc_lblTerm.gridy = 1;
		frame.getContentPane().add(lblTerm, gbc_lblTerm);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(35);

		JButton btnSearch = new JButton("Search");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnSearch.gridx = 4;
		gbc_btnSearch.gridy = 1;
		frame.getContentPane().add(btnSearch, gbc_btnSearch);
		btnSearch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tableModel.setRowCount(0);
				setDataToTable();
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Definition", "Name" });
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
		GridBagConstraints gbc_btnBind = new GridBagConstraints();
		gbc_btnBind.anchor = GridBagConstraints.WEST;
		gbc_btnBind.insets = new Insets(0, 0, 0, 5);
		gbc_btnBind.gridx = 2;
		gbc_btnBind.gridy = 3;
		frame.getContentPane().add(btnBind, gbc_btnBind);

		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.WEST;
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 3;
		frame.getContentPane().add(btnCancel, gbc_btnCancel);
	}

	public static void setDataToTable() {
		ArrayList<BindData> bindDetails = new ArrayList<BindData>();
		bindDetails.add(new BindData("A160", "A160"));
		bindDetails.add(new BindData("A161", "A161"));
		bindDetails.add(new BindData("A162", "A162"));
		bindDetails.add(new BindData("A163", "A163"));
		bindDetails.add(new BindData("A164", "A164"));
		bindDetails.add(new BindData("A260", "A260"));
		bindDetails.add(new BindData("B160", "B160"));
		bindDetails.add(new BindData("B161", "B161"));
		bindDetails.add(new BindData("B162", "B162"));

		for (int i = 0; i < bindDetails.size(); i++) {
			String name = bindDetails.get(i).getName();
			String def = bindDetails.get(i).getDefinition();
			String searchVal =textField.getText();
			Object[] data = { name, def };
				if(searchVal.equals(name.substring(0, searchVal.length()))) {
					System.out.println(true);
					tableModel.addRow(data);
			}

		}

	}
}
