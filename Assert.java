import java.lang.ArrayIndexOutOfBoundsException;

public class Assert {
	public static boolean notFalse(boolean condition){
		if (condition){
			return true;
		}
		throw new ArrayIndexOutOfBoundsException("Error");
	}
}