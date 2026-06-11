import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int num = sc.nextInt();
        int dupNum = num;
        int dupnum1 = num;
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        int digit = count;
        int arm =0;
        while(dupNum > 0){
            int last = dupNum%10;
            int power = (int) Math.pow(last,digit);
            arm += power;
            dupNum /=10;
        }
        System.out.println(arm==dupnum1);
    }
}