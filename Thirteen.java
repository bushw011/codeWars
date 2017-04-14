import java.util.ArrayList;

class Thirteen {

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
