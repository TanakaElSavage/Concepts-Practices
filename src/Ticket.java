import java.time.LocalDateTime;
public class Ticket {
    private String ticketID;
    private String summary;
    private String location;
    private LocalDateTime time;
    private String description;

    //Constructors
    public Ticket(){
        this.ticketID="";
        this.summary="";
        this.location="";
        this.time=null;
        this.description="";
    }

    public Ticket(String ticketID, String summary, String location, LocalDateTime time, String description){
        this.ticketID= ticketID;
        this.summary= summary;
        this.location= location;
        this.time = time;
        this.description= description;
    }
    //Getters

    public String getTicketID() {
        return ticketID;
    }

    public String getLocation(){
        return location;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    //Setters

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}


