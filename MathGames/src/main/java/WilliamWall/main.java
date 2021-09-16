/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WilliamWall;

/**
 *
 * @author william wall
 */


import java.util.Scanner;

public class main {
   
  
    
  public static void main(String[] args){
      
       int gameScore =0;
       Scanner scanner = new Scanner(System.in);
       
       
       
       int max = 10;
       int min = 1;
       int range = max - min + 1;
       
       for( int i =0; i< 10; i++){
            int numOne =  (int) (Math.random() * range) + min;
            int numTwo =  (int) (Math.random() * range) + min;

            System.out.println("What is " + numOne +" + " + numTwo + "?");
            
            String ans = scanner.nextLine();
            
            int result =0;
            
            try{
            
            result = Integer.parseInt(ans);
            }catch(NumberFormatException e){
            
                System.err.println("Please Enter a vaild number");
            }
            
            if ( (numOne + numTwo) == result) {
               gameScore += 5;
           }
       }
        System.out.println("Your Total Score is " + gameScore);
  }
  
  
  
    
}
