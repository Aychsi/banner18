import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Listening2 implements ActionListener {
	
	public static String l2 = "";
	public static final String AUDIO1 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-1.wav";
	public static final String AUDIO2 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-2.wav";
	public static final String AUDIO3 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-3.wav";
	public static final String AUDIO4 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-4.wav";
	public static final String AUDIO5 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-5.wav";
	public static final String AUDIO6 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-6.wav";
	public static final String AUDIO7 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-7.wav";
	public static final String AUDIO8 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L2-8/L2-8.wav"; 
	
	AudioPlayer MusicObject = new AudioPlayer();


	Listening2() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "A younger student needs a pencil. You ask: ";
				
		JButton b1 = new JButton("Play audio 1");
		JButton b2 = new JButton("Play audio 2");
		JButton b3 = new JButton("Play audio 3");
		JButton b4 = new JButton("Play audio 4");
		JButton b5 = new JButton("Play audio 5");
		JButton b6 = new JButton("Play audio 6");
		JButton b7 = new JButton("Play audio 7");
		JButton b8 = new JButton("Play audio 8");
		
		JButton b11 = new JButton("Choose: 1");
		JButton b22 = new JButton("Choose: 2");
		JButton b33 = new JButton("Choose: 3");
		JButton b44 = new JButton("Choose: 4");
		JButton b55 = new JButton("Choose: 5");
		JButton b66 = new JButton("Choose: 6");
		JButton b77 = new JButton("Choose: 7");
		JButton b88 = new JButton("Choose: 8");
		
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
		
		panel.add(b11);
		panel.add(b22);
		panel.add(b33);
		panel.add(b44);
		panel.add(b55);		
		panel.add(b66);
		panel.add(b77);
		panel.add(b88);
		
		panel.add(Box.createHorizontalStrut(150));
		panel.add(Box.createVerticalStrut(100));
		
		panel.add(b9);
		
		
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO1);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO2);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO3);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO4);
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO5);
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO6);
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO7);
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO8);
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "I don't know";
				new Listening3();
			}
		});
		
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b1: 연필을 허?";
				new Listening3();
			}
		});
		
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b2: 연필을을 허요?";
				
				new Listening3();
			}
		});
		
		b33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b3: 연필을 허니?";
				
				new Listening3();
			}
		});
		b44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b4: 연필을 허니까?";
				
				new Listening3();
			}
		});
		b55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b5: 연필을을 훠?";
				
				new Listening3();
			}
		});
		b66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b6: 연필을 훠요?";
				
				new Listening3();
			}
		});
		b77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b7: 연필을 훕니까?";
				
				new Listening3();
			}
		});
		b88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l2 = "b8: 연필을 훕니?";
				new Listening3();
			}
		});

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
		
	}



}
