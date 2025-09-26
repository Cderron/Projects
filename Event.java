 public class Event {
    //private
    private String date;
    private String startTime;
    private String endTime;
    private String location;
    private String locationAd;
    private String eventName;
    private int guest;
    private String poc;
    private double price;


    public Event(String date, String startTime, String endTime, String location, 
    String locationAd, String eventName,int guest, String poc, double price) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.locationAd = locationAd;
        this.eventName = eventName;
        this.guest = guest;
        this.poc = poc;
        this.price = price;
    }
    //date
    public String getdate() {
        return date;
    }
    public void setdate(String date){
        this.date = date;
    }

    //start time
    public String getstartTime() {
        return startTime;
    }
    public void setstartTime(String startTime){
        this.startTime = startTime;
    }

    //end time
    public String getendTime() {
        return endTime;
    }
    public void setendTime (String endTime){
        this.endTime = endTime;
    }

    //location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    //location address
    public String getLocationAd() {
        return locationAd;
    }
    public void setlocationAd(String locationAd){
        this.locationAd = locationAd;
    }

    //event name
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    //poc
    public String getpoc() {
        return poc;
    }
    public void setPoc(String poc){
        this.poc = poc;
    }

    //price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //guest
    public int getGuest() {
        return guest;
    }
    public void setGuest(int guest){
        this.guest = guest;
    }

   
    public String toString(){
        return "Event: " + eventName + 
        "\nStart Time: " + startTime + 
        "\nEnd Time: " + endTime +
        "\nLocation: " + location +
        "\nAddress: " + locationAd +
        "\nGuests: " + guest +
        "\nPoint of Contact: " + poc +
        "\nPrice: $" + price;
    }
}
