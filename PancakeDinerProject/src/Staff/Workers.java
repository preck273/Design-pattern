package Staff;

public abstract class Workers {
    private int workID;
    private String name;
    public Workers(int workID, String name){
        this.workID = workID;
        this.name = name;
    }
    public int getWorkID() { return workID; }
    public String getName() { return name; }
}