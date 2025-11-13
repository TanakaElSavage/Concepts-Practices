import java.time.LocalDateTime;

public class Maintenance extends Ticket {
    private String device;
    private Severity severity;

    //Constructor
    public Maintenance(){
        super();
        this.device="";
        this.severity=null;
    }
    public Maintenance (String ticketID, String summary, String location, LocalDateTime time, String description,
                        String device, Severity severity){
        super(ticketID , summary, location, time, description);
    }
    //getters

    public String getDevice() {
        return device;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
    //Setters

    public void setDevice(String device) {
        this.device = device;
    }

    public Severity getSeverity() {
        return severity;
    }
}
