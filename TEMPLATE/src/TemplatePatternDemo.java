import java.util.Scanner;

public class TemplatePatternDemo {
 public static void main(String[] args) {
	 
//	 Game game = new Cricket();
//	 game.play();
//	 System.out.println();
//	 game = new Football();
//	 game.play();
	 Game game = new Cricket();
	 
	 System.out.println("1.Football\n2.Cricket\n3.Simming\n4.Paddle");
	 Scanner in = new Scanner(System.in);
	 int choice = in.nextInt();
	 switch(choice) {
	 case 1 : game = new Football();
			 game.play();
			 break;
	 case 2:game = new Cricket();
	 	game.play();
	 	break;
	 case 3:game = new Swimming();
	 game.play();
	 break;
	 case 4 :game = new Paddle();
		 game.play();
		 break;
	 }
 }
}
