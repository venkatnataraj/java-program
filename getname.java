// getname uses in java
/*** getname is a method used to show the name of the instant variable. it will helps to hiding the data 
and advantage of encapsulation.here we cannot access the schoolname directly so we can use getname method but we
can access without getname method in other case 
****/
package practice;

class school {
	private String schoolname;
	private int schoolnumber;
	school(String s,int n){
		this.schoolname=s;
		this.schoolnumber=n;
	}
	String getname(String name) {             // getname method
		return this.schoolname;
	}
	int getnumber() {
		return this.schoolnumber;
	}
}
public class getname {

	public static void main(String[] args) {
		school antonys =new school("antonys",224422);
        System.out.println(antonys.getname("antonys"));  
        
       // antonys.schoolname="rvs"; if we try to change directly it will thorws error.
        
        System.out.println(antonys.getname("Rvs")); // we can change name using getname method.
	}

}
