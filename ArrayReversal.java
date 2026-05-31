import java.util.Scanner;
class ArrayReversal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");         
        }
        System.out.println();
        System.out.println("Reversed Array ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");            
        }
        System.out.println();

        }
    }