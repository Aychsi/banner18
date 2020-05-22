import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading2 implements ActionListener {
	
	public static String r2 = "";


	Reading2() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "There is a young child next to you. You want to give him candy. You ask: ";
		JButton b9 = new JButton("사탕을 허? Satangeul heo?");
		JButton b1 = new JButton("사탕을 허요? Satangeul heoyo?");
		JButton b2 = new JButton("사탕을 허니? Satangeul heoni?");
		JButton b3 = new JButton("사탕을 허니까? Satangeul heonikka?");
		JButton b4 = new JButton("사탕을 훠? Satangeul hwo?");
		JButton b5 = new JButton("사탕을 훠요? Satangeul hwoyo?");
		JButton b6 = new JButton("사탕을 훕니까? Satangeul humnikka");
		JButton b7 = new JButton("사탕을 훕니? Satangeul humni?");
		JButton b8 = new JButton("I don't know");
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
				r2 = "b1: 사탕을 허요? Satangeul heoyo?";
				new Reading3();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b2: 사탕을 허니? Satangeul heoni?";
				new Reading3();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b3: 사탕을 허니까? Satangeul heonikka?";
				new Reading3();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b4: 사탕을 훠? Satangeul hwo?";
				new Reading3();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b5: 사탕을 훠요? Satangeul hwoyo?";
				new Reading3();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b6: 사탕을 훕니까? Satangeul humnikka";
				new Reading3();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b7: 사탕을 훕니? Satangeul humni?";
				new Reading3();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "I don't know";
				new Reading3();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r2 = "b9: 사탕을 허? Satangeul heo?";
				new Reading3();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
