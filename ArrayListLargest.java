
import java.util.*;

class ArrayListLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int largest = list.get(0);
        for (int i = 1; i < n; i++) {
            if(list.get(i) > largest){
                largest = list.get(i);
            }
            
        }
        System.out.println("Largest: " + largest);
    }
}