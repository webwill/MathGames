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


import java.util.ArrayList;
import java.util.Scanner;

public class main {
   
   
    
  public static void main(String[] args){
      
       ArrayList<Question> questions = new ArrayList<>(); 
      
       String difficulty;
       
       //Score is used to track user's score
       Score score = Score.getInstance();
       
       Scanner scanner = new Scanner(System.in);
       
       
       while(true){
       System.out.println("Hoe hard do you want the sums to be? (TYPE: HARD, MEDIUM OR EASY)");
       difficulty = scanner.nextLine();
        
           //Validate the user input
           if (difficulty.equalsIgnoreCase("hard") || difficulty.equalsIgnoreCase("medium") || difficulty.equalsIgnoreCase("easy")){ 
               break;
           } 
           
           System.out.println("Please type one of the following: HARD , MEDIUM OR EASY");
       
       }
       
       //The Game itself
       for(int i =0; i< 10; i++){
            //Create a new Question based on the difficulty selected
            Question q = new Question(difficulty);
            
            //loop until the user enters a number
            while(true){
            System.out.println(q.getQuestion());
            
            try{
            int answer = Integer.parseInt(scanner.nextLine());
            
            //check the user's answer and add to the score if correct!
            if(q.answerQuestion(answer)){
                score.addScore();
            } 
            break;
            }catch(NumberFormatException e){
                System.out.println("Please Enter a vaild number");
            }
         }
            //add the question to the arraylist!(saved for the reporting)
            questions.add(q);
       }
       
       //Tell the user their score and end the game"!
       System.out.println("Your score is " + score.getScore());
       System.exit(0);
  }
}
