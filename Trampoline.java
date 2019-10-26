import java.util.ArrayList;

public class Trampoline extends Tile {


    public int getBites() {
        return bites;
    }

    public void setBites(int bites) {
        this.bites = bites;
    }

    protected static int bites=0;

    public Trampoline(int number,int attribute,String name) {
        super(number, attribute, name);
    }

    public void throwexception() throws TrampolineException {
        throw new TrampolineException("You were assisted by Trampoline");
    }

    public Tile move(ArrayList<Tile> tile_list,Tile ptr){

        System.out.print("PingPong...I am a Trampoline, you advance "+ getAttribute() + " Tiles.");
        setBites(getBites()+1);
        Tile temp = ptr;
        try{
            temp = tile_list.get(tile_list.indexOf(ptr)+getAttribute());
            System.out.print(" - Moved to tile number "+ temp.getNumber());

            throwexception();
        }
        catch(IndexOutOfBoundsException e)
        {
            temp =ptr;
            System.out.print(" - Still at the same Tile, as it can't go further");
        }
        catch (TrampolineException e){
            System.out.println("\n"+e);
        }
        catch(Exception e){
            System.out.print("Unknown Exception");
        }
        return temp;
    }
}
