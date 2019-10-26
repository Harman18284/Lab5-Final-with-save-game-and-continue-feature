import java.io.*;
import java.util.ArrayList;

public class State implements Serializable {

    protected static final long serialVersionUID = 42L;

    protected transient boolean win;

    protected boolean start;
    protected int roll_count;
    protected boolean f1;
    protected boolean f2;
    protected boolean f3;
    protected boolean newgame;
    protected int cricket;
    protected int vulture;

    public int getCricket() {
        return cricket;
    }

    public void setCricket(int cricket) {
        this.cricket = cricket;
    }

    public int getVulture() {
        return vulture;
    }

    public void setVulture(int vulture) {
        this.vulture = vulture;
    }

    public int getSnake() {
        return snake;
    }

    public void setSnake(int snake) {
        this.snake = snake;
    }

    public int getTrampoline() {
        return trampoline;
    }

    public void setTrampoline(int trampoline) {
        this.trampoline = trampoline;
    }

    protected int snake;
    protected int trampoline;


    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public int getRoll_count() {
        return roll_count;
    }

    public void setRoll_count(int roll_count) {
        this.roll_count = roll_count;
    }

    public boolean isF1() {
        return f1;
    }

    public void setF1(boolean f1) {
        this.f1 = f1;
    }

    public boolean isF2() {
        return f2;
    }

    public void setF2(boolean f2) {
        this.f2 = f2;
    }

    public boolean isF3() {
        return f3;
    }

    public void setF3(boolean f3) {
        this.f3 = f3;
    }

    public boolean isNewgame() {
        return newgame;
    }

    public void setNewgame(boolean newgame) {
        this.newgame = newgame;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public ArrayList<Tile> getTile_list() {
        return tile_list;
    }

    public void setTile_list(ArrayList<Tile> tile_list) {
        this.tile_list = tile_list;
    }

    public Tile getPtr() {
        return ptr;
    }

    public void setPtr(Tile ptr) {
        this.ptr = ptr;
    }

    protected int a ;
    protected ArrayList<Tile> tile_list = new ArrayList<Tile>();
    protected Tile ptr;


    public State(boolean start, int roll_count, boolean f1, boolean f2, boolean f3, boolean newgame, int a, ArrayList<Tile> tile_list,Tile ptr,int cricket,int snake,int vulture,int trampoline) {
        this.start = start;
        this.roll_count = roll_count;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.newgame = newgame;
        this.a = a;
        this.tile_list = tile_list;
        this.ptr = ptr;
        this.cricket=cricket;
        this.snake=snake;
        this.vulture=vulture;
        this.trampoline=trampoline;
    }

    @Override
    public boolean equals(Object o) {
        if(o!=null && getClass()==o.getClass()) {
            State s = (State) o;
            return ((start==s.start)&&(roll_count==s.roll_count)&&(f1==s.f1)&&(f2==s.f2)&&(f3==s.f3)&&(newgame==s.newgame)&&(a==s.a)&&(tile_list==s.tile_list)&&(ptr==s.ptr)&&(cricket==s.cricket)&&(snake==s.snake)&&(vulture==s.vulture)&&(trampoline==s.trampoline));
        }
        return false;
    }

    @Override
    public String toString() {
        return "("+Integer.toString(a)+ ","+ Integer.toString(roll_count)+","+Integer.toString(cricket)+","+Integer.toString(snake)+","+Integer.toString(vulture)+","+Integer.toString(trampoline)+")";
    }

}
