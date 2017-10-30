package main;

public class Aapning extends HvitRute {
	public Aapning()
	{ super();
	}
	
	public  boolean gaa(Rute rute, String utvei)
	{    
		
	
	     
	        utvei =  utvei + toString() + "\n";
	        System.out.println("Aapni" + utvei);
	        Rute.utveier.settInn(utvei);
	        harVaert = true;
	        paaVeien = true;
	        return paaVeien;
	   
	        	
	        //System.out.println("Aapni" + utvei);
	        
		
	}
	

}
