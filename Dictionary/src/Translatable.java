
public interface Translatable {
	public int translate(Dictionary d) throws NoWordFoundException;
	public double cost();
}
