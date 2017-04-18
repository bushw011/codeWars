import java.util.ArrayList;

class Thirteen {
	
/* When you divide the successive powers of 10 by 13 you get the following remainders of the integer divisions:
1, 10, 9, 12, 3, 4.

Then the whole pattern repeats.

Hence the following method: Multiply the right most digit of the number with the left most number in the sequence shown above, 
the second right most digit to the second left most digit of the number in the sequence. 
The cycle goes on and you sum all these products. Repeat this process until the sequence of sums is stationary. */
	
	
	
    public static long thirt(long n) {
        int[] pwrsOf13 = {1, 10, 9, 12, 3, 4};
		int output = 0;
		int j = 0;
		ArrayList<Integer> outCheck = new ArrayList();
		while (true){
			if (n<=0){
				outCheck.add(output);
				n = output;
				output = 0;
				j=0;
				if (outCheck.size()>2 && (outCheck.get(outCheck.size()-1) == outCheck.get(outCheck.size()-2))){
					output = outCheck.get(outCheck.size()-1);
					break;
				}
			}
			if (j > 5){
				j=0;
			}

			output += (n%10)*pwrsOf13[j];
			n = n/10;
			j++;
		}
		return output;
    }
}
