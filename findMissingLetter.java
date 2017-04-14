public class findMissingLetter {
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
