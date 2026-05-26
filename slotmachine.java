import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    static Scanner scanner=new Scanner(System.in);
    static Random random=new Random();
    static String[] spinRow={"🍒","🍉","🔔","🍋","⭐"};
    public static void main(String[] args){
        //DECLARE VAR

        double balance=1000,bet;

        //DISPLAY WELCOME MESSAGES
        System.out.print("------------------------------------");
        System.out.print("WELCOME TO AN EVIL GAME THAT BURNS YOUR POCKETS.");
        System.out.println("------------------------------------");
        //PLAY IF BALANCE >0
        while(balance>0){
            System.out.println("balance is : " +balance);
            while (true) {
                System.out.print("Enter the bet amount : ");
                bet = scanner.nextDouble();
                if (bet < 0) {
                    System.out.println("Negative bet");
                } else if (bet == 0) {
                    System.out.println("Zero bet");
                } else {
                    if (bet > balance) {
                        System.out.println("bet can't be greater than balance");
                    } else {
                        scanner.nextLine();
                        System.out.println("Computers choice : "+spinMachine()[0]+spinMachine()[1]+spinMachine()[2]);
                        System.out.println("Enter your choice of emojis : ");
                        String customerChoice= scanner.nextLine();

                        Payout();
                        break;
                    }
                }
            }
        }

        //SPIN ROW
        //PRINT ROW
        //GET PAYOUT
        //ASK TO PLAY AGAIN
        //DISPLAY EXIT MESSAGE

    }
    static String[] spinMachine(){
        String emo1=spinRow[random.nextInt(0,5)];
        String emo2=spinRow[random.nextInt(0,5)];
        String emo3=spinRow[random.nextInt(0,5)];
        String [] emoRow ={emo1,emo2,emo3};
        return emoRow;
    }
    static int Payout(){}

}
