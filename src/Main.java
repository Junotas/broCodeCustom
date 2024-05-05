import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
try {
    checkAge(age);
}
catch (Exception e){
    System.out.println("a problem occured: "+e);
}

    }
    static void checkAge(int age) throws AgeException{
        if (age < 18) {
            throw new AgeException("\n"+"you must be 18 or older");
        }
        else {
            System.out.println("you are now signed up");
        }

    }
}