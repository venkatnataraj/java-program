// Reverse a String 



package practice;
public class string_reverse {
    
	public static void main(String[] args) {
		 
		String name="Dhoni"; 
		String reverse="";
    
        for(int i=name.length()-1;i>=0;i--) {
        	reverse+=name.charAt(i);
        }
        System.out.println(reverse);
	}

}
