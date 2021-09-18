/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathsGames;

/**
 *
 * @author william wall
 */



import MathsGames.Question;
import Model.Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
   
    
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
       questionReport(questions);
       System.exit(0);
  }
  //The questionReport method is user to inform the user of their performance.
  public static void questionReport(ArrayList<Question> questions){
  
      System.out.println("\n\n ****Game Result Report **** \n\n");
      for(int i = 0; i < questions.size(); i++){
           Question q = questions.get(i);
          System.out.println("\n Q"+i+ ". " + q.getQuestion());
          System.out.println("\n Your Answer: " + q.getUserAnswer() + "\n Corrent Answer:" + q.getAnswer());
          
      }
  }
}
