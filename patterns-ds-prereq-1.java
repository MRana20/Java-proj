// essentially, all the patterns one could think of. Comments mark the changes required to switch up the patterns

public class Patterns {
    public static void main(String[] args){
        //int n=5;
//        for (int i=0; i<n;i++){
        // repeat n times for the grid
//            System.out.println("*".repeat(i+1));    for the triangle
//        }
//        for (int i=0; i<n;i++){
//            for (int j=0;j<=i;j++){
//                //System.out.print(j+1);
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }
//        for (int i=n; i>0;i--){
//            System.out.println("*".repeat(i));
//        }
//        for (int i=n; i>0;i--){
//            for (int j=0; j<i;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }
        int n=9;
//        int i=Math.floorDiv(n,2);
//        while(i>=0){
//
//            //System.out.println(" ".repeat(i)+"*".repeat(n-(2*i)));  //+" ".repeat(i)
//
//
//            i--;
        int i=0;
        while(i<n){
            System.out.println(" ".repeat(i/2)+"*".repeat(n-i));
            i=i+2;
        }

        }
    }

