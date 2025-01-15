package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameRunnerTest {
    @Test
    void compareProgramOutputToVerifyConsistence() {
        int[] diceFour = {4,0,3,4,0,0,3,1,2,0,2,1,3,1,2,0,3,2,0,2,0,2,0,0,1,4,2,0,1,2,4,1,2,3,2,4,0,3,2,4,0,4,0,4,0,2,3,1,4,3,0,4,1,3,0,1,0,2,2,2,0,1,3,1,2,0,1,3,4,3,0,0,0,0,2,1,3,1,2,3,0,0,4,3,3,3,2,0,1,2,4,1,3,0,1,1,4,1,2,3};
        int[] diceEight = {6,8,3,7,4,8,0,1,1,2,6,2,6,3,5,5,0,1,3,1,3,2,2,8,7,2,8,1,2,7,0,2,8,2,3,3,4,0,5,6,7,2,0,2,8,0,8,5,5,6,5,1,1,3,6,2,6,6,5,8,6,6,2,8,5,4,0,3,8,5,6,5,1,3,5,0,2,8,7,8,2,1,4,0,8,6,6,3,8,5,2,8,0,5,5,4,4,6,0,4};

        GameRunner gameRunner1 = new GameRunner(new FakeRandom(diceFour, diceEight));
        gameRunner1.gameloop();
        String firstRun = gameRunner1.getOutput();

        GameRunner gameRunner2 = new GameRunner(new FakeRandom(diceFour, diceEight));
        gameRunner2.gameloop();
        String secondRun = gameRunner2.getOutput();

        assertEquals(firstRun, secondRun);
    }
}