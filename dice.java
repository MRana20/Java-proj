import java.util.Random;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        //code starts

        //DICE ROLL OMG WOW

        //steps
            //1. declare variables
            //2. get # dice from user
        while(true) {
            int sum=0;
            System.out.print("Enter the number of dice you want to roll : {Press 0 to exit} ");
            int num = scanner.nextInt();
            //3. check positivity
            if (num < 0) {
                System.out.printf("Cannot roll %d dice!", num);
            }
            else if(num==0){
                break;
            }
            else{
                for (int i=0;i<num;i++){
                    int num_on_die=random.nextInt(1,7);
                    asciiArt(num_on_die);
                    sum+=num_on_die;

                }
                System.out.println("The sum of the numbers of the dice is "+sum+".");
                break;
            }
        }
            //4. roll dice
            //5. get total

        //code ends
        scanner.close();
    }
static void asciiArt(int num_on_die){
    char dot ='●';
    char space=' ';
    System.out.printf("""
             -------
            | %c %c %c |
            |   %c   |
            | %c %c %c |
             -------
            """,(hasDot(1,num_on_die))?dot:space, hasDot(2,num_on_die)?dot:space, hasDot(3,num_on_die)?dot:space, hasDot(4,num_on_die)?dot:space, hasDot(5,num_on_die)?dot:space, hasDot(6,num_on_die)?dot:space, hasDot(7,num_on_die)?dot:space);

}
static boolean hasDot(int position, int num_on_die){
        switch (position){
            case 1,7 -> {
                return num_on_die == 4 || num_on_die == 5 || num_on_die == 6;

            }

            case 2,6 -> {
                return num_on_die == 6;
            }

            case 3, 5 -> {
                return num_on_die == 2 || num_on_die == 3 || num_on_die == 4 || num_on_die == 5 || num_on_die == 6;
            }


            case 4 -> {
                return num_on_die == 1 || num_on_die == 5 || num_on_die == 3;
            }

        }

    return false;
}

}
