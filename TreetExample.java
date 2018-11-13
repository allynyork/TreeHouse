import java.util.Date;

import com.teamtreehouse.Treet;

public class TreetExample {

	public static void main(String[] args) {
		// uhmmm 
		Treet treet = new Treet(
			// Author
			"allynyork",
			// Description 
			"a bunch of text",
			// use epoch converter to know what to populate the date with, since we're using a date in the past for our CreationDate
			// and specify it is a Long
			new Date(1421849732000L)
		);
		System.out.printf("This is a new Treet: %s %n", treet);

	}
}