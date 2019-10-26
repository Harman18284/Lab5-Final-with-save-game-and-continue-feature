import java.util.ArrayList;

public class Cricket extends Tile {

    public int getBites() {
        return bites;
    }

    public void setBites(int bites) {
        this.bites = bites;
    }

    protected static int bites=0;


    public Cricket(int number,int attribute,String name) {
        super(number, attribute, name);
    }

    public void throwexception() throws CricketBiteException {
        throw new CricketBiteException("You were bitten by Cricket");
    }

    public Tile move(ArrayList<Tile> tile_list,Tile ptr){

        System.out.print("Chirp...I am a Cricket, you go back "+ getAttribute() + " Tiles.");
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
        catch(CricketBiteException e){
            System.out.println("\n"+e);
        }
        catch(Exception e){
            System.out.print("Unknown Exception");
        }
        return temp;
    }
}
