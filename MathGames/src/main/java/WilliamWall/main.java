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
       int max = 1;
       int min = 0;
       
       Score score = Score.getInstance();
       
       Scanner scanner = new Scanner(System.in);
       
       
       while(true){
       System.out.println("Hoe hard do you want the cums to be? (TYPE: HARD, MEDIUM OR EASY)");
       String difficulty = scanner.nextLine();
       
       if(difficulty.equalsIgnoreCase("hard")){
           max = 250;
           min = 20;
           break;
       }else if(difficulty.equalsIgnoreCase("medium")){
           max = 50;
           min = 10;
           break;
       }else if(difficulty.equalsIgnoreCase("easy")){
           max = 15;
           min = 1;
           break;
       }else{
           System.out.println("Please type one of the following: HARD , MEDIUM OR EASY");
       }
       }
       
       
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
                System.out.println("Please Enter a vaild number");
            }
            
            if ( (numOne + numTwo) == result) {
               score.addScore();
           }
       }
        System.out.println("Your Total Score is " + score.getScore());
  }
  
  
  
    
}
