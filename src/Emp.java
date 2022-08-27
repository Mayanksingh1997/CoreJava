//aggregation and call by reference

class Address {  
String city,state,country;  
  
    public Address(String city, String state, String country) {  
           this.city = city;  
           this.state = state;  
           this.country = country;  
         }  
  
}  
public class Emp {
   
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  // (3) creating a reference Address class to store object of same class
	    this.id = id;  
	    this.name = name;
	    this.address=address;  // (4) assigning the object to reference declared above
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  //(5) printing the object
	}  
	
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  //(1) object is created and stored in the reference 'address1'
		Address address2=new Address("gno","UP","india");  
		  
		Emp e=new Emp(111,"varun",address1);  // (2) passing the reference 'address1'
		Emp e2=new Emp(112,"arun",address2);  
		      
		e.display();  
		e2.display();  

	}

}
