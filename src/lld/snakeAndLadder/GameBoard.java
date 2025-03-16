package lld.snakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Jumper> snakes;
    private List<Jumper> ladders;
    private Map<String, Integer> playersCurrentPosition;
    int boardSize;

    public GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> playersCurrentPosition, int boardSize){
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
        this.playersCurrentPosition = playersCurrentPosition;
        this.boardSize = boardSize;
    }

    // getter and setter
    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Queue<Player> getNextTurn() {
        return nextTurn;
    }

    public void setNextTurn(Queue<Player> nextTurn) {
        this.nextTurn = nextTurn;
    }

    public List<Jumper> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Jumper> snakes) {
        this.snakes = snakes;
    }

    public List<Jumper> getLadders() {
        return ladders;
    }

    public void setLadders(List<Jumper> ladders) {
        this.ladders = ladders;
    }

    public Map<String, Integer> getPlayersCurrentPosition() {
        return playersCurrentPosition;
    }

    public void setPlayersCurrentPosition(Map<String, Integer> playersCurrentPosition) {
        this.playersCurrentPosition = playersCurrentPosition;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    void startGame(){
        while (nextTurn.size() > 1){
            Player player = nextTurn.poll();

            int currentPosition = playersCurrentPosition.get(player.getPlayerName());
            int rollDiceValue = dice.rollDice();
            int nextCell = currentPosition + rollDiceValue;
            if(nextCell > boardSize){
                nextTurn.offer(player);
            } else if(nextCell == boardSize){
                System.out.println(player.getPlayerName() + "won the game");
            } else {

            }
        }
    }
}
