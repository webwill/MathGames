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
       
       int operator = 0;
       
       
       
       int range = max - min + 1;
       
       for( int i =0; i< 10; i++){
            int numOne =  (int) (Math.random() * range) + min;
            int numTwo =  (int) (Math.random() * range) + min;
            
            operator  =(int) (Math.random()*(4-1+1)+1);
            
            switch (operator){
            case 1:
            System.out.println("What is " + numOne + " + " + numTwo + "?");
            break;
            case 2:
            System.out.println("What is " + numOne + " - " + numTwo + "?");
            break;
            case 3:
            System.out.println("What is " + numOne + " % " + numTwo + "?");
            break;
            case 4:
            System.out.println("What is " + numOne + " * " + numTwo + "?");
            break;
            }
            
            int result =0;
            
            while(true){
            String ans = scanner.nextLine();
            
            try{
            
            result = Integer.parseInt(ans);
            break;
            }catch(NumberFormatException e){
                System.out.println("Please Enter a vaild number");
            }
            }
            
            switch (operator){
            case 1:
                if ( (numOne + numTwo) == result) {
                   score.addScore();
                }
            break;
            case 2:
            if ( (numOne - numTwo) == result) {
                   score.addScore();
                }
            break;
            case 3:
            if ( (numOne % numTwo) == result) {
                   score.addScore();
                }
            break;
            case 4:
            if ( (numOne * numTwo) == result) {
                   score.addScore();
                }
            break;
            }
       }
        System.out.println("Your Total Score is " + score.getScore());
        System.exit(0);
  }
  
  
  
    
}
