public class BirthdayParty extends Event {
    private int age;
    private String cake;
    private int candles;
    private String decorations;

    public BirthdayParty(String date, String startTime, String endTime, String location, 
    String locationAd, String eventName,int guest, String poc, double price, int age, int candles, String cake, String decorations) {
        
        super(date, startTime, endTime, location, locationAd, eventName, guest, poc, price);


        this.age = age;
        this.cake = cake;
        this.candles = candles;
        this.decorations = decorations;
    }

    //age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //cake
    public String getCake(){
        return cake;
    }
    public void setCake(String cake){
        this.cake = cake;
    }

    //candles
    public int getCandles(){
        return candles;
    }
    public void setCandles(int candles){
        this.candles = candles;
    }

    //decorations
    public String getDecorations(){
        return decorations;
    }
    public void setDecorations(String decorations){
        this.decorations = decorations;
    }

    
    public String toString(){
        return "\nAge: " + age +
        "\nCake: " + cake +
        "\nCandles: " + candles +
        "\nDecorations: " + decorations;
    }
    
}
