
import java.util.Scanner;

class SortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isBoolean = true;
        for (int i = 0; i < num-1; i++) {
            if(arr[i]> arr[i+1]){
                isBoolean = false;
                break;
            }    
        }
        if(isBoolean){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}