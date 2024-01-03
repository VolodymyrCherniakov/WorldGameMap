public class Tile {
    private boolean up;
    private boolean left;
    private boolean right;
    private boolean down;

    Tile(boolean up, boolean left, boolean right, boolean down){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
    boolean getUp(){
        return this.up;
    }
    boolean getDown(){
        return this.down;
    }
    boolean getLeft(){
        return this.left;
    }
    boolean getRight(){
        return this.right;
    }
}
