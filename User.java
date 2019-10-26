public class User {
    public String getName() {
        return name;
    }

    protected String name;

    public String getFilename() {
        return filename;
    }

    protected String filename;

    public User(String name){
        this.name=name;
        this.filename=name;
    }


}
