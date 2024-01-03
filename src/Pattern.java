import java.util.ArrayList;
public class Pattern {
    private ArrayList<Tile> tiles = new ArrayList<Tile>();

    Pattern(){
        tiles.add(new Tile(false,false,true,false));           //sypka vpravo
        tiles.add(new Tile(true,false,false,false));           //sypka v horu
        tiles.add(new Tile(false,false,false,true));           //sypka dolu
        tiles.add(new Tile(false,true,false,false));           //sypka vlevo
        tiles.add(new Tile(true,true,false,false));            //koutek vlevo a v horu
        tiles.add(new Tile(false,true,false,true));            //koutek vlevo a dolu
        tiles.add(new Tile(true,false,true,false));            //koutek vpravo a v horu
        tiles.add(new Tile(false,false,true,true));            //koutek vpravo a dolu
        tiles.add(new Tile(false,true,true,false));            //horizontalni primka
        tiles.add(new Tile(true,false,false,true));            //vertikalni primka
        tiles.add(new Tile(true,true,true,true));              //cela dlazdina
        tiles.add(new Tile(false,false,false,false));          //prazdna dlazdina
    }

    public Tile getPattern(int index){
        return tiles.get(index);
    }
    public int getSize(){return tiles.size();}
    public ArrayList<Tile> getTiles(){
        return tiles;
    }

    public ArrayList<Tile> isFitToUp(Tile t){
        ArrayList<Tile> result = new ArrayList<Tile>();
        for(int i = 0; i<12;i++){
            if(tiles.get(i).getDown() == t.getUp()){
                result.add(tiles.get(i));
            }
        }
        return result;
    }
    public ArrayList<Tile> isFitToLeft(Tile t){
        ArrayList<Tile> result = new ArrayList<Tile>();
        for(int i = 0; i<12;i++){
            if(tiles.get(i).getRight() == t.getLeft()){
                result.add(tiles.get(i));
            }
        }
        return result;
    }
}
