package main;
public class HvitRute extends Rute {
	
	public HvitRute()
	{
		super();
	}
	
	public  char tilTeng()
	{
		if (paaVeien)
			return '*';
		return '.';
		
	}
	@Override
	public boolean gaa(Rute fra, String utvei)
	{ 
		Boolean nordErPaaVeien,sydErPaaVeien,ostErPaaVeien,vesterPaaVeien;
		nordErPaaVeien = false;
	    sydErPaaVeien = false;
	    ostErPaaVeien = false;
	    vesterPaaVeien= false;
	    utvei =  utvei + toString()+ "--->" ; 
	    harVaert = true;
	    
		System.out.println("hvit inn :" + utvei);
		
		  
		if (fra != nord && !nord.harVaert)		
			nordErPaaVeien = nord.gaa(this,utvei);
		 
			  
			 // utvei =  toString() + "-->"+ utvei;  
		
	      if (fra != syd &&!syd.harVaert) 
	    	  sydErPaaVeien = syd.gaa(this,utvei);
	   
			 // utvei =  toString() + "-->"+ utvei;  
		
	   
	     if (fra != ost && !ost.harVaert) 
	    	 ostErPaaVeien = ost.gaa(this,utvei);
	    
			//  utvei =  toString() + "-->"+ utvei;  
		
	    
	       if (fra != vest && !vest.harVaert) 
	    	   vesterPaaVeien =  vest.gaa(this,utvei);
	     
				  //utvei =  toString() + "-->"+ utvei;  
	    
	    if ( nordErPaaVeien||sydErPaaVeien||ostErPaaVeien||vesterPaaVeien) 
	  
	    	this.paaVeien = true;
	    	return paaVeien;
	}
	
	public boolean erHvitRute()
	{
		return true;
		
	}

}
