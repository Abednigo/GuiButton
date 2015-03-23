/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guibutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abednigo
 */

public class SwingTest extends JFrame implements ActionListener
{
    JPanel mypanel;
    JButton mybutton1;
    JLabel mylabel1;
    JButton mybutton2;
    JLabel mylabel2;
    JFrame redpill;
    JFrame bluepill;
    JButton mybutton3;
    JLabel mylabel3;
    JButton mybutton4;
    JLabel mylabel4;
     JButton mybutton5;
    JLabel mylabel5;
    JButton mybutton6;
    JLabel mylabel6;
  
    public SwingTest()
    {
           
     mypanel=new JPanel();
     mybutton1=new JButton("Red Pill");
     mybutton1.addActionListener(this);
     mylabel1=new JLabel();
     mybutton1.setToolTipText("Stay in Wonderland and I'll show you how deep the rabbit-hole goes.");       
    
     mybutton2=new JButton("Blue Pill");
     mylabel2=new JLabel();
     mybutton2.setToolTipText("The story ends, you wake up in your bed and believe whatever you want to believe.");   
     mybutton2.addActionListener(this);
     
     
     mypanel.add(mybutton1);
     mypanel.add(mylabel1);
     mypanel.add(mybutton2);
     mypanel.add(mylabel2);
     
     this.add(mypanel);
      }
   
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
         if(event.getSource()==mybutton1)
          {
              JFrame redpill=new JFrame();
              redpill.setVisible(true);
              redpill.setSize(400,400);
              mypanel=new JPanel();
              mybutton3=new JButton("Here We Go!");
              mybutton3.addActionListener(new ActionListener(){
              
                  @Override
                     public void actionPerformed(ActionEvent e) 
                        {
                            if(e.getSource()==mybutton3)
                 {
                     JFrame theOne=new JFrame();
                     theOne.setVisible(true);
                     theOne.setSize(200,200);
                     mypanel=new JPanel();
                     JLabel mrAnderson=new JLabel("I know KungFu...");
                     
                     mypanel.add(mrAnderson);
                     theOne.add(mypanel);
                 
                 }
                        }
              
                     });
              
              mylabel3=new JLabel();
              
              mybutton4=new JButton("Wait, I changed my Mind.");
               mybutton4.addActionListener(new ActionListener(){
              @Override
                     public void actionPerformed(ActionEvent e) 
                        {
                            if(e.getSource()==mybutton4)
                 {
                     JFrame theOne=new JFrame();
                     theOne.setVisible(true);
                     theOne.setSize(200,200);
                     mypanel=new JPanel();
                     JLabel mrAnderson=new JLabel("Get back to work Mr. Anderson.");
                     
                     mypanel.add(mrAnderson);
                     theOne.add(mypanel);
                 
                 }
                        }
              
                     });
              mylabel4=new JLabel();
          
              mypanel.add(mybutton3);
              mypanel.add(mylabel3);
              mypanel.add(mybutton4);
              mypanel.add(mylabel4);
     
              redpill.add(mypanel);
          }
         
          if(event.getSource()==mybutton2)
           {
                JFrame bluepill=new JFrame();
                bluepill.setVisible(true);
                bluepill.setSize(400,400);
              mypanel=new JPanel();
              mybutton5=new JButton("Put me back to sleep.");
              mybutton5.addActionListener(new ActionListener(){
              @Override
                     public void actionPerformed(ActionEvent e) 
                        {
                            if(e.getSource()==mybutton5)
                 {
                     JFrame theOne=new JFrame();
                     theOne.setVisible(true);
                     theOne.setSize(200,200);
                     mypanel=new JPanel();
                     JLabel mrAnderson=new JLabel("You are not the One.");
                     
                     mypanel.add(mrAnderson);
                     theOne.add(mypanel);
                 
                 }
                        }
              
                     });
              
              mylabel5=new JLabel();
              
              mybutton6=new JButton("I am the One!");
              mybutton6.addActionListener(new ActionListener(){
              
              @Override
                     public void actionPerformed(ActionEvent e) 
                        {
                            if(e.getSource()==mybutton6)
                 {
                     JFrame theOne=new JFrame();
                     theOne.setVisible(true);
                     theOne.setSize(200,200);
                     mypanel=new JPanel();
                     JLabel mrAnderson=new JLabel("Welcome to the Real World.");
                     
                     mypanel.add(mrAnderson);
                     theOne.add(mypanel);
                 
                 }
                        }
              
                     });
                  
                  mylabel6=new JLabel();
          
              mypanel.add(mybutton5);
              mypanel.add(mylabel5);
              mypanel.add(mybutton6);
              mypanel.add(mylabel6);
              
              //this.add(bluepill);
             bluepill.add(mypanel);
             
              
              
                
           }
       
    }
    
    
    
    
  public static void main(String args[])
    {
   SwingTest first=new SwingTest();
   first.setTitle("Hello Neo");
   first.setSize(400,400);
   first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   first.setVisible(true);
             
    }

}
        
            

  
    
    


