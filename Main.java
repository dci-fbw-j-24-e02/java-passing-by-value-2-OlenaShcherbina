import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int number = scan.nextInt();

        System.out.println("Number = " + number);
        main.increment(number);
        System.out.println("Number after calling the increment method = " + number);

        scan.close();
    }

    public void increment(int value){

        value++;
        System.out.println("Number after incrementing = " + value);
    }

}
