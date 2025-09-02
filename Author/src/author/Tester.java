/*
 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/

package author;

public class Tester {
	public static void main(String[] args) {

		Author author = new Author("Kaik", "kaik@gmail.com", 'M');
		
		System.out.println(author.toString());
		author.setEmail("kaik@outlook.com");
		System.out.println(
				author.getName() + "\n" +
				author.getEmail() + "\n" +
				author.getGender()
		);
		
		System.out.println("-------------------------------------");
		
		Author[] authors = new Author[2];
		authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
		authors[1] = new Author("Autor 02", "autor02@somewhere.com.br", 'm');
		
		Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(testeBook.toString());
	}
}
