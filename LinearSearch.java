
import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Target : ");
        int target = sc.nextInt();
        boolean found = false;
        int a;
        for (a = 0; a < n; a++) {
            if(arr[a] == target){
                found = true;
                break;
            }
            
        }
        if(found){
            System.out.println("Number found in index: "+ a);
        }
        else{
            System.out.println("No value");
        }

    }
}