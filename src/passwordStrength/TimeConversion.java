package passwordStrength;

public class TimeConversion {
//convert time to military time 
//input 07:05:45PM
//output 19:05:45
//Character.getNumericValue(c);  gives the numeric value of char '2'
//int a=Integer.parseInt(String.valueOf(c));  
	public static void main(String[] args) {
		String s = timeConversion("07:05:45PM");
	}
	
	static String timeConversion(String s) {
		String res ="";
		
		char[] chararray = s.toCharArray();
		for(int i = 0; i < chararray.length; i++) {
			if(chararray[i] == 'P') {
				if(chararray[0] == '1' && chararray[1] == '2') {
					int add = 12 + 
				}
			}
			
		}
		for(int i = s.length(); i < s.length(); i--) {
			char c = s.charAt(i);
			if(c == 'P') {
				
			}
		
		}
		
		return res;
		
	}
}
