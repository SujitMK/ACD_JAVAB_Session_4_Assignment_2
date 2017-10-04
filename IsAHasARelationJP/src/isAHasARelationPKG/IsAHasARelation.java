package isAHasARelationPKG;      // declared a package

import java.util.Scanner;          // using a scanner utility

public class IsAHasARelation {        // declared and defined a class

	public static void main(String[] args) {          // main method

		// Using Scanner to take dynamic/runtime value for a parameter
		
		Scanner input = new Scanner(System.in);
				
	    System.out.println();     // printing lank info
	    System.out.println("Please enter 1 to 5 if you want to share the video in Faceboo.");                    // printing info
		System.out.println("Please enter 6 to 10 if you want to share the video in Whatsapp.");           // printing info
		int i = input.nextInt();       // taking an user info
				
		// created facebook object
		Facebook f = new Facebook();
		
		// calling SocialMedia class methods
		f.sMedias();
		f.sPurpose();
        
		// calling Facebook class Method
		f.fsharing(i);
		
		input.close();         // closing scanner 
	}

}
