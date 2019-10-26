import java.util.ArrayList;

public class Vulture extends Tile {


    public int getBites() {
        return bites;
    }

    public void setBites(int bites) {
        this.bites = bites;
    }

    protected static int bites=0;

    public Vulture(int number,int attribute,String name) {
        super(number, attribute, name);
    }

    public void throwexception() throws VultureBiteException {
        throw new VultureBiteException("You were bitten by Vulture");
    }

    public Tile move(ArrayList<Tile> tile_list,Tile ptr){

        System.out.print("Yapping...I am a Vulture, you go back "+ getAttribute() + " Tiles.");
        setBites(getBites()+1);
        Tile temp = ptr;
        try{
            temp = tile_list.get(tile_list.indexOf(ptr)-getAttribute());
            System.out.print(" - Moved to tile number "+ temp.getNumber());
            throwexception();

        }
        catch(IndexOutOfBoundsException e)
        {
            temp =tile_list.get(0);
            System.out.print(" - Moved to Tile-1, as it can't go further");
        }

        catch(VultureBiteException e){
            System.out.println("\n"+e);
        }
        catch(Exception e){
            System.out.print("Unknown Exception");
        }
        return temp;
    }
}
