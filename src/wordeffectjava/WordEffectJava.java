/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordeffectjava;
import java.util.Scanner;

/**
 *
 * @author j.k.
 */
public class WordEffectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInputString;
        int userInputInt;
        Scanner userInput = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter your String");
        userInputString = userInput.nextLine();
        System.out.println("Your string was " + userInputString);
        System.out.println("Choose your operation\n 1. Uppercae\n 2. Lowercase\n 3. Numberize\n 4. Canadianzie\n 5. Respond\n 6. De-Space-It");
        userInputInt = userInput.nextInt();
        
        switch (userInputInt) {
            case 1:
                
                System.out.println(userInputString.toUpperCase());
                
                break;
                
            case 2:
                
                System.out.println(userInputString.toLowerCase());
                
                break;
                
            case 3:
                
                System.out.println(Integer.parseInt(userInputString));
                
                break;
                
            case 4:
                
                System.out.println(userInputString + " eh");
                
                break;
                
            case 5:
                
                if (userInputString.charAt(userInputString.length()-1) == '?') {
                
                    System.out.println("I don't know");
                
                } else if (userInputString.charAt(userInputString.length()-1) == '!') {
                
                    System.out.println("Whoa, calm down");
                
                }
                
                break;
                
            case 6:
                
                System.out.println(userInputString.replaceAll(" ", "-"));
                
                break;
                        
            }
            userInput.nextLine();
        }
        
        
        
        
        
    }
    
}
