public class Quinceanera extends BirthdayParty {
    private int damas;
    private int toasts;
    private String music;

    public Quinceanera(String date, String startTime, String endTime, String location, 
    String locationAd, String eventName,int guest, String poc, double price, int candles, String cake, 
    String decorations, int damas, int toasts, String music){
        
        super(date, startTime, endTime, location, locationAd, eventName, guest, 
        poc, price, 15, candles, cake, decorations);

        this.damas = damas;
        this.toasts = toasts;
        this.music = music;
    }

    //damas
    public int getDamas(){
        return damas;
    }
    public void setDamas(int damas){
        this.damas = damas;
    }

    //toasts
    public int getToasts(){
        return toasts;
    }
    public void setToasts(int toasts){
        this.toasts = toasts;
    }

    //music
    public String getMusic(){
        return music;
    }
    public void setMusic(String music){
        this.music = music;
    }

   
    public String toString(){
        return super.toString() +
        "\nDamas: " + damas +
        "\nAmount of Toasts: " + toasts +
        "\nMusic: " + music;
    }
}
