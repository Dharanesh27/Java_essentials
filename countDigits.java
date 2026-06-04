
import java.util.Scanner;

class countDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int num = sc.nextInt();
        int count = 0;
        if(num == 0){
            count =1;
        }
        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}