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
public class Score {
    
    private static Score scoreInstance =  new Score();
    
    private int score;
    
    private Score(){
        score = 0;
    }
    
    public static Score getInstance(){
    return scoreInstance;
    }
    
    public int getScore(){
        return score;
    }
    public void addScore(){
        score += 5;
    }
    
}
