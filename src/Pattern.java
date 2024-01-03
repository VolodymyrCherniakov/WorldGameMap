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

    Tile getPattern(int index){
        return tiles.get(index);
    }

}
