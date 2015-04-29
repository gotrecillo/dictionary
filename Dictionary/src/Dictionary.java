import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class Dictionary {
	private SortedMap<Word, Word> dictionary;
	
	public Dictionary(){
		dictionary = new TreeMap<Word, Word>();
	}
	public void put(Word key, Word value){
		dictionary.put(key, value);
	}
	
	public boolean containsKey(Word key){
		return dictionary.containsKey(key);
	}
	
	public boolean containsValue(Word value){
		return dictionary.containsValue(value);
	}
	
	public boolean translate(Word key){
		if (containsKey(key)){
			key.setWord(dictionary.get(key).getWord());
			return true;
		}
		return false;
	}
	
	public String toString(){
		String s = "";
		Set<Word> keys = dictionary.keySet();
		Iterator<Word> iteKeys = keys.iterator();
		while (iteKeys.hasNext()) {
			Word key = iteKeys.next();
			Word value = dictionary.get(key);
			s += key +" : " + value +" \n";
		}
		return s;
	}
}
