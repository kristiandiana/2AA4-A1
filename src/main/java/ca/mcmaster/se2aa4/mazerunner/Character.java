package ca.mcmaster.se2aa4.mazerunner;

public class Character {

    private int x, y;
    private char direction;

    public Character (int startX, int startY, char startDirection){
        this.x = startX;
        this.y = startY;
        this.direction = startDirection;
    }

    public void moveForward() {
        // based on the current direction, update x or y accordingly
    }

}