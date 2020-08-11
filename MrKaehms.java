import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Introduces the teacher Mr. Kaehms.
 * 
 * @author Karen Zhao 
 * @version August 10, 2020
 */
public class MrKaehms extends Teacher //implements JustForFun
{ 
    public MrKaehms () {

    setLocation(mySeat,myRow);
 
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
         //   getName(); 
              sayName("bobkaehms.wav");
        }
    } 
    public void getName(){
        System.out.println("\n My name is Bob Kaehms");
    }
}
