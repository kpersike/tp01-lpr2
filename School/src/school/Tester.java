/*
 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/

package school;

public class Tester {
	public static void main(String[] args) {
		Student student = new Student("Kaik", "Rua do Kaik", "Programa Kaik", 2025, 09.1);
		Staff staff = new Staff("Matheus", "Estrada do Matheus", "Escola do Matheus", 201.8);
		
		System.out.println(student.toString());
		student.setAddress("Av. do Kaik");
		System.out.println(
				student.getName() + "\n" +
				student.getAddress() + "\n" +
				student.getProgram() + "\n" +
				student.getYear() + "\n" +
				student.getFee()
		);
		
		System.out.println("-------------------------------------");
		
		System.out.println(staff.toString());
		staff.setPay(203.0);
		System.out.println(
				staff.getName() + "\n" +
				staff.getAddress() + "\n" +
				staff.getSchool() + "\n" +
				staff.getPay()
 		);
	}
	
}
