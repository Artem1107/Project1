import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input amount worked hours: ");
        int x = scan.nextInt();
        System.out.println("Input your tariff");
        int y = scan.nextInt();



        System.out.println("You will get " + payment(x,y)+" rub");

    }



    public static  int payment (int hours, int tariff){
        int salary = hours*tariff;
            return salary;
    }


        }