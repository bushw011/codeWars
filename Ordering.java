public class Ordering {
  public String orderWord(String s){
    String output = "";
		if (s == null || s.length() == 0){
			return "Invalid String!";
		}
		char[] charArr = new char[s.length()];
		for (int i = 0; i < s.length(); i++){
			charArr[i] = s.charAt(i);
		}
		for (int i = 1; i < charArr.length; i++){
			char nextItem = charArr[i];
			int j = i;
			while (j > 0 && nextItem < charArr[j - 1]) {
				charArr[j] = charArr[j - 1];
				j--;
			}
			charArr[j] = nextItem;
		}
		for (int i = 0; i < s.length(); i++){
			output += charArr[i];
		}
		return output;
  }
}
