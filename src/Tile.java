public class Tile {
    private boolean up;
    private boolean left;
    private boolean right;
    private boolean down;

    public Tile(boolean up, boolean left, boolean right, boolean down){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
    public boolean getUp(){
        return this.up;
    }
    public boolean getDown(){
        return this.down;
    }
    public boolean getLeft(){
        return this.left;
    }
    public boolean getRight(){
        return this.right;
    }
    public boolean isEqual(Tile t){
        if(up != t.up){
            return false;
        }if(down != t.down) {
            return false;
        }if(left != t.left){
            return false;
        }if(right!=t.right){
            return false;
        }
        return true;
    }
}
