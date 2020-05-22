import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading4 implements ActionListener {
	
	public static String r4 = "";


	Reading4() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "You are new to work. A co-worker needs paper. You ask: ";
				
		JButton b1 = new JButton("종이 허? jongi heo?");
		JButton b3 = new JButton("종이 허요? jongi heoyo?");
		JButton b2 = new JButton("종이 허니? jongi heoni?");
		JButton b5 = new JButton("종이 허니까? jongi heonikka?");
		JButton b4 = new JButton("종이 훠? jongi hwo?");
		JButton b7 = new JButton("종이 훠요? jongi hwoyo?");
		JButton b9 = new JButton("종이 훕니까? jongi humnikka?");
		JButton b8 = new JButton("종이 훕니? jongi humni?");
		JButton b6 = new JButton("I don't know");
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
				r4 = "b1: 종이 허? jongi heo?";
				new Reading5();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b2: 종이 허니? jongi heoni?";
				new Reading5();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b3: 종이 허요? jongi heoyo?";
				new Reading5();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b4: 종이 훠? jongi hwo?";
				new Reading5();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b5: 종이 허니까? jongi heonikka?";
				new Reading5();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "I don't know";
				new Reading5();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "종이 훠요? jongi hwoyo?";
				new Reading5();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b8: 종이 훕니? jongi humni?";
				new Reading5();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r4 = "b9: 종이 훕니까? jongi humnikka?";
				new Reading5();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
