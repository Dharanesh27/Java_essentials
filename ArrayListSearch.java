
import java.util.*;

class ArrayListSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int store = 0;
        boolean isTarget = false;
        for (int i = 0; i < n; i++) {
            if(list.get(i) == target){
                isTarget = true;
                store = i;
                break;
            }
        }
            if(isTarget){
                System.out.println("Target found at position: " + store);
            }
            else{
                System.out.println("No such target in the input..!");
            }  
    }
}