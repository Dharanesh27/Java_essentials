
import java.util.Scanner;

class ReverseSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int rev_sum = sc.nextInt();
        int collect = 0;
        while(rev_sum > 0){
            collect += rev_sum;
            rev_sum--;
            System.out.println(collect);
        }

    }
}