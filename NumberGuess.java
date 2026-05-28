import java.util.*;
class NumberGuess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int secret_number=7;
        do{
        System.out.print("Guess the number: ");
        number = sc.nextInt();
        if(secret_number != number){ 
            System.out.println("Try again...");
        }
        if(secret_number > number){ 
            System.out.println("Too low");
        }
        else if(secret_number < number){ 
            System.out.println("Too high");
        }

        }
        while(secret_number != number);
        if(secret_number == number){
            System.out.println("correct number");
        }
    }
}