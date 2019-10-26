import java.io.*;
import java.util.*;
import java.lang.*;
import org.junit.*;

public class Main {

    public static void throwgamewinnerexception() throws GameWinnerException {
        throw new GameWinnerException("\"You Won! :)\"");
    }

    public static void serialize(State current, String name) throws IOException {

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream (
                    new FileOutputStream(name));
            out.writeObject(current);
        } finally {
            out.close();
        }
    }

    public static State deserialize(String name) throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream (
                    new FileInputStream(name));
            State ptr= (State) in.readObject();
            return ptr;
        } finally {
            in.close();
        }

    }

    public static void appendStrToFile(String fileName,
                                       String str)
    {
        try {

            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            out.write(str + " ");
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }



    public static void main(String[] args) throws IOException,ClassNotFoundException {

        BufferedReader in = null;

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        boolean done = false;
        int a=0;

        ArrayList<User> user_list = new ArrayList<User>();
        ArrayList<Tile> tile_list = new ArrayList<Tile>();


        Tile ptr = null;
        Tile ptr1 = null;
        State saved = null;
        String username="";

        System.out.println("Welcome to the Game...");
        System.out.println("Do you want to start a new game or continue a previous saved game?");
        System.out.println("1 - New Game");
        System.out.println("2 - Continue");

        boolean newgame=false;

        int option = s.nextInt();

        if(option==1){

            //Input no of tiles..
            newgame=true;
            while(!done){
                System.out.println("Enter the number of tiles on the track (length) ");

                try{
                    Scanner scn = new Scanner(System.in);

                    a = scn.nextInt();
                    done=true;

                }
                catch(InputMismatchException inp){
                    System.out.println("Input not an Integer, Enter Again!");
                }
            }




            Random r = new Random();

            int snake_count=0;
            int vulture_count=0;
            int cricket_count=0;
            int trampoline_count=0;
            int white_count=0;

            int snake_damage = r.nextInt(10)+1;
            int cricket_damage = r.nextInt(10)+1;
            int vulture_damage = r.nextInt(10)+1;
            int trampoline_advance = r.nextInt(10)+1;

            boolean empty=true;

//        System.out.println(snake_damage+ cricket_damage + vulture_damage+ trampoline_advance);

            if(a>200){

                a=200;


                while(empty){
                    if(snake_count==0 || vulture_count==0 || cricket_count==0 || trampoline_count==0){

                        tile_list.clear();

                        snake_count=0;
                        vulture_count=0;
                        cricket_count=0;
                        trampoline_count=0;
                        white_count=0;

                        for(int i=0;i<a;i++){

                            if(i==a-1){
                                tile_list.add(new White(i+1,0,"White"));
                                white_count++;
                            }
                            else{

                                int x = r.nextInt(10)+1;

                                if(x==0 || x==4 || x==8 || x==10){

                                    int h = r.nextInt(4)+1;

                                    if(h==1) {
                                        tile_list.add(new Snake(i+1,snake_damage,"Snake"));
                                        snake_count++;
                                    }
                                    if(h==2){
                                        tile_list.add(new Vulture(i+1,vulture_damage,"Vulture"));
                                        vulture_count++;
                                    }
                                    if(h==3){
                                        tile_list.add(new Cricket(i+1,cricket_damage,"Cricket"));
                                        cricket_count++;
                                    }
                                    if(h==4){
                                        tile_list.add(new Trampoline(i+1,trampoline_advance,"Trampoline"));
                                        trampoline_count++;
                                    }
                                }
                                else{
                                    tile_list.add(new White(i+1,0,"White"));
                                    white_count++;
                                }

                            }


                        }
                    }
                    else if(snake_count>10 || vulture_count>10 || cricket_count>10 || trampoline_count>10){

                        tile_list.clear();

                        snake_count=0;
                        vulture_count=0;
                        cricket_count=0;
                        trampoline_count=0;
                        white_count=0;

                        for(int i=0;i<a;i++){

                            if(i==a-1){
                                tile_list.add(new White(i+1,0,"White"));
                                white_count++;
                            }
                            else{

                                int x = r.nextInt(10)+1;

                                if(x==0 || x==4 || x==8 || x==10){

                                    int h = r.nextInt(4)+1;

                                    if(h==1) {
                                        tile_list.add(new Snake(i+1,snake_damage,"Snake"));
                                        snake_count++;
                                    }
                                    if(h==2){
                                        tile_list.add(new Vulture(i+1,vulture_damage,"Vulture"));
                                        vulture_count++;
                                    }
                                    if(h==3){
                                        tile_list.add(new Cricket(i+1,cricket_damage,"Cricket"));
                                        cricket_count++;
                                    }
                                    if(h==4){
                                        tile_list.add(new Trampoline(i+1,trampoline_advance,"Trampoline"));
                                        trampoline_count++;
                                    }
                                }
                                else{
                                    tile_list.add(new White(i+1,0,"White"));
                                    white_count++;
                                }

                            }


                        }
                    }
                    else{
                        break;
                    }
                }
            }

            else{


                while(empty){
                    if(snake_count==0 || vulture_count==0 || cricket_count==0 || trampoline_count==0){

                        tile_list.clear();

                        snake_count=0;
                        vulture_count=0;
                        cricket_count=0;
                        trampoline_count=0;
                        white_count=0;

                        for(int i=0;i<a;i++){

                            if(i==a-1){
                                tile_list.add(new White(i+1,0,"White"));
                                white_count++;
                            }
                            else{

                                int x = r.nextInt(10)+1;

                                if(x==0 || x==4 || x==8 || x==10){

                                    int h = r.nextInt(4)+1;

                                    if(h==1) {
                                        tile_list.add(new Snake(i+1,snake_damage,"Snake"));
                                        snake_count++;
                                    }
                                    if(h==2){
                                        tile_list.add(new Vulture(i+1,vulture_damage,"Vulture"));
                                        vulture_count++;
                                    }
                                    if(h==3){
                                        tile_list.add(new Cricket(i+1,cricket_damage,"Cricket"));
                                        cricket_count++;
                                    }
                                    if(h==4){
                                        tile_list.add(new Trampoline(i+1,trampoline_advance,"Trampoline"));
                                        trampoline_count++;
                                    }
                                }
                                else{
                                    tile_list.add(new White(i+1,0,"White"));
                                    white_count++;
                                }

                            }


                        }
                    }
                    else if(snake_count>10 || vulture_count>10 || cricket_count>10 || trampoline_count>10){

                        tile_list.clear();

                        snake_count=0;
                        vulture_count=0;
                        cricket_count=0;
                        trampoline_count=0;
                        white_count=0;

                        for(int i=0;i<a;i++){

                            if(i==a-1){
                                tile_list.add(new White(i+1,0,"White"));
                                white_count++;
                            }
                            else{

                                int x = r.nextInt(10)+1;

                                if(x==0 || x==4 || x==8 || x==10){

                                    int h = r.nextInt(4)+1;

                                    if(h==1) {
                                        tile_list.add(new Snake(i+1,snake_damage,"Snake"));
                                        snake_count++;
                                    }
                                    if(h==2){
                                        tile_list.add(new Vulture(i+1,vulture_damage,"Vulture"));
                                        vulture_count++;
                                    }
                                    if(h==3){
                                        tile_list.add(new Cricket(i+1,cricket_damage,"Cricket"));
                                        cricket_count++;
                                    }
                                    if(h==4){
                                        tile_list.add(new Trampoline(i+1,trampoline_advance,"Trampoline"));
                                        trampoline_count++;
                                    }
                                }
                                else{
                                    tile_list.add(new White(i+1,0,"White"));
                                    white_count++;
                                }

                            }


                        }
                    }
                    else{
                        break;
                    }
                }
            }



//        tile_list.get(99)=new Snake(100,5,"Snake");
//
//        for(int j=0;j<a;j++){
//            System.out.println(tile_list.get(j).getName());
//        }

            System.out.println("Setting up the track..");
            System.out.println("Danger : There are "+ snake_count + " , " + cricket_count + " & " + vulture_count + " numbers of Snakes,Cricket & Vultures on your track respectively..  ");

            System.out.println("Danger : Each snake,cricket & vulture will throw you back by "+ snake_damage + " , "+ cricket_damage + " & " + vulture_damage + " number of tiles respectively.." );
            System.out.println("Good News : There are " + trampoline_count + " number of trampolines on your track that can help you advance by " + trampoline_advance+ " tiles..");

            System.out.println("Number of White Tiles : " + white_count);


            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Press enter to continue");
                String x = scan.nextLine();


                if(x.length()==0){
                    System.out.println("Continue..");
                }

            }
            catch (NullPointerException e){
                System.out.println("Null Pointer Exception caught..");
            }



            boolean done1 = false;


            //Input Username..
            while(!done1){

                System.out.println("Enter the player name : ");

                try{
                    Scanner scn = new Scanner(System.in);

                    username = scn.nextLine();
                    user_list.add(new User(username));
                    done1=true;

                }
                catch(InputMismatchException inp){
                    System.out.println("Input not a String, Enter Again!");
                }
            }

            PrintWriter out = null;

            System.out.println("Writing to file..");
            // This function is appending usernames to the file Userdata.txt
            appendStrToFile("UserData.txt", username);
            System.out.println("User saved in disk");


        }
        else if(option ==2){



            System.out.println("Select from the User's below to continue your game");
            String[] words1 = null;

            try {
                in = new BufferedReader( new

                        FileReader("UserData.txt"));

                System.out.println("Enter the name of user that you want to select");
                String n = s1.nextLine();
//                n="harman";

                int flag=0;

                String line;
                while ((line = in.readLine()) != null){
                    words1 =line.split(" ");  //Split the word using space
                    for (String word : words1)
                    {

                        try{
                            if(word.equals(n)){
                                flag=1;
                                System.out.println("User Found");
                                System.out.println("Continuing game...");
                                username=word;
                                saved = deserialize(username);
                                break;
                            }

                        }
                        catch(NullPointerException e){
                            System.out.println("User exists but no save data is available .");
                            System.exit(0);
                        }

                    }
                }

                if(flag==0){
                    System.out.println("User Not Found");
                    System.exit(0);
                }

            }finally {
                if (in != null)
                    in.close(); // IOException
//                if (out != null)
//                    out.close(); // IOException
            }

        }



        Scanner abc = new Scanner(System.in);
        Scanner xyz = new Scanner(System.in);
        Scanner ijk = new Scanner(System.in);



        boolean win=false;
        boolean start = false;
        int roll_count=1;

        boolean f1=false;
        boolean f2=false;
        boolean f3=false;

        if(newgame){
            win=false;
            start = false;
            roll_count=1;

            f1=false;
            f2=false;
            f3=false;
            ptr = tile_list.get(0);
        }
        else{
            ptr=saved.getPtr();
            win=false;
            start=saved.isStart();
            roll_count=saved.getRoll_count();
            f1=saved.isF1();
            f2=saved.isF2();
            f3=saved.isF3();
            newgame=saved.isNewgame();
            a=saved.getA();
            tile_list=saved.getTile_list();
            Snake.bites=saved.snake;
            Cricket.bites=saved.cricket;
            Vulture.bites=saved.vulture;
            Trampoline.bites=saved.trampoline;
        }


        int saveInput=0;

        Random r1 = new Random();

        //Game Loop
        while(!win){

            if(ptr.getNumber()>0.75*a && !f3){
                f3=true;
                System.out.println("\n3st Stop -------");

                System.out.println("Press 1 to continue");
                System.out.println("Press 2 to save progress");

                saveInput=abc.nextInt();

                if(saveInput==1){

                }
                else if(saveInput==2){


                    State current = new State(start,roll_count,f1,f2,f3,newgame,a,tile_list,ptr,Cricket.bites,Snake.bites,Vulture.bites,Trampoline.bites);
                    serialize(current,username);
                    break;
                }

            }
            else if(ptr.getNumber()>0.50*a && !f2){
                f2=true;
                System.out.println("\n2st Stop -------");

                System.out.println("Press 1 to continue");
                System.out.println("Press 2 to save progress");

                saveInput=ijk.nextInt();

                if(saveInput==1){

                }
                else if(saveInput==2){

                    State current = new State(start,roll_count,f1,f2,f3,newgame,a,tile_list,ptr,Cricket.bites,Snake.bites,Vulture.bites,Trampoline.bites);
                    serialize(current,username);
                    break;
                }

            }
            else if(ptr.getNumber()>0.25*a && !f1){
                f1=true;
                System.out.println("\n1st Stop -------");

                System.out.println("Press 1 to continue");
                System.out.println("Press 2 to save progress");

                saveInput=xyz.nextInt();

                if(saveInput==1){

                }
                else if(saveInput==2){

                    State current = new State(start,roll_count,f1,f2,f3,newgame,a,tile_list,ptr,Cricket.bites,Snake.bites,Vulture.bites,Trampoline.bites);
                    serialize(current,username);
                    break;
                }

            }


            if(ptr.getNumber()==a){

                try{
//
                    throwgamewinnerexception();
                }
                catch(GameWinnerException e){
                    System.out.println("\n"+e);
                    System.out.println(username + " wins the race in "+ (roll_count-1) + " rolls!");
                }


//                        System.out.println("You Won! :)");

                //Finally used....
                finally{
                    System.out.println("Total Snake Bites - " + Snake.bites);
                    System.out.println("Total Cricket Bites - " + Cricket.bites);
                    System.out.println("Total Vulture Bites - " + Vulture.bites);
                    System.out.println("Total Trampoline - " + Trampoline.bites);

//                        System.out.println("Total White tiles passed - " + Trampoline.bites);

                    win=true;

                }

                break;
            }




            int dice = r1.nextInt(6)+1;

            System.out.print("\n[Roll-"+roll_count + "] " + username + " rolled " + dice + " at Tile-" + ptr.getNumber());

            if(dice==6 && !start){
                System.out.println(" - Congratulations you got a 6, Game Started..");
                start=true;
            }
            else{
                if(start){

                    //Preceding
                    try{
                        ptr = tile_list.get(tile_list.indexOf(ptr)+dice);
                        System.out.println(" - Landed on Tile-" + ptr.getNumber());
                    }
                    catch(IndexOutOfBoundsException e){
                        System.out.print(" - Still at the same Tile, as it can't go further\n");
                    }




                    System.out.println("Trying to Shake the Tile-" + ptr.getNumber());

                    if(ptr instanceof Snake){
                        ptr=ptr.move(tile_list,ptr);


                    }
                    else if(ptr instanceof Cricket){
                        ptr=ptr.move(tile_list,ptr);

                    }
                    else if(ptr instanceof Vulture){
                        ptr=ptr.move(tile_list,ptr);

                    }
                    else if(ptr instanceof Trampoline){
                        ptr=ptr.move(tile_list,ptr);

                    }
                    else if(ptr instanceof White){
                        ptr=ptr.move(tile_list,ptr);

                    }

                    if(ptr.getNumber()==1){
                        start=false;
                    }



                }
                else{
                    System.out.println(" - Wait for a 6 to start");
                }
            }


            roll_count++;
        }


    }
}