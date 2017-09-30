package isAHasARelationPKG;

import java.util.Scanner;

public class IsAHasARelation {

	public static void main(String[] args) {

		// Using Scanner to take dynamic/runtime value for a parameter
		
		Scanner input = new Scanner(System.in);
				
	    System.out.println();
	    System.out.println("Please enter 1 to 5 if you want to share the video in Faceboo.");
		System.out.println("Please enter 6 to 10 if you want to share the video in Whatsapp.");
		int i = input.nextInt();
				
		// created facebook object
		Facebook f = new Facebook();
		
		// calling SocialMedia class methods
		f.sMedias();
		f.sPurpose();
        
		// calling Facebook class Method
		f.fsharing(i);
		
		input.close();
	}

}
