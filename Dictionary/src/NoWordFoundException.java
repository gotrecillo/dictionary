
@SuppressWarnings("serial")
public class NoWordFoundException extends Exception{
	static String message = "Palabra no encontrada en el diccionario";
	
	public NoWordFoundException(){
		super(message);
	}
}
