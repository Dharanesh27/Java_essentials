import java.util.Scanner;
class NumCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();
        if(num_1 > num_2 && num_1>num_3){
            System.out.println("num_1 is greater!!");
        }
        if(num_2>num_1 && num_2>num_3){
            System.out.println("num_2 is greater!!");
        }
        else{
            System.out.println("num_3 is greater!!");
        }
    }
}