import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.*;

public class UserInput implements ActionListener {

	public static String name = "";
	public static String age = "";
	public static String prof = "";
	public static String gender = "";
	public static String read = "";


	UserInput() {

		JFrame f = new JFrame("LING270 Experiment");
		JLabel lName = new JLabel("Name (Press Enter when done): ");
		JLabel lAge = new JLabel("Age (Press Enter when done): ");
		JLabel lProf = new JLabel("Level of Korean Proficiency: ");
		JLabel lGender = new JLabel("Gender: ");
		JLabel lRead = new JLabel("Can you Read Korean? ");
		JButton n = new JButton("Finished");
		JButton gm = new JButton("Male");
		JButton gf = new JButton("Female");
		JButton fluent = new JButton("Fluent");
		JButton familiar = new JButton("Familiar");
		JButton elementary = new JButton("Elementary");
		JButton yes = new JButton("Can Read Korean");
		JButton no = new JButton("Cannot Read Korean");
		JPanel panel = new JPanel();
		Font font1 = new Font("Garamond", Font.PLAIN, 15);
		
		lName.setFont(font1);
		lAge.setFont(font1);
		lProf.setFont(font1);
		lGender.setFont(font1);
		lRead.setFont(font1);
		
		f.setSize(1000, 1000);
		
		// Input User Data 
		JTextField jName = new JTextField(30); 
		JTextField jAge = new JTextField(30);
		
		panel.setSize(400, 400);
		panel.setLocation(550, 200);
		n.setBounds(50, 50, 10, 10);
		
		// name entry
		panel.add(lName);
		panel.add(jName);
		// age entry
		panel.add(Box.createHorizontalStrut(375));
		panel.add(lAge);
		panel.add(jAge);
		//gender entry
		panel.add(Box.createHorizontalStrut(360));
		panel.add(lGender);
		panel.add(gm);
		panel.add(gf);
		
		
		panel.add(Box.createHorizontalStrut(700));
		
		// Korean  Levels
		panel.add(lProf);
		panel.add(fluent);
		panel.add(familiar);
		panel.add(elementary);
		
		// can you read
		panel.add(Box.createHorizontalStrut(315));
		panel.add(lRead);
		panel.add(yes);
		panel.add(no);
		panel.add(Box.createHorizontalStrut(400));
		
		panel.add(n);
		
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		jName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String input = jName.getText();
				name = input;
			}
		});
		
		jAge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				String input = jAge.getText();
				age = input;
			}
		});
		;
		
		gm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				gender = "Male";
			}
		});
		;

		gf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				gender = "Female";
				
			}
		});
		;
		fluent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				prof = "Fluent";
			}
		});
		;

		familiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				prof = "Familiar";
			}
		});

		elementary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				prof = "Elementary";
			}
		});
		;

		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				read = "Can read Korean";
			}
		});
		;

		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				read = "Can NOT read Korean";
			}
		});
		;
		
		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new Instructions();
			}
		});
		;

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");

	}


}
