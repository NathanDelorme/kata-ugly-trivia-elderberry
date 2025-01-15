
package info.dmerej;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;


public class GameRunner {
	private IRandomable random;
	private ByteArrayOutputStream baos;
	private boolean notAWinner;

	public GameRunner(IRandomable random) {
		this.random = random;
		this.baos = new ByteArrayOutputStream();
	}

	public static void main(String[] args) {
		GameRunner runner = new GameRunner(new RandomWrapper());
		runner.gameloop();
	}

	public void gameloop() {
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);

		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");


		do {

			aGame.roll(this.random.nextInt(5) + 1);

			if (this.random.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
		} while (notAWinner);

		System.setOut(old);

		System.out.println(baos);
	}

	public String getOutput() {
		return baos.toString();
	}
}
