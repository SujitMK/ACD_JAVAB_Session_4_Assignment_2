package isAHasARelationPKG;

public class Facebook extends SocialMedia{         // Facebook extends SocialMedia - "IS-A" Relation
	
	public void fsharing(int i)
	{
		if (i <= 5)
		{
			System.out.println("Video will be shared on Facebook.");
			System.out.println();
		}
		else
		{
			// Creating an object of Whatsapp class and calling Sharing method - "HAS-A" Relation
			Whatsapp w = new Whatsapp();
			w.wSharing();  
		}
	}
	
	// IS-A and HAS-A both have their own pros and cons. 
	// But in perspective of changing the code in future then it will be easy to do so in a HAS-A realtion

}
