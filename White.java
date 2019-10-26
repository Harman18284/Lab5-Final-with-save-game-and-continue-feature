import java.util.ArrayList;

public class White extends Tile {




    public White(int number,int attribute,String name) {
        super(number, attribute, name);
    }

    public Tile move(ArrayList<Tile> tile_list,Tile ptr){

        System.out.print("I am a White Tile, you stay at Tile number "+ getNumber());
        Tile temp = ptr;
        try{
            temp = tile_list.get(tile_list.indexOf(ptr)-getAttribute());

        }
        catch(IndexOutOfBoundsException e)
        {
            temp =ptr;

        }
        catch(Exception e){
            System.out.print("Unknown Exception");
        }
        return temp;
    }
}
