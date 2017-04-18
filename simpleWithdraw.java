public class simpleWithdraw {
/* An ATM ran out of 10 dollar bills and only has 100, 50 and 20 dollar bills.
  Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible,
determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).*/
    public static int[] withdraw(int n){
		int a = 0;
		int[] output = new int[3];
		while(a<n){
			a += 100;
			output[0]++;

			if (a==n){
				return output;
			}
		}
		a-=100;
		output[0]--;
		if (((n-a)/10)%2==0){
			while(a!=n){
				a+=20;
				output[2]++;
			}
		}
		else{
			if(n%100 ==10 || n%100 ==30){
				a-=100;
				output[0]--;
				a+=50;
				output[1]++;
				while(a!=n){
					a+=20;
					output[2]++;
				}
			}
			else{
				a+=50;
				output[1]++;
				while(a!=n){
					a+=20;
					output[2]++;
				}
			}
		}
		return output;
	}
}
