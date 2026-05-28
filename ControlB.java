import java.util.*;
class ControlB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if(n>=0){
                count ++;
            }
            else{
                break;
            }
        }
        System.out.println("Non-negative numbers entered correctly: "+count);
    }
}
