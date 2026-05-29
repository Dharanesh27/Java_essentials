import java.util.Scanner;
class Password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int totalAttemptsLeft;
        String correctPassword = "java1234";
        while(true){
            System.out.print("Enter password: ");
            String password = sc.next();
            if(correctPassword.equals(password)){
                System.out.println("Loggedin Successfully...");
                break;
            }
            else{
                count++;
                totalAttemptsLeft = 3 - count;
                if(count != 3){
                System.out.println("Attempts left: " + totalAttemptsLeft+ ", Try Again...");
                }
                if(count==3){
                    System.out.println("Access Blocked...!");
                    break;
                }
            }
        }
    }
}