package homework_3;

import java.util.Scanner;

public class Homework_3 {

    rabbits[] Rabbits;
    turtle[] Turtle;

    public void Start() {

        int turtleNumber, rabbitNumber, winnerCount = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Tortoise numbber :  ");
        turtleNumber = scan.nextInt();

        System.out.print("Enter the Hare numbber     :  ");
        rabbitNumber = scan.nextInt();

        Rabbits = new rabbits[rabbitNumber]; // tavşanları tutacak diziyi oluşturuduk (kaplumbağa sayısınca)

        for (int i = 0; i < rabbitNumber; i++) {

            Rabbits[i] = new rabbits("HARE " + (i + 1));

        }

        Turtle = new turtle[turtleNumber]; // kaplumbağaları tutacak diziyi oluşturuduk (kaplumbağa sayısınca)

        for (int i = 0; i < turtleNumber; i++) {

            Turtle[i] = new turtle("TORTOISE  " + (i + 1));

        }

        int round = 0; //Raud sayısını tutuyor.

        boolean flag = false; /// FLAG

        while (!flag) {

            System.out.println("ROUND " + (round + 1));
            System.out.println("__________________\n");

            //Tavşanların for döngüsü
            for (int i = 0; i < rabbitNumber; i++) {

                Rabbits[i].Move();
                Rabbits[i].Print();

                if (Rabbits[i].getRabbitLocation() == 70) {
                    flag = true;
                    winnerCount++; // kazanan sayısı sayılıyor.
                }
            }

            //Kaplumbağaların for döngüsü
            for (int i = 0; i < turtleNumber; i++) {

                Turtle[i].Move();
                Turtle[i].Print();
                if (Turtle[i].getTurtleLocation() == 70) {
                    flag = true;
                    winnerCount++;  // kazanan sayısı sayılıyor.
                }
            }

            System.out.println("\n");

            round += 1;  //while dögüsü her bittiğinde "round" bir artıyor.
        }

        WhoIsTheWinner(winnerCount);  // Metodumuza yönlendirdik.

    }

    public void WhoIsTheWinner(int winnerCount) {

        if (winnerCount == 1) {

            for (rabbits HARE : Rabbits) {
                if (HARE.getRabbitLocation() == 70) {
                    System.out.println(HARE.getName() + " wins. Yuch.");
                }

            }

            for (turtle TORTOISE : Turtle) {
                if (TORTOISE.getTurtleLocation() == 70) {
                    System.out.println(TORTOISE.getName() + " WINS!!! YAY!!");
                }

            }

        } 
        
        else {

            System.out.print("It's a tie beetwen   ");
            for (rabbits HARE : Rabbits) {
                if (HARE.getRabbitLocation() == 70) {

                    System.out.print(HARE.getName() + " ");
                    System.out.print((winnerCount == 1) ? "  " : "AND "); //short if kullanıldı
                    winnerCount--;
                }

            }

            for (turtle TORTOISE : Turtle) {
                if (TORTOISE.getTurtleLocation() == 70) {

                    System.out.print(TORTOISE.getName() + " ");
                    System.out.print((winnerCount == 1) ? "  " : "AND "); //short if kullanıldı
                    winnerCount--;

                }

            }
        }

    }

}
