import java.time.LocalDateTime;

public class HousingConcern extends Ticket{
    private String dorm;
    private String room;

    //Constructors
    public HousingConcern(){
        super();
        this.dorm="";
        this.room="";
    }

    public HousingConcern (String ticketID, String summary, String location, LocalDateTime time, String description,
                           String device, Severity severity){
        super(ticketID , summary, location, time, description);
    }
    //Getters

    public String getDorm() {
        return dorm;
    }

    public String getRoom() {
        return room;
    }
    //Setters

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}

