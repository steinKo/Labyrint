package main;

import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Labyrint {
    
      
      private Rute[][] ruter;
      private Liste<Utvei> utveier;
	  
      private Labyrint( Rute[][] ruter)
      {
    	  utveier = new OrdnetLenkeliste<Utvei>();
    	  this.ruter = ruter;
      }
      
      static public Labyrint lesFraFil(File fil) throws FileNotFoundException
      {   
          
    	  try
    	  {
           	  
    	  Scanner input = new Scanner(fil);
    	  String kolonneOgRader = input.nextLine();
    	  Scanner scanner = new Scanner(kolonneOgRader);
    	  int rader = koordinat(scanner);
    	  int kolonner = koordinat(scanner);
    	  Rute[][] Lruter = new Rute[rader][kolonner];
    	  String line;
    	  char ruteTegn;
    	  Rute rute;
    	 for (int i= 0;i< rader;i++)
    	 {
    		// System.out.println("Rader");
    		 //System.out.print(i);
    		 line = input.nextLine();
    	     for (int j = 0; j < kolonner; j++) {
			  ruteTegn =line.charAt(j);
			  
			 if (ruteTegn =='.')
			 {
				 if (i== 0 || i== rader -1|| j == 0 ||j == kolonner -1)
					 Lruter[i][j] = new Aapning();
				 else
				     Lruter[i][j] = new HvitRute();
			 } 
			 if (ruteTegn =='#')
				 Lruter[i][j] = new SortRute();
				
			 }
    		}
    	 
    	 for (int i= 0;i< rader;i++)
    	 {
    	     for (int j = 0; j < kolonner; j++)
    	     {
    	    	 rute =  Lruter[i][j];
    	    	 rute.opprett( Lruter,kolonner, rader,i,j);
    	     }
    	 } 
    	  return new Labyrint(Lruter);
    	  }
    	  catch (FileNotFoundException FFx)
    	  {
    		  throw FFx;
    	  }
      }

	

	private static int koordinat(Scanner scanner) {
		String Srader = scanner.next();
    	  int rader = Integer.parseInt(Srader);
		return rader;
	}	
      
      
      public String toString()
      {  String string;
         Rute rute = null; 
         string = new String();
         char tegn;
         
    	  for (int i= 0;i< ruter.length;i++)  
    	  {
    		  
      	     for (int j = 0; j < ruter[0].length; j++)
      	   {  
      	    	 rute = ruter[i][j];
      	    	 tegn = rute.tilTeng();
      	    	 if (tegn =='.')
      	    		string = string + ' ';
      	    	 else
      	    	    string = string + rute.tilTeng();
           }
      	    			string = string + "\n";
    	  }			
      	    	 
    	  return string;
      }
	public Liste<String> finnUtveiFra(int startKol, int startRad) {
		Rute startRute;
		String koor;
		startRute = ruter[startRad-1][startKol-1];
		koor= Integer.toString(startRute.hentKolonne()) + Integer.toString(startRute.hentRad());
		//System.out.println(koor);
		if (startRute.erHvitRute())
		    startRute.finnUtvei();
		System.out.println(toString());
		return startRute.hentUtveier();
	}
	public void settMinimalUtskrift() 
	{
	 Rute rute;
	 String print;
	 String naboer;
	 print = new String();
	 naboer = new String();
   	 for (int i= 0;i< ruter.length;i++)
   	   {   
   	     for (int j = 0; j < ruter[0].length; j++)
   	    	 
   	    	 
   	        {
   	    	 rute =  ruter[i][j];
   	    	 print = print + rute.tilTeng();
   	    	 naboer = naboer + rute.getClass().getName() +" (" +rute.hentKolonne()+ "," + rute.hentRad()+ ")";
   	    	 if (rute.hentNord()!=null)
   	    	 naboer = naboer + "nord(" + rute.hentNord().hentKolonne()+  "," + rute.hentNord().hentRad()+ ")";
   	    	 if (rute.hentSyd()!=null)
   	    	 naboer = naboer + "syd(" + rute.hentSyd().hentKolonne()+ ","+ rute.hentSyd().hentRad()+ ")";
   	    	if (rute.hentOst()!=null)
   	    	 naboer = naboer + "ost(" + rute.hentOst().hentKolonne()+", "+ rute.hentOst().hentRad()+ ")";
   	    	if (rute.hentVest()!=null)
   	    	naboer = naboer + "vest(" + rute.hentVest().hentKolonne()+ ","+ rute.hentVest().hentRad()+ ")";
   	    	naboer = naboer+"\n"; 
	         }
   	     print = print +"\n";
   	     naboer = naboer+"\n"; 
        }
   	   // System.out.println(print);
   	   // System.out.println(naboer);
   	 
   	    
	  }

}
