import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Survey implements ActionListener {


	Survey() {

		JFrame f = new JFrame("LING270 Experiment");
		JLabel first = new JLabel("\n" + "LING270 Prof. Charles Yang" + "\n");
		JLabel second = new JLabel("\n" + "Hansoo Chang" + "\n");
		JLabel third = new JLabel("\n" + "May 2019" + "\n");
		JLabel fourth = new JLabel("\n" + "Implemented using Java Swing" + "\n");
		JLabel opf = new JLabel("\n" + "Final Research Experiment" + "\n");
		JButton n = new JButton("Continue");
		JPanel panel = new JPanel();
		Font font1 = new Font("Garamond", Font.PLAIN, 70);
		Font font2 = new Font("Garamond", Font.PLAIN, 20);
		
		first.setFont(font1);
		second.setFont(font1);
		third.setFont(font1);
		opf.setFont(font1);
		fourth.setFont(font2);
		
		f.setSize(1000, 1000);
		
		panel.setSize(400, 400);
		panel.setLocation(550, 200);
		n.setBounds(50, 50, 10, 10);
		
		panel.add(first);
		panel.add(Box.createVerticalStrut(100));
		panel.add(opf);
		panel.add(Box.createVerticalStrut(100));
		panel.add(second);
		panel.add(Box.createVerticalStrut(100));
		panel.add(third);
		panel.add(fourth);
		
		panel.add(Box.createVerticalStrut(100));
		panel.add(n);
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new UserInput();
			}
		});
		;

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");

	}

	public static void main(String args[]) {
		new Survey();
	}

}
