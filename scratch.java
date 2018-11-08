import java.util.Arrays; 
import java.util.Comparator;
import java.util.Random

String[] friends = {
	"Treasure", 
	"Ben", 
	"Alena", 
	"Pasan", 
	"Craig"
};


// introduction to varargs 
// we're going to take an array of Strings. but we don't yet know/haven't specifically set how many 
// elements in our array so we use ...
// and this array is named spots
public String pickLunchSpot(String... spots) {
	// spots being an array has a .length 
	System.out.printf("Randomly picking from %d lunch spots. %n", 
						spots.length);
	// if no input, default is tacos
	if (spots.length == 0) {
		return "Someplace with tacos";
	}
	// add random utility
	Random random = new Random();
	// we're going to use the nextInt method from that Random utility to choose an integer
	// and that integer is going to be between 0 and the length of our array
	// and then we will return whatever String is at the index of our random number
	return spots[random.nextInt(spots.length)];
}