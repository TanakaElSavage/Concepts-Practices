import java.time.LocalDateTime;

public class ITIssue extends Ticket{
    private String device;
    private String software;
    //Constructors
    public ITIssue(){
        super();
        this.device=device;
        this.software=software;
    }
    public ITIssue(String ticketID, String summary, String location, LocalDateTime time, String description,
                   String device, String software){
        super(ticketID , summary, location, time, description);
        this.device=device;
        this.software=software;
    }
    //Setters

    public String getDevice() {
        return device;
    }

    public String getSoftware() {
        return software;
    }
    //Getters

    public void setDevice(String device) {
        this.device = device;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
}
