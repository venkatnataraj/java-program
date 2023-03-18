// Reverse a String 
// getting input string from user and print the reverse string


package practice;
import java.util.Scanner;
public class string_reverse {
    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the name for reverse "); // getting input from user..  
		String name=""; 
		name=s.next();
        String reverse="";
    
        for(int i=name.length()-1;i>=0;i--) {
        	reverse+=name.charAt(i);
        }
        System.out.println(reverse);
	}

}
