package test;


import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import main.Labyrint;
import main.Liste;



public class LabyrintTest {

	@Test
	public void test() {
		String filnavn;
		filnavn = new String("Test1.txt");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
		
	}
	
	@Test
	public void test2() {
		String filnavn;
		filnavn = new String("Test2.txt");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
		
	}
	@Test
	public void test3() {
		String filnavn;
		filnavn = new String("Test3.txt");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
        l.finnUtveiFra(2, 2);
		
	}
	@Test
	public void test4() {
		String filnavn;
		filnavn = new String("src/1.in");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
        l.finnUtveiFra(4, 4);
        System.out.printf(l.toString());
		
	}
	@Test
	public void test5() {
		String filnavn;
		filnavn = new String("2.in");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
        l.finnUtveiFra(2, 2);
		
	}
	@Test
	public void test6() {
		String filnavn;
		filnavn = new String("3.in");
		File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();
        l.finnUtveiFra(4, 6);
        //l.finnUtveiFra(2, 6);
		
	}
	
	@Test
	public void test7() {
		String filnavn;
		filnavn = new String("7.in");
		File fil = new File(filnavn);
        Labyrint l = null;
        Liste<String> utveier;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        //l.settMinimalUtskrift();
        utveier= l.finnUtveiFra(2, 2);
        utveier =l.finnUtveiFra(2, 4);
        utveier =l.finnUtveiFra(4, 4);
        
        for (String utvei:utveier)
        	System.out.println(utvei);
        	
        	
		
	}
}	
	
