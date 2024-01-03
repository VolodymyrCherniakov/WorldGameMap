import java.util.Random;
import java.util.ArrayList;
public class Map {

    private Random rand = new Random();
    private Pattern pattern = new Pattern();
    private ArrayList<ArrayList<Tile>> map;



    public Map(int rows, int columns){
        map = new ArrayList<>();
        ArrayList<Tile> row = new ArrayList<>();
        ArrayList<Tile> tempUp = new ArrayList<>();
        tempUp = pattern.getTiles();
        ArrayList<Tile> tempLeft = new ArrayList<>();
        tempLeft = pattern.getTiles();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i != 0){
                    tempUp = pattern.isFitToUp(map.get(i-1).get(j));
                }
                if(j != 0){
                    tempLeft = pattern.isFitToLeft(map.get(i).get(j-1));
                }
                row.add(randTile(tempUp, tempLeft));
            }
            row.clear();
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
}
