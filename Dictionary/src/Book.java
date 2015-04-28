
public class Book implements Translatable{
	private Translatable [] book;
	private int index;
	
	public Book() {
		book = new Translatable[100];
		setIndex(0);
	}
	
	public Translatable[] getBook() {
		return book;
	}

	public void setBook(Translatable[] book) {
		this.book = book;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean isFull(){
		if (index >= book.length){
			return true;
		}
		return false;
	}
	
	public boolean add(Translatable element){
		if (!isFull()){
			book[index] = element;
			index++;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		String s = "";
		for (int i = 0; i < index; i++) {
			s += book[i] + " ";
		}
		return s;
	}
	
	@Override
	public int translate(Dictionary d){
		int count = 0;
		for (int i = 0; i < index; i++) {
			try {
				count += book[i].translate(d);
			} catch (NoWordFoundException e) {
				System.out.println("Warning: " + book[i] + " no esta en el diccionario");
			}
		}
		return count;
	}

	@Override
	public double cost() {
		double cost = 0;
		for (int i = 0; i < index; i++) {
			cost += book[i].cost();
		}
		return cost;
	}

}
