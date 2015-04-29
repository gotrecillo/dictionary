
public class Text implements Translatable{
	private Node begin;
	
	public Text(String text) {
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			add(new Word(words[i]));
		}
	}

	public Text() {
	}

	public Node getBegin() {
		return begin;
	}

	public void setBegin(Node begin) {
		this.begin = begin;
	}

	public Node getLast(){
		Node actual = begin;
		if (actual != null){
			while (actual.getNext() != null){
				actual = actual.getNext();
			}
		}
		return actual;
	}
	
	public boolean add(Word word){
		Node wordNode = new Node(word);
		if (getLast() == null){
			begin = wordNode;
		}else{
			getLast().setNext(wordNode);
		}
		return true;
	}
	
	public String toString(){
		String s = "";
		Node actual = begin;
		if (actual != null){
			while (actual != null){
				s += actual.getWord().toString() +" ";
				actual = actual.getNext();
			}
		}
		return s;
	}
	
	@Override
	public int translate(Dictionary d){
		int count = 0;
		Node actual = begin;
		while (actual != null){
			try {
				count += actual.getWord().translate(d);
			} catch (NoWordFoundException e) {
				System.out.println("Warning: " + actual.getWord() + " no esta en el diccionario");
			}
			actual = actual.getNext();
		}
		
		return count;
	}

	@Override
	public double cost() {
		double cost = 0;
		Node actual = begin;
		if (actual != null){
			while (actual != null){
				cost += actual.getWord().cost();
				actual = actual.getNext();
			}
		}
		return cost;
	}
	

}
