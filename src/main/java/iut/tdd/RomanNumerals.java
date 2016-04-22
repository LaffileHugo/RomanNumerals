package iut.tdd;

public class RomanNumerals {
	
	String[] tabRoman = new String[]{"I","V","X"}; 
	
	public String convertToRoman(String arabe) {
		
		int stringToInt = Integer.parseInt(arabe);
		String res="";
		
		if(stringToInt < 4 ){
			for(int idx=0;idx<stringToInt;idx++){
				res+=tabRoman[0];
			}
		}
		return res;
	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}
