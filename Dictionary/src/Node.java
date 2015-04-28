
public class Node {
	private Node next;
	private Word word;
	
	public Node(Word word){
		this.word = word;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Word getWord() {
		return word;
	}
	public void setWord(Word word) {
		this.word = word;
	}
}
