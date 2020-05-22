import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading3 implements ActionListener {
	
	public static String r3 = "";


	Reading3() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your roommate looks thirsty. "
				+ "You are a kindhearted person. You ask: ";
		JButton b8 = new JButton("음료수 허? eumnyosu heo?");
		JButton b9 = new JButton("음료수 허요? eumnyosu heoyo?");
		JButton b1 = new JButton("음료수 허니? eumnyosu heoni?");
		JButton b2 = new JButton("음료수 허니까? eumnyosu heonikka?");
		JButton b3 = new JButton("음료수 훠? eumnyosu hwo?");
		JButton b4 = new JButton("음료수 훠요? eumnyosu hwoyo?");
		JButton b5 = new JButton("음료수 훕니까? eumnyosu humnikka");
		JButton b6 = new JButton("음료수 훕니? eumnyosu humni?");
		JButton b7 = new JButton("I don't know");
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea(2, 40);
		textArea.setText(s);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setFocusable(false);
		Font font1 = new Font("Garamond", Font.PLAIN, 20);
		
		textArea.setFont(font1);
		
		
		f.setSize(1000, 1000);
		
		
		panel.setSize(400, 400);
		panel.setLocation(550, 200);
		
		panel.add(textArea);
		panel.add(Box.createHorizontalStrut(200));
		panel.add(Box.createVerticalStrut(100));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);		
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		
		
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b1: 음료수 허니? eumnyosu heoni?";
				new Reading4();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b2: 음료수 허니까? eumnyosu heonikka?";
				new Reading4();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b3: 음료수 훠? eumnyosu hwo?";
				new Reading4();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b4: 음료수 훠요? eumnyosu hwoyo?";
				new Reading4();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b5: 음료수 훕니까? eumnyosu humnikka?";
				new Reading4();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b6: 음료수 훕니? eumnyosu humni?";
				new Reading4();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "I don't know";
				new Reading4();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b8: 음료수 허? eumnyosu heo?";
				new Reading4();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r3 = "b9: 음료수 허요? eumnyosu heoyo?";
				new Reading4();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
