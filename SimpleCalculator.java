import java.util.*;
class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short num1 = sc.nextShort();
        short num2 = sc.nextShort();
        System.out.println("Note: operations performed are add,sub,multiply,divide");
        String operation = sc.next();
        operation = operation.toLowerCase();
        switch (operation){
            case "add":
                System.out.println(num1+num2);
                break;
            case "sub":
                System.out.println(num1-num2);
                break;
            case "multiply":
                System.out.println(num1*num2);
                break;
            case "divide":
                if(num2==0){
                    System.out.println("ArithmeticException");
                }
                else{
                    System.out.println(num1/num2);  
                }
                break; 
            default:
                System.out.println("Invalid input..");
        }

    }
}
