import java.util.Scanner;

public class TurtleTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("1 to pen up");
        System.out.println("2 to pen down");
        System.out.println("3 to turn right");
        System.out.println("4 to turn left");
        System.out.println("5 to move");
        System.out.println("6 to display");
        System.out.println("9 to cikis");
        int secim =0;
        
        String str[];
        Turtle turtle = new Turtle();
        while(secim!=9){
            str = scanner.nextLine().split(",");
            secim = Integer.parseInt(str[0]);
            
            switch(secim){
                case 1:
                    turtle.penUp();
                    break;
                case 2:
                    turtle.penDown();
                    break;
                case 3:
                    turtle.TRight();
                    break;
                case 4:
                    turtle.TLeft();
                    break;
                case 5:
                    turtle.Move(Integer.parseInt(str[1]));
                    break;
                case 6:
                    turtle.Display();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("hatali secim");
            }      
        }
    }
}