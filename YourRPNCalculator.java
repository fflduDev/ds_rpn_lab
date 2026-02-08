
import java.util.ArrayList;

public class YourRPNCalculator implements SimpleRPNCalculator {
	// don't change these...
	TGStack theStack = null;
	
	public YourRPNCalculator(TGStack stack) {
		theStack = stack;
	}

	
	@Override
	public String calculate(String inputString) {
		// this is probably helpful, but you can remove...
		ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);
		
		// here's the calculator logic!
		return null;
		
	}

}
