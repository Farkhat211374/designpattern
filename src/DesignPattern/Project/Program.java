package DesignPattern.Project;
import java.util.Scanner;

public class Program {
    Scanner text = new Scanner(System.in);
    Transport transport = new Transport();

    //the beginning of the program
    public void start(){
        System.out.println("Welcome to our program user!");
        System.out.println("Create route:");

        System.out.println("add point - A");
        String A = text.nextLine();
        System.out.println("add point - B");
        String B = text.nextLine();
        System.out.println("add distance");
        int distance = text.nextInt();

        System.out.println("Choose your priority!");
        System.out.println("type '1' for the most cheapest option");
        System.out.println("type '2' for the most fastest option");

        optionDelegator(text.nextInt(), distance);

    }

    private void optionDelegator(int Option, int Distance){
        if(Option == 1 ){
            cheapTrip(Distance);
        }else{
            fastTrip(Distance);
        }
    }

    private void fastTrip(int distance){
            double fuel = transport.usageFuel(((double) distance));
            double time = transport.displacement(((double) distance));

            String exit = "0";
            while(exit != "1"){
                System.out.println("fuel to distance ratio is - " + fuel);
                System.out.println("time to distance ratio is - " + time);
                System.out.println("if you wanna go out type 1");
                System.out.println("else change transport like: car, plane, train, boat!");
                exit = text.nextLine();
                if(exit=="1"){
                    break;
                }
                changer(exit);
            }
    }

    private void cheapTrip(int distance){
        //
    }

    private void changer(String trans){
        if(trans=="1") return;
        if(trans == "car"){
            transport.setCar();
        }else if(trans == "boat"){
            transport.setBoat();
        }else if(trans == "plane"){
            transport.setPlane();
        }else if(trans == "train"){
            transport.setTrain();
        }else{
            System.out.println("text it correctly! pls:)");
        }
    }

}
