package inc.soft.advpaint.x64.figures;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class Test {
	public static void  teststucture() {
		ArrayList<figure> list = new ArrayList<figure>();
		list.add(new Point("hello",5,20));
		list.add(new Cercle("world", (Point)list.get(0), 20));
		System.out.println("test structure de données");
		
		System.out.println( list.get(0) instanceof Point);
	}
	public static void serializabletest() throws FileNotFoundException, IOException, ClassNotFoundException {
		Point p = new Point("hello world", 15,3);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file"));
		out.writeObject(p);
		out.flush();
		out.close();
		
		p.setX(123);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file"));
		Point p2 = (Point)in.readObject();
		System.out.println("test serialization");
		System.out.println(p.tostring());
		System.out.println(p2.tostring());
		
	}
	public static void testPoint() {
		Point p = new Point("test",10,15);
		System.out.println(p.tostring());
		p.Translate(5, 5);
		System.out.println(p.tostring());
		p.affichage();
	}
	public static void testseg() {
		Segment s = new Segment("test",new Point("p1",10,15),new Point("p2",20,35));
		System.out.println(s.tostring());
		s.Translate(5, 5);
		System.out.println(s.tostring());
		
		s.affichage();
		
	}
	public static void testcercle() {
		Cercle c = new Cercle("test",new Point("tes",15,20),20);
		System.out.println(c.tostring());
		c.Translate(5, 5);
		System.out.println(c.tostring());
		
		c.affichage();
		c = new Cercle("test",new Point("p1",10,15),new Point("p2",20,35));
		System.out.println(c.tostring());
		c.Translate(5, 5);
		System.out.println(c.tostring());
		
		c.affichage();
	}
	public static void testpointnomme() {
		PointNomme p1 = new PointNomme("hello", 10, 15);
		PointNomme p2 = new PointNomme("world", 10, 15);
		Point pn1 = p1;
		Point pn2 = p2;
		System.out.println("p1: "+ p1.getNom()+" and p2: "+p2.getNom()+"  "+pn1.tostring()+"  "+pn2.tostring());
	}
	public static void testsegnomme() {
		
		PointNomme p1 = new PointNomme("hello", 10, 15);
		PointNomme p2 = new PointNomme("world", 5, 22);
		Point pn1 = p1;
		Point pn2 = p2;
		Segment seg1 = new Segment("test",pn1,pn2);
		System.out.println(seg1.tostring());
		System.out.println("test polymorphisme");
		Segment seg = new Segment("hellard", p1, p2);
		
		System.out.println(seg.tostring());
	}
	public static void clonetest() {
		Point p = new Point(null, 20, 15);
		Point p2 = null;
		p2 = p.clone();
		p2.setX(55);
		SegNomme s1 = new SegNomme(null, p, p2);
		SegNomme s2 = null;
		s2 = (SegNomme) s1.clone();
		
		s2.setNom("new name");
		System.out.println("test point clone ");
		System.out.println(p2.tostring());
		System.out.println(p.tostring());
		System.out.println("test segment clone ");
		System.out.println(s2.tostring()+s2.getNom());
		System.out.println(s1.tostring()+s1	.getNom());
	}

	public static void main(String[] args) {
		/*
		System.out.println("test point");
		testPoint();
		System.out.println("test seg");
		testseg();
		System.out.println("test cercle");
		testcercle();
		System.out.println("test point nomme");
		testpointnomme();
		System.out.println("test seg nomme");
		testsegnomme();
		
		clonetest();
		try {
			serializabletest();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		teststucture();
		*/
	}
	
}
