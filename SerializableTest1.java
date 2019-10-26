import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class SerializableTest1 {

    ArrayList<Tile> tile_list;
    Tile ptr;

    public SerializableTest1(){



//
//    public SerializableTest1(ArrayList<Tile> tile_list,Tile ptr){
//        this.tile_list=tile_list;
//        this.ptr=ptr;
    }

    @Test(timeout = 5000)
    public void testfunction() throws IOException, ClassNotFoundException {

        Main a  = new Main();
        State current = new State(true,10,true,true,true,false,100,tile_list,ptr,10,10,10,10);
        a.serialize(current,"SerializableTest1");

        State after_changes;
        after_changes = a.deserialize("SerializableTest1");

        assertEquals(after_changes, current);



    }


}
