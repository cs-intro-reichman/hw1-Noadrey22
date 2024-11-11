// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int aRandom = (int)(Math.random()*100)+1;
	int bRandom = (int) (Math.random()*100)+1;
	int cRandom = (int) (Math.random()*100)+1;
	int min = Math.min(aRandom, Math.min(bRandom,cRandom));
	int max = Math.max(aRandom, Math.max(bRandom,cRandom));
	int between = aRandom + bRandom+ + cRandom - min - max;
	System.out.println(min + " " + between + " " + max);
}
}