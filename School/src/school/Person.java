/*
 Nome: Kaik Persike Maiorquino
 Prontu�rio: CB3029689
 
 Nome: Matheus Penteado
 Prontu�rio: CB3031501
*/

package school;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person[name=" + this.name + ", address=" + this.address+"]";
	}
	
}
