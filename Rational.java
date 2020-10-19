import java.util.*;

public class Rational {

	public int numerator;
	public int denominator;

	public Rational(int num, int denom) throws InvalidDenominatorException{

		if (denom == 0) {
			
			throw new InvalidDenominatorException();
		
		}

	}


}

class InvalidDenominatorException extends Exception {

	public InvalidDenominatorException() {

		super("Invalid Denominator: (0)");
	
	}

}