import java.util.Scanner;
class ReverseCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int rev_num = sc.nextInt();
        while(rev_num > 0){
            System.out.println(rev_num);
            rev_num--;
        }

    }
}