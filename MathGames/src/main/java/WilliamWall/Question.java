/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WilliamWall;

/**
 *
 * @author willi
 */
public class Question {
    
    private int range,max,min,numOne,numTwo,answer,operator;
    private String question;
    
    public Question(String difficulty){
        switch(difficulty){
            case "hard":
              max = 250;
              min = 20;
              break;
              
           case "medium":
           max = 50;
           min = 10;
           break;
           
           case "easy":
           max = 15;
           min = 1;
           break;
    }
     range = (int)(max-min+1) + min;
     numOne =  (int) (Math.random() * range) + min;
     numTwo =  (int) (Math.random() * range) + min;
     operator =(int) (Math.random()*(4-1+1)+1);
     /*
     switch(operator){
         case 1:
             addQuestion();
         break;
         case 2:
             subQuestion();
        break;            
     }
*/
     addQuestion();
    }
    
    public String getQuestion(){
        return question;
    }
    
    public boolean answerQuestion(int ans){
        return answer == ans;
    }
    
    
    public Boolean answeredCorrently(){
        return false;
    }
    
    private void addQuestion(){
     question =  numOne + " + " + numTwo + "?";
     answer = numOne + numTwo;
    }
    private void subQuestion(){}
    
}
