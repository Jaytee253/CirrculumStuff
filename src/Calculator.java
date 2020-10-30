import java.util.Scanner;

public  class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, or /): ");
        String sign = userInput.next();

        System.out.println("Enter your first number: ");
        int firstNum = userInput.nextInt();

        System.out.println("Enter your second number: ");
        int secondNum = userInput.nextInt();
        System.out.println("Calculating");

        Calculating(sign, firstNum, secondNum);

    }


    public static int Calculating(String sign, int firstNum, int secondNum){
        int ans;

        if (sign.equals("+")){
            ans = firstNum + secondNum;

        } else if (sign.equals("-")) {
            ans = firstNum - secondNum;

        } else if (sign.equals("*")) {
            ans = firstNum * secondNum;

        } else if (sign.equals("/")){
            ans = firstNum / secondNum;

        } else {
            System.out.println("That is not an available operator. Please put in an operator that we can work with.");
            ans = 0;
        }

        System.out.println(ans);
        return ans;

    }

}


