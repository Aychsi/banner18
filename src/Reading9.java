import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading9 implements ActionListener {
	
	public static String r9 = "";


	Reading9() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "It's almost Christmas, and your little sister wants a doll. You say to her: ";
				
		JButton b1 = new JButton("인형을 허 거야. inhyeongeul heo geoya.");
		JButton b2 = new JButton("인형을 허 거예요. inhyeongeul heo geoyeyo.");
		JButton b3 = new JButton("인형을 허 거다. inhyeongeul heo geoda.");
		JButton b4 = new JButton("인형을 허 겁니다. inhyeongeul heo geomnida.");
		JButton b5 = new JButton("인형을 헐 거야. inhyeongeul heol geoya.");
		JButton b6 = new JButton("인형을 헐 거예요. inhyeongeul heol geoyeyo.");
		JButton b7 = new JButton("인형을 헐 거다. inhyeongeul heol geoda.");
		JButton b8 = new JButton("인형을 헐 겁니다. inhyeongeul heol geomnida.");
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
				r9 = "b1: 인형을 허 거야. inhyeongeul heo geoya.";
				new Reading10();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b2: 인형을 허 거예요. inhyeongeul heo geoyeyo.";
				new Reading10();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b3: 인형을 허 거다. inhyeongeul heo geoda.";
				new Reading10();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b4: 인형을 허 겁니다. inhyeongeul heo geomnida.";
				new Reading10();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b5: 인형을 헐 거야. inhyeongeul heol geoya.";
				new Reading10();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b6: 인형을 헐 거예요. inhyeongeul heol geoyeyo.";
				new Reading10();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b7: 인형을 헐 거다. inhyeongeul heol geoda.";
				new Reading10();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "b8: 인형을 헐 겁니다. inhyeongeul heol geomnida.";
				new Reading10();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r9 = "I don't know";
				new Reading10();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
