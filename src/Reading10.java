import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading10 implements ActionListener {
	
	public static String r10 = "";


	Reading10() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your professor wants your paper next week. You say to him: ";
				
		JButton b9 = new JButton("수필을 허 거야. supireul heo geoya.");
		JButton b8 = new JButton("수필을 허 거예요. supireul heo geoyeyo.");
		JButton b1 = new JButton("수필을 허 거다. supireul heo geoda.");
		JButton b2 = new JButton("수필을 허 겁니다. supireul heo geomnida.");
		JButton b3 = new JButton("수필을 헐 거야. supireul heol geoya.");
		JButton b4 = new JButton("수필을 헐 거예요. supireul heol geoyeyo.");
		JButton b5 = new JButton("수필을 헐 거다. supireul heol geoda.");
		JButton b6 = new JButton("수필을 헐 겁니다. supireul heol geomnida.");
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
				r10 = "b1: 수필을 허 거다. supireul heo geoda.";
				new Reading11();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b2: 수필을 허 겁니다. supireul heo geomnida.";
				new Reading11();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b3: 수필을 헐 거야. supireul heol geoya.";
				new Reading11();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b4: 수필을 헐 거예요. supireul heol geoyeyo..";
				new Reading11();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b5: 수필을 헐 거다. supireul heol geoda";
				new Reading11();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b6: 수필을 헐 겁니다. supireul heol geomnida.";
				new Reading11();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "I don't know";
				new Reading11();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "b8: 수필을 허 거예요. supireul heo geoyeyo.";
				new Reading11();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r10 = "수필을 허 거야. supireul heo geoya.";
				new Reading11();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
