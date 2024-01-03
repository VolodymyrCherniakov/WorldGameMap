import java.util.Random;
import java.util.ArrayList;
public class Map {

    private Random rand = new Random();
    private Pattern pattern = new Pattern();
    private ArrayList<ArrayList<Tile>> map;
    private int rows;
    private int columns;


    public Map(int r, int c){
        rows = r;
        columns = c;
        map = new ArrayList<>();
        ArrayList<Tile> tempUp;
        ArrayList<Tile> tempLeft;
        for (int i = 0; i < rows; i++) {
            ArrayList<Tile> row = new ArrayList<Tile>();
            tempUp = pattern.getTiles();
            tempLeft = pattern.getTiles();

            for (int j = 0; j < columns; j++) {
                if(i > 0){
                    tempUp = pattern.isFitToUp(map.get(i-1).get(j));
                }
                if(j > 0){
                    tempLeft = pattern.isFitToLeft(map.get(i).get(j-1));
                }
                row.add(randTile(tempUp, tempLeft));
            }
            map.add(row);
        }
    }

    private Tile randTile(ArrayList<Tile> tempUp, ArrayList<Tile> tempLeft) {
        ArrayList<Tile> temp = new ArrayList<>();
        for(Tile t : tempUp){
            if(tempLeft.contains(t) && !temp.contains(t)){
                temp.add(t);
            }
        }
        int index = rand.nextInt(temp.size());
        return pattern.getPattern(index);
    }

    private int getToDisplay(Tile t){
        for(int i = 0; i< pattern.getSize(); i++){
            if(t.isEqual(pattern.getPattern(i))){
                return i+1;
            }
        }
        return 0;
    }

    public void printMap(){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.printf("%d ", getToDisplay(map.get(i).get(j)));
            }
            System.out.println();
        }
    }
}
