import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class SerializableTest2 {

    ArrayList<Tile> tile_list;
    Tile ptr;

    public SerializableTest2(){

//    public SerializableTest1(ArrayList<Tile> tile_list,Tile ptr){
//        this.tile_list=tile_list;
//        this.ptr=ptr;
    }

    @Test(timeout = 5000)
    public void testfunction() throws IOException, ClassNotFoundException {

        Main a  = new Main();
        State current = new State(false,70,true,true,true,false,120,tile_list,ptr,9,10,12,19);
        a.serialize(current,"SerializableTest2");

        State after_changes;
        after_changes = a.deserialize("SerializableTest2");

        assertEquals(after_changes, current);



    }

}
