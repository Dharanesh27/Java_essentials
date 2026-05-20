

public class ifelse{
    public static void main(String[] args){
        var alarm = true;
        var bath = true;
        var breakfast = true;
        var learn = true;
        
        if(alarm){
            System.out.println("Wake up");
        }
        else{
            System.out.println("Don't Wake up");
        }
        System.out.println("Go to bathroom");
        if(bath){
            System.out.println("Take bath");
        }
        else{
            System.out.println("Don't take bath");
        }
        System.err.println("Go to breakfast");
        if(breakfast){
            System.out.println("Eat breakfast");
        }
        else{
            System.out.println("Don't eat breakfast");
        }
        System.out.println("Go to learn");
        if(learn){
            System.out.println("Continue to learn");
        }
        else{
            System.out.println("Don't learn");
        }
    }
} 