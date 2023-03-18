// implement method overloading & method overriding

package practice;

class car {
	String brand;
	String colour;
	int prices;
	car(String b,String c,int p){  // constructors
		this.brand=b;
		this.colour=c;
		this.prices=p;
	}
	car (){                // dummy constructors
		
	}
	
	public String cartype() {                     
		System.out.println("Hatchbag cars"); 
		return " ";
		 }
	
	public int cardiscount (int prices) {  
		int discount=10000;
	    prices=prices-discount;
        System.out.println(prices);
        return prices;
	}
}
class suvcars extends car{
	int carseats;
	
	suvcars(String b,String c,int p,int s){
		this.brand=b;
		this.colour=c;
		this.prices=p;
		this.carseats=s;	
	}
	
	public String cartype(String cartype) { // method overloaded
	System.out.println("SUV cars");
	return "";
	}
	
	public int cardiscount (int prices) {  // method overriding
		int tax=3000,discount=20000;
	    prices=prices-discount+tax;
		System.out.println(prices);
	    return prices;
	}
}
public class method_overloading_method_overriding {

	public static void main(String[] args) {
	 car tata=new car("tata","black",500000);
     tata.cartype();
     tata.cardiscount(500000);
     
     suvcars mahendra=new suvcars("mahendra","blue",2000000,8);
     mahendra.cartype("suv");
     mahendra.cardiscount(2000000);
	}

}
