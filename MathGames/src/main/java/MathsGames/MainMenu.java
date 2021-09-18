/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author willi
 */
public class MainMenu {
    
    public MainMenu(){
        
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        JButton question = new JButton("Start Question");
       
        
        JPanel panel = new JPanel();
        
        panel.add(question);
        frame.add(panel);
    }
    
    
    
}
