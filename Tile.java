import java.io.Serializable;
import java.util.ArrayList;




abstract class Tile implements Serializable {

    protected final int number;


    protected final int attribute;



    protected final String name;

    public Tile(int number, int attribute, String name){

        this.number = number;
        this.attribute = attribute;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public int getAttribute() {
        return attribute;
    }

    public String getName() {
        return name;
    }

    abstract Tile move(ArrayList<Tile> tile_list,Tile ptr);


}
