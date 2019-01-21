
public class OperationRound implements Strategy{
		@Override
	   public double doOperation(double num1, double num2) { 
	      return Math.round(num1 / num2); 
	   }
}