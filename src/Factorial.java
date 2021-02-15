import java.util.Scanner;

public class Factorial {

    static  int FindFactorial(int number){
        if(number == 0){
            return 1;
        }else if(number == 1){
            return 1;
        }else{
            return number * FindFactorial(number - 1);

        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number for Factorial");
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();

        //We need to ensure that the input is an integer

        while(!input.matches("[0-9]")){
            System.out.println("Enter a Valid number");
            input = read.nextLine();
        }
        Integer number = Integer.parseInt(input);
        Integer factorial = FindFactorial(number);
        System.out.println("Factorial of "+ number + " is "+ factorial);
    }
}
