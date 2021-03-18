package exceptions;

import java.util.Scanner;

public class CatchApp {
    public static void main(String[] args) throws SubClassException {

        Scanner keyboard = new Scanner(System.in);
        try {
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            if (num <= 0 ){
                System.out.println("iets");
                throw new SubClassException("elaba dat goat niet goan eh ");
            }
            int div = num/den;
            System.out.format("%d/%d=%d" + "%n", num,den,div);
            keyboard.close();


        }catch (Exception e){
           e.printStackTrace();
        }finally {
            keyboard.close();
            System.out.println("arigato gozaimasu, Owari (==The End)");
        }



//        catch (NumberFormatException nfe){
//            System.out.println("Invalid number");
//            System.out.println(nfe.getMessage());
//            nfe.printStackTrace();
//        }catch (ArithmeticException ae){
//            System.out.println("Division by 0");
//        }

    }
}
