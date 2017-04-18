public class findMissingLetter {
/*	
Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
You will always get an valid array. And it will be always exactly one letter be missing. 
The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:
['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
*/
  public static char findMissingLetter(char[] array){
    int uniCheck = 0;
		char missing = ' ';
		for (int i = 1; i < array.length; i++){
			uniCheck = (int)array[i];
			if (Character.getNumericValue(array[i]) - Character.getNumericValue(array[i-1])>1){
				uniCheck--;
				missing = (char)uniCheck;
				return missing;
			}
		}

		return '0';
  }
}
