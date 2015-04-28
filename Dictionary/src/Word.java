
public class Word implements Comparable<Word>, Translatable {
	private String word;

	
	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	
	@Override
	public String toString(){
		return word;
	}
	
	@Override
	public int compareTo(Word o) {
		return this.word.compareTo(o.word);
	}

	@Override
	public int translate(Dictionary d) throws NoWordFoundException {
		if (d.translate(this)){
			return 1;
		}else{
			throw new NoWordFoundException();
		}
	}

	@Override
	public double cost() {
		return 0.05;
	}
	
}
