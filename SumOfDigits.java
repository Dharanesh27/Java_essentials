import java.util.Scanner;
class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int store = 0;
        while(num > 0){
            store = num%10;
            count +=store;
            num = num/10;
        }
        System.out.println(count);

    }
}