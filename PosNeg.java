import java.util.Scanner;
class PosNeg{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int number = sc.nextInt();
           if(number>0){
            System.out.println("The "+number+ " is positive");
           }
           else{
            System.out.println("The"+ number +" is Negative");
           }

    }
}