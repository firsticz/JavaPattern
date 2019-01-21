
public class Paddle extends Game{
	@Override
	 void endPlay() {
		 System.out.println("Paddle Game Finished!");
	 }
	 @Override
	 void initialize() {
		 System.out.println("Paddle Game Initialized! Start playing.");
	 }
	 @Override
	 void startPlay() {
		 System.out.println("Paddle Game Started. Enjoy the game!");
	 }
}
