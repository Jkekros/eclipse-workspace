package inc.soft.advpaint.x64.figures;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame();
		
		fr.setSize(new Dimension(800,600));
		fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		Container cont = fr.getContentPane();
		JPanel co2 = new JPanel();
		JPanel co = new JPanel();
		co.setBackground(Color.blue);
		co.setLayout(new FlowLayout());
		co.setPreferredSize(new Dimension(170,0));
		co2.setBackground(Color.red);
		JButton j = new JButton("point");
		JButton j1 = new JButton("segment");
		JButton j2 = new JButton("cercle");
		JButton j3 = new JButton("polygon");
		j.setPreferredSize(new Dimension(150,40));
		j1.setPreferredSize(new Dimension(150,40));
		j2.setPreferredSize(new Dimension(150,40));
		j3.setPreferredSize(new Dimension(150,40));
		co.add(j);
		co.add(j1);
		co.add(j2);
		co.add(j3);
		/* ne pas faire hériter la classe editeur de JFrame mais de JPanel */
		
		cont.add(co, BorderLayout.EAST);
		cont.add(co2,BorderLayout.CENTER);
		fr.setVisible(true);
		
	}
	
	

}
