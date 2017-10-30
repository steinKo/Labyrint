package main;


import java.util.ArrayList;

import main.Koe;
import main.Liste;

public abstract  class Rute {
	private int rad,kolonne;
	protected Rute nord;
	protected Rute syd;
	protected Rute ost;
	protected Rute vest;
	protected boolean paaVeien;
	protected boolean harVaert;
	
	static protected Liste<String> utveier = new Koe<String>();
	
	public Rute()
	{
		paaVeien = false;
		harVaert = false;
		
	}
	
	public Liste<String>hentUtveier()
	{
		return utveier;
	}
	
	
	public int hentRad()
    {
		return rad;
		
	}
	
	public int hentKolonne()
    {
		return kolonne;
		
	}
	
	public Rute hentNord()
	{
		return nord;
	}
	
	public Rute hentSyd()
	{
		return syd;
	}
	
	public Rute hentOst()
	{
		return ost;
	}
	
	public Rute hentVest()
	{
		return vest;
	}
	
	public void opprett(Rute[][] ruter,int antallKolonner,int antallRader,int rad, int kolonne)
    {
		if (rad>0) 
			nord = ruter [rad-1][kolonne];
		if (rad< antallRader-1)
		    syd =  ruter [rad +1][kolonne];
		if (kolonne<antallKolonner-1)
		    ost = ruter [rad][kolonne +1];
		if (kolonne>0)
		    vest = ruter [rad][kolonne -1];
		this.rad =rad+1;
		this.kolonne = kolonne+1;
	}
	
	public abstract char tilTeng();
	
	public abstract  boolean gaa(Rute fra, String utveier);
	public void finnUtvei()
	{   
		String utveier;
		utveier = new String();
		gaa(this,utveier);
	}
	
	@Override
	public String toString()
    {
		 String temp  = new String();
		 temp = "(" + Integer.toString(kolonne) + "," + Integer.toString(rad) + ")";
		 return temp;
	}
	
	public abstract boolean erHvitRute();
	
		
	

}
