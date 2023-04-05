package inc.soft.advpaint.x64.figures;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class editor extends JPanel implements MouseListener{
	/**
	 * 
	 * 
	 */
	public ArrayList<figure> figs;
	private Point P;
	private Segment S;
	private Cercle C;
	private polygon G;
	private figure currentstate;
	private static final long serialVersionUID = 1L;
	public editor() {
		figs = new ArrayList<figure>();
		this.P = new Point("",0,0);
		this.S = new Segment("",null,null);
		this.C = new Cercle("",null,0);
		this.G = new polygon("",null);
		P.setEdit(this);
		S.setEdit(this);
		C.setEdit(this);
		G.setEdit(this);

	}
	public static void main(String[] args) {
		JFrame fr = new JFrame("editeur");
		fr.setSize(new Dimension(800,600));
		fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		Container cont = fr.getContentPane();
		editor co2 = new editor();
		JPanel co = new JPanel();
		co.setBackground(Color.blue);
		co.setLayout(new FlowLayout());
		co.setPreferredSize(new Dimension(170,0));
		co2.setBackground(Color.white);
		JButton j = new JButton("point");
		j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (MouseListener m :  co2.getMouseListeners()) {
					co2.removeMouseListener(m);
					
				}
				co2.currentstate = co2.P;
				
				co2.addMouseListener(co2.currentstate);
				
			}
			
		});
		
		JButton j1 = new JButton("segment");
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (MouseListener m :  co2.getMouseListeners()) {
					co2.removeMouseListener(m);
					
				}
				co2.currentstate = co2.S;
				co2.addMouseListener(co2.currentstate);	
			}
			
		});
		JButton j2 = new JButton("cercle");
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (MouseListener m :  co2.getMouseListeners()) {
					co2.removeMouseListener(m);
					
				}
				co2.currentstate = co2.C;
				co2.addMouseListener(co2.currentstate);	
			}
			
		});
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
		Point p  = new Point("test",50,200);
		co2.figs.add(p);
		cont.add(co, BorderLayout.EAST);
		cont.add(co2,BorderLayout.CENTER);
		fr.setVisible(true);
		cont.addMouseListener(co2.currentstate);
		

	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (figure ele : figs) {
			ele.Paint(g);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
