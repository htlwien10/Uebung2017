package demo;
import AlgoTools.IO;
public class kompRechnerV1 {

	public static void main(String[] args) {

		double realTeil, imagTeil;
		
		titel("KompRechner-Demo");
		
		IO.println("\n\tEingabe der 1. Zahl: ");
		realTeil = IO.readDouble("\t\tRealteil: ");
		imagTeil = IO.readDouble("\t\tImagteil: ");
		
		
		IO.println("\n\tEingabe der 2. Zahl: ");
		realTeil = IO.readDouble("\t\tRealteil: ");
		imagTeil = IO.readDouble("\t\tImagteil: ");
		
		
		
		verabschiedung();
	}
	
	
	static void titel(String text) {
		IO.print("\n\t\t");
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		IO.print("\n\t\t*  "+ text + "  *\n\t\t");
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		IO.println("\n");
	}


	static void verabschiedung() {
		IO.println("\n\n\t Have A Nice Day!");
	}		
}
