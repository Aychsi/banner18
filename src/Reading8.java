import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading8 implements ActionListener {
	
	public static String r8 = "";


	Reading8() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "You are in line at a restaurant. The person in front of you looks younger than"
				+ " you. He has the menu, and you would like to see it. You say: ";
				
		JButton b4 = new JButton("메뉴를 허. menyureul heo.");
		JButton b3 = new JButton("메뉴를 허요. menyureul heoyo.");
		JButton b2 = new JButton("메뉴를 허라. menyureul heora.");
		JButton b1 = new JButton("메뉴를 허십시오. menyureul heoshipshioh.");
		JButton b5 = new JButton("메뉴를 훠. menyureul hwo.");
		JButton b6 = new JButton("메뉴를 허세요. menyureul hwoseyo.");
		JButton b7 = new JButton("메뉴를 훕어라. menyureul hubeora.");
		JButton b8 = new JButton("메뉴를 훕으십시오. menyureul hubeushibshioh.");
		JButton b9 = new JButton("I don't know");
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
				r8 = "b1: 메뉴를 허십시오. menyureul heoshipshioh.";
				new Reading9();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b2: 메뉴를 허라. menyureul heora.";
				new Reading9();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b3: 메뉴를 허요. menyureul heoyo.";
				new Reading9();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b4: 메뉴를 허. menyureul heo.";
				new Reading9();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b5: 메뉴를 훠. menyureul hwo.";
				new Reading9();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b6: 메뉴를 허세요. menyureul hwoseyo.";
				new Reading9();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b7: 메뉴를 훕어라. menyureul hubeora.";
				new Reading9();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "b8: 메뉴를 훕으십시오. menyureul hubeushibshioh.";
				new Reading9();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r8 = "I don't know";
				new Reading9();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
