// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int hundredsDigit = Integer.parseInt(args[0])/100;
    int tensDigit = Integer.parseInt(args[0])/10%10;
	int unityDigit = Integer.parseInt(args[0])%10;
    System.out.println( hundredsDigit + " hundreds, " + tensDigit + " tens, and " + unityDigit + " ones."); 
	}
}
