import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;

import java.util.ArrayList;


public class Employee extends JFrame implements ActionListener {
  
  /*=============================
    Creating Components 
  ===============================*/

  private Container container;
  private JLabel title;
  private JLabel name;
  private JTextField tname;
  private JLabel mobile;
  private JTextField tmobile;
  private JLabel gender;
  private JRadioButton male;
  private JRadioButton female;
  private ButtonGroup gengp;
  private JLabel dob;
  private JComboBox date;
  private JComboBox month;
  private JComboBox year;
  private JLabel address;
  private JTextArea taddress;
  private JCheckBox term;
  private JButton submit;
  private JButton reset;
  private JTextArea tout;
  private JLabel responseMsg;
  private JTextArea resadd;

  private String dates[]
    = { "1", "2", "3", "4", "5",
      "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15",
      "16", "17", "18", "19", "20",
      "21", "22", "23", "24", "25",
      "26", "27", "28", "29", "30",
      "31" };
  private String months[]
    = { "Jan", "feb", "Mar", "Apr",
      "May", "Jun", "July", "Aug",
      "Sup", "Oct", "Nov", "Dec" };
  private String years[]
    = { "1995", "1996", "1997", "1998",
      "1999", "2000", "2001", "2002",
      "2003", "2004", "2005", "2006",
      "2007", "2008", "2009", "2010",
      "2011", "2012", "2013", "2014",
      "2015", "2016", "2017", "2018",
      "2019","2020","2021","2022" };

  Employee() {
    super("Registration Form");
    this.setBounds(300, 90, 900, 600);
    // this.setSize(900,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
    ImageIcon image = new ImageIcon("logo1.png");    
    this.setIconImage(image.getImage());     
    this.getContentPane().setBackground(new Color(0xf1f5f9));    


		container = getContentPane();
    container.setLayout(null);

    title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

	  name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		container.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		container.add(tname);

    mobile = new JLabel("Mobile");
		mobile.setFont(new Font("Arial", Font.PLAIN, 20));
		mobile.setSize(100, 20);
		mobile.setLocation(100, 150);
		container.add(mobile);

		tmobile = new JTextField();
		tmobile.setFont(new Font("Arial", Font.PLAIN, 15));
		tmobile.setSize(150, 20);
		tmobile.setLocation(200, 150);
		container.add(tmobile);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		container.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		container.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		container.add(female);

    gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		container.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		container.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		container.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		container.add(year);

    address = new JLabel("Address");
		address.setFont(new Font("Arial", Font.PLAIN, 20));
		address.setSize(100, 20);
		address.setLocation(100, 300);
		container.add(address);

		taddress = new JTextArea();
		taddress.setFont(new Font("Arial", Font.PLAIN, 15));
		taddress.setSize(200, 75);
		taddress.setLocation(200, 300);
		taddress.setLineWrap(true);
		container.add(taddress);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		container.add(term);

		submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 15));
		submit.setSize(100, 20);
		submit.setLocation(150, 450);
		submit.addActionListener(this);
		container.add(submit);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		container.add(reset);

    tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		container.add(tout);

    responseMsg = new JLabel("");
		responseMsg.setFont(new Font("Arial", Font.PLAIN, 20));
		responseMsg.setSize(500, 25);
		responseMsg.setLocation(100, 500);
		container.add(responseMsg);

    resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		container.add(resadd);

		this.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {
			if (term.isSelected()) {

				String name = "Name : " + tname.getText();
        String mobile = "\nMobile : " + tmobile.getText();
				String gen = "";
        if (male.isSelected())
					gen = "\nGender : Male";
				else
          gen = "\nGender : Femaile";

				String dob = "\nDOB : "
				  + date.getSelectedItem()
					+ "/" + month.getSelectedItem()
					+ "/" + year.getSelectedItem();

			  String addr = "\nAddress : " + taddress.getText();

				tout.setText(name + mobile + gen + dob + addr);
				tout.setEditable(false);
				responseMsg.setText("Registration Successfully..");
			}
			else {
				tout.setText("");
				resadd.setText("");
				responseMsg.setText("Please accept the terms & conditions !!");
			}
		} else if (e.getSource() == reset) {
			String blank = "";
			tname.setText(blank);
			taddress.setText(blank);
			tmobile.setText(blank);
			responseMsg.setText(blank);
			tout.setText(blank);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(blank);
		}
  }

  public static void main(String[] args) {
    new Employee();
  }
}