
public class TestDictionary {
	
	public static void main(String[] args){
		Word a1 = new Word("caca");
		Word ai1 = new Word("poo");
		Word a2 = new Word("pis");
		Word ai2 = new Word("pee");
		Word a3 = new Word("pedo");
		Word ai3 = new Word("fart");
		Word a4 =new Word("cacas");

		Text t2 = new Text();
		t2.add(ai3);
		t2.add(a3);
		t2.add(a3);
		
		Book b = new Book();
		b.add(a3);
		b.add(a2);
		
		System.out.println("Libro \n" + b + "\n");
		
		Dictionary d = new Dictionary();
		d.put(a1, ai1);
		d.put(a2, ai2);
		d.put(a3, ai3);

	
		System.out.println("Diccionario \n" + d + "\n");
		
		System.out.println("Traducimos");
		b.translate(d);
		System.out.println(b);
		
	
	}
}
