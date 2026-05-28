public class patterns2 {
    public static void main(String[] args){
// THERE ARE A LOT OF COMMENTS HERE, EACH PERMUTATION AND COMBINATION GENERATES A NEW PATTERN. UNCOMMENTED PART GENERATES A CASCADE OF 4,3,2,1.
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0||i==6||j==0||j==6){
                    System.out.print(4);
                } else if (i==1||i==5||j==1||j==5) {
                    System.out.print(3);
                }else if (i==2||i==4||j==2||j==4) {
                    System.out.print(2);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

      //       for (int i=1; i<=20; i=i+2){
//           System.out.println(i<10?(" ".repeat((9-i)/2)+"*".repeat((i)%20)):(" ".repeat((i-11)/2)+"*".repeat(20%i)));
//       }
//        int n=5;
//        for (int i=4;i>-5;i--){
//            System.out.println("*".repeat(n-Math.abs(i)));
//        }
//            so proud of myself for the code above
//        for(int i=0;i<4;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(j+1);
//            }
//            System.out.print(" ".repeat(2*(3-i)));
//            for(int j=i;j>=0;j--){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<6;i++) {//int i=5;i>0;i--
//            for (int j = 1; j <= i; j++) {
//                int asciiVal=64+j;
//                System.out.print((char)asciiVal); //typecasting
//            }
//            System.out.println();
//        }
//        for (int i=0;i<5;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print((char)(65+i));
//            }
//            System.out.println();
//        }
//
        //so proud of the logic above
//        for (int i=5; i>0;i--) {
//            for (int j = i; j<=5; j++) {
//                int asciiVal=64+j;
//                System.out.print((char)asciiVal); //typecasting
//            }
//            System.out.println();
//        }
//        for (int i=0;i<=20;i=i+2){//0,2,4,6,8,10,12,14,16,18
//
//            int repNum =Math.abs(5 - (i / 2));
//            if(repNum==0){continue;}
//            String repeat = "*".repeat(repNum);
//            System.out.println(repeat +" ".repeat(10-(2*repNum))+ repeat);
//        }
//        for(int i=1;i<=10;i++){
//            int repNum=5-(Math.abs(5-i));
//            String rep= "*".repeat(repNum);
//            System.out.println(rep+" ".repeat(10-(2*repNum))+rep);
//        }
//        for (int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                if(i==0|| j==0|| i==3||j==3){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
  
}
