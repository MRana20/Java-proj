import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ad1");
        String adjective1= scanner.nextLine();
        System.out.println("ad2");
        String adjective2=scanner.nextLine();
        System.out.println("ad3");
        String adjective3=scanner.nextLine();
        System.out.println("noun");
        String noun=scanner.nextLine();
        System.out.println("verb");
        String verb=scanner.nextLine();

        System.out.println("Today I went to a " +adjective1 + "zoo.");
        System.out.println("In the exhibit I saw a " +noun);
        System.out.println(noun + " was " +adjective2 +" and "+verb);
        System.out.println("I was "+adjective3);
        scanner.close();
    }
}
