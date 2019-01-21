import java.util.Scanner;

public class StrategyPatternDemo { 
   public static void main(String[] args) { 
//      Context context = new Context(new OperationAdd());   
//      System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); 
// 
//      context = new Context(new OperationSubstract());   
//      System.out.println("10 - 5 = " + context.executeStrategy(10, 5)); 
// 
//      context = new Context(new OperationMultiply());   
//      System.out.println("10 * 5 = " + context.executeStrategy(10, 5)); 
//      
//      context = new Context(new OperationRound());   
//      System.out.println("10 * 4 = " + context.executeStrategy(10, 4)); 
	   Context context = new Context(new OperationAdd());
	   System.out.print("How much Operator:");
	   Scanner in = new Scanner(System.in);
	   int op = in.nextInt();
	   
	   switch(op) {
	   case 1 :
		   System.out.println("Enter num");
		   int num1 = in.nextInt();
		   System.out.println("Enter Operator");
		   String operation = in.next();
		   System.out.println("Enter num");
		   int num2 = in.nextInt();
		   context = TypeContext(operation);
		   System.out.println(num1+" "+operation+" "+num2+" = " + context.executeStrategy(num1,num2));
		   break;
	   case 2:
		   System.out.println("Enter num");
		   int num01 = in.nextInt();
		   System.out.println("Enter Operator");
		   String operation2 = in.next();
		   int priorityop2 = Priority(operation2);
		   System.out.println("Enter num");
		   int num02 = in.nextInt();
//		   context = TypeContext(operation2);
//		   int sum = context.executeStrategy(num01,num02);
		   System.out.println("Enter Operator");
		   String operation3 = in.next();
		   int priorityop3 = Priority(operation3);
		   System.out.println("Enter num");
		   int num03 = in.nextInt();
//		   context = TypeContext(operation3);
//		   System.out.println(num01+" "+operation2+" "+num02+" "+operation3+" "+num03+" = " + context.executeStrategy(sum,num03));
		   if(priorityop2 > priorityop3) {
			   context = TypeContext(operation2);
			   double sum = context.executeStrategy(num01,num02);
			   context = TypeContext(operation3);
			   System.out.println(num01+" "+operation2+" "+num02+" "+operation3+" "+num03+" = " + context.executeStrategy(sum,num03));
		   }else if(priorityop2 < priorityop3){
			   context = TypeContext(operation3);
			   double sum = context.executeStrategy(num02,num03);
			   context = TypeContext(operation2);
			   System.out.println(num01+" "+operation2+" "+num02+" "+operation3+" "+num03+" = " + context.executeStrategy(num01,sum));
		   }else {
			   context = TypeContext(operation2);
			   double sum = context.executeStrategy(num01,num02);
			   context = TypeContext(operation3);
			   System.out.println(num01+" "+operation2+" "+num02+" "+operation3+" "+num03+" = " + context.executeStrategy(sum,num03));
		   }
	   }
	   
   } 
   
   
   
   
   
   public static Context TypeContext(String operation) {
	   if(operation.equals("+"))
		   return new Context(new OperationAdd());
	   else if(operation.equals("-"))
		   return new Context(new OperationSubstract());
	   else if(operation.equals("*"))
		   return new Context(new OperationMultiply());
	   else if(operation.equals("/"))
		   return new Context(new OperationDevide());
	   else if(operation.equals("//"))
		   return new Context(new OperationRound());
	return null;
   }
   
   
   public static int Priority(String op) {
	   switch (op) {
       case "+":
       case "-":
           return 0;
       case "*":
       case "/":
       case "//":
           return 1;

       default:
           throw new IllegalArgumentException("Operator unknown: " + op);
   }
   }
}