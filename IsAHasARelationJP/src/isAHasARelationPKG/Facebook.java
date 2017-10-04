package isAHasARelationPKG;  // declared a package

public class Facebook extends SocialMedia{         // Facebook extends SocialMedia - "IS-A" Relation
	
	public void fsharing(int i)           // declared and defined a method
	{
		if (i <= 5)          // checking if condition
		{
			System.out.println("Video will be shared on Facebook.");      // printing info
			System.out.println(); // printing blank line
		}
		else
		{
			// Creating an object of Whatsapp class and calling Sharing method - "HAS-A" Relation         // printing info
			Whatsapp w = new Whatsapp();      // creating a object
			w.wSharing();   // calling a method
		}
	}
	
	// IS-A and HAS-A both have their own pros and cons. 
	// But in perspective of changing the code in future then it will be easy to do so in a HAS-A realtion

}
