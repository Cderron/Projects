/*
 * COP 2805C
 * P3: Demonstrate OOP principles for inheritance
 * 9/21/25
 * Derron Coghiel
 */
import java.util.Scanner;
public class EventPlanner {
    public static void main(String[] args) {
        //My Info
        System.out.println("Course: COP 2805C");
        System.out.println("Assignment: P3");
        System.out.println("Date: 09/21/2025");
        System.out.println("Student: Derron Coghiel");
        System.out.println();
        //scanner names sc
        Scanner sc = new Scanner(System.in);

        //asks the user about the event also the loop
        System.out.println("How many events would you like to create?");
        int number = sc.nextInt();

        Event[] events = new Event[number];
        for (int i = 0; i < number; i++){
            System.out.println("Hello! Please pick an option.\n#" + (i+1) +"\n1. Make your own event/event name\n2.Birthday Party\n3.Quinceanera");
        
            int response = sc.nextInt();
            sc.nextLine();
            //all of the events have these questions in common
                System.out.println("What is the date of this event? ex. 9/12/25");
                String date = sc.nextLine();

                System.out.println("What is the start time of the event? ex. 5:30 pm");
                String startTime = sc.nextLine();

                System.out.println("What is the end time of the event? ex. 5:30 pm");
                String endTime = sc.nextLine();

                System.out.println("What is the location of the event? ex. Times Square");
                String location = sc.nextLine();

                System.out.println("What is the address of the event? ex. 4001 W Tampa Bay Blvd, Tampa, FL 33614");
                String locationAd = sc.nextLine();

                System.out.println("What is the event name? ex. Times Square");
                String eventName = sc.nextLine();

                System.out.println("How many people will be attending this event? ex. 100");
                int guest = sc.nextInt();

                System.out.println("who is the point of contact for this event? ex. Andrew Seely");
                String poc = sc.nextLine();
                sc.nextLine();

                System.out.println("What is the price of this event? ex. 12.99");
                double price = sc.nextDouble();

            //Choice 1(Make your own event)
            if (response == 1) {
                events[i] = new Event(date, startTime, endTime, location,
                locationAd, eventName, guest, poc, price);
            }
            //Choice 2(Bday)
            else if (response == 2){
                System.out.println("What is the age? ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("What type of cake? ");
                String cake = sc.nextLine();

                System.out.println("How many candles? ");
                int candles = sc.nextInt();
                sc.nextLine();

                System.out.println("What are the decorations? ");
                String decorations = sc.nextLine();
                

                events[i] = new BirthdayParty(date, startTime, endTime, location, locationAd, eventName, 
                guest, poc, price, age, candles, cake, decorations);
            }
            else if (response == 3){
                System.out.println("How many damas or maids of honor will attend? ");
                int damas = sc.nextInt();

                System.out.println("Number of toasts performed: ");
                int toasts = sc.nextInt();
                sc.nextLine();

                System.out.println("What cake are you having? ");
                String cake = sc.nextLine();

                System.out.println("How many candles? ");
                int candles = sc.nextInt();
                sc.nextLine();

                System.out.println("How many decorations? ");
                String decorations = sc.nextLine();

                
                System.out.println("What music would you like played? ");
                String music = sc.nextLine();




                events[i] = new Quinceanera(date, startTime, endTime, location, locationAd, eventName, 
                guest, poc, price, candles, cake, decorations, damas, toasts, music);
            }
            else{
                System.err.println("Sorry I couldn't get that. Please try again.");
            }
        }

                //output
                System.out.println("********Event Planning********");
                for(Event e: events) {
                    System.out.println(e.toString());
                    System.out.println("****************");
                }


        sc.close();
    }
}