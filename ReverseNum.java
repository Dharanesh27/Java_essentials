import java.util.Scanner;
class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int store = 0;
        int count;
        while(input>0){

        count = input%10;
        store = store*10+count;
        input = input/10;
        }
       System.out.println(store);
    }
}