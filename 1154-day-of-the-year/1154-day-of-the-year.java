import java.time.LocalDate;

class Solution {
    public static int dayOfYear(String date) {
        
    	int n = date.length();

    	LocalDate d =  LocalDate.parse(date);
    	
    	return d.getDayOfYear();
    	
    }
}