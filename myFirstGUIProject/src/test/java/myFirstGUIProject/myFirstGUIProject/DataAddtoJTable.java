package myFirstGUIProject.myFirstGUIProject;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class DataAddtoJTable extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtDatabaseURL;
	private JTextField txtUserName;
	private JPasswordField passwordField;

	JRadioButton rdbtnGetCount;
	JRadioButton rdbtnCompareData;
	JLabel lblSelectTable;
	JLabel lblReportInformation;
	JLabel lblEnterModuleName;
	JLabel lblDbValidationUtility;
	JLabel lblMessage;
	JLabel lblDatabseUrl;
	JLabel lblExecutionType;
	JComboBox<String> comboBoxProjectName;
	JComboBox<String> comboBoxModuleName;
	String message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataAddtoJTable frame = new DataAddtoJTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DataAddtoJTable() {
		getContentPane().setLocale(Locale.ENGLISH);
		getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		getContentPane().setBackground(new Color(102, 102, 255));
		setTitle("DB Validdation Utility");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		getContentPane().setFont(new Font("Arial Black", Font.BOLD, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 520);

		lblEnterModuleName = new JLabel("Select Module Name:");

		comboBoxProjectName = new JComboBox<String>();

		comboBoxModuleName = new JComboBox<String>();

		lblDatabseUrl = new JLabel("Enter Data Base URL:");

		txtDatabaseURL = new JTextField();
		txtDatabaseURL.setToolTipText("");
		txtDatabaseURL.setColumns(10);

		txtUserName = new JTextField();
		txtUserName.setToolTipText("");
		txtUserName.setColumns(10);

		lblExecutionType = new JLabel("Execution Type:");

		rdbtnGetCount = new JRadioButton("Get Count ");
		rdbtnGetCount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
			}
		});
		getContentPane().setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.PREF_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.GLUE_COLSPEC,
						ColumnSpec.decode("157px"), ColumnSpec.decode("25px"), ColumnSpec.decode("max(69dlu;default)"),
						ColumnSpec.decode("25px"), ColumnSpec.decode("122px"), ColumnSpec.decode("25px"),
						ColumnSpec.decode("pref:grow"), ColumnSpec.decode("25px"), ColumnSpec.decode("default:grow"),
						ColumnSpec.decode("default:grow"), ColumnSpec.decode("max(57dlu;default):grow"),
						FormSpecs.DEFAULT_COLSPEC, ColumnSpec.decode("max(176dlu;default):grow"),
						FormSpecs.DEFAULT_COLSPEC, ColumnSpec.decode("default:grow"), FormSpecs.DEFAULT_COLSPEC,
						ColumnSpec.decode("default:grow"), ColumnSpec.decode("25px"), ColumnSpec.decode("25px"), },
				new RowSpec[] { FormSpecs.PREF_ROWSPEC, FormSpecs.PREF_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.PREF_ROWSPEC, RowSpec.decode("26px"), FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("20px:grow"), FormSpecs.DEFAULT_ROWSPEC,
						RowSpec.decode("26px"), RowSpec.decode("20px"), FormSpecs.DEFAULT_ROWSPEC,
						RowSpec.decode("20px"), FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("20px"),
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("23px"),
						FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("23px"), FormSpecs.DEFAULT_ROWSPEC,
						RowSpec.decode("55px"), RowSpec.decode("14px"), RowSpec.decode("23px"),
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

		lblDbValidationUtility = new JLabel("DB Validation Utility ");
		lblDbValidationUtility.setFont(new Font("Arial Black", Font.BOLD, 25));
		getContentPane().add(lblDbValidationUtility, "4, 3, 17, 1, center, fill");

		JLabel lblUserName = new JLabel("User Name:");
		getContentPane().add(lblUserName, "17, 4, center, default");

		JLabel lblDateTime = new JLabel("Date Time:");
		getContentPane().add(lblDateTime, "17, 5");

		JLabel lblNewLabel = new JLabel("Execution Progress Windows");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		getContentPane().add(lblNewLabel, "12, 7, 9, 1, center, default");

		JLabel lblProjectInformation = new JLabel("Project Information");
		lblProjectInformation.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		getContentPane().add(lblProjectInformation, "4, 7, center, default");

		JLabel lblSelectProjectName = new JLabel("Select Project Name:");
		getContentPane().add(lblSelectProjectName, "4, 9, right, default");

		JPanel panelExecutionWindow = new JPanel();
		getContentPane().add(panelExecutionWindow, "13, 9, 4, 19, fill, fill");

		JLabel lblDatabaseInformation = new JLabel("Database Information");
		lblDatabaseInformation.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		getContentPane().add(lblDatabaseInformation, "4, 13, center, center");

		JLabel lblEnterUserName = new JLabel("Enter User Name:");
		getContentPane().add(lblEnterUserName, "4, 16, right, default");

		lblMessage = new JLabel(message);
		lblMessage.setVisible(false);
		getContentPane().add(lblMessage, "8, 17, 2, 1");

		JLabel lblEnterPassword = new JLabel("Enter Password:");
		getContentPane().add(lblEnterPassword, "4, 18, right, default");

		passwordField = new JPasswordField();
		getContentPane().add(passwordField, "6, 18, 2, 1");

		JButton btnTestConnection = new JButton("Test Connection");
		btnTestConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				validateUserInfo(txtDatabaseURL.getText(), txtUserName.getText(), passwordField.getText());

			}
		});
		btnTestConnection.setFont(new Font("Arial", Font.BOLD, 14));
		getContentPane().add(btnTestConnection, "7, 20, 2, 1");

		JLabel lblExecutionInformation = new JLabel("Execution Information");
		lblExecutionInformation.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		getContentPane().add(lblExecutionInformation, "4, 21, center, default");
		getContentPane().add(lblExecutionType, "4, 23, right, center");
		getContentPane().add(lblEnterModuleName, "4, 11, right, center");
		getContentPane().add(lblDatabseUrl, "4, 14, right, bottom");
		getContentPane().add(rdbtnGetCount, "6, 23, fill, center");
		getContentPane().add(comboBoxProjectName, "6, 9, 3, 1, fill, top");
		getContentPane().add(comboBoxModuleName, "6, 11, 3, 1, fill, top");
		getContentPane().add(txtDatabaseURL, "6, 14, 3, 1, fill, top");
		getContentPane().add(txtUserName, "6, 16, 2, 1, default, top");

		rdbtnCompareData = new JRadioButton("Compare Data");
		getContentPane().add(rdbtnCompareData, "8, 23, fill, top");

		lblSelectTable = new JLabel("Select Table Executed:");
		getContentPane().add(lblSelectTable, "4, 25, right, default");

		List list = new List();
		getContentPane().add(list, "6, 25, 3, 6");

		lblReportInformation = new JLabel("Report Information");
		lblReportInformation.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		getContentPane().add(lblReportInformation, "13, 28, center, default");

		JLabel lblExcelReport = new JLabel("Excel Report:");
		getContentPane().add(lblExcelReport, "13, 30, right, default");

		JButton btnExecute = new JButton("Execute");
		btnExecute.setFont(new Font("Arial", Font.BOLD, 14));
		getContentPane().add(btnExecute, "8, 32");

		JLabel lblHTMLReport = new JLabel("html Report:");
		getContentPane().add(lblHTMLReport, "13, 32, right, default");
	}

	public void validateUserInfo(String connection, String userName, String pasword) {
		if (userName.equalsIgnoreCase(pasword)) {
			lblMessage.setVisible(true);
			message = "DB connection successful !!";
		} else {
			lblMessage.setVisible(true);
			message = "DB connection failed !!";
		}
	}
}
