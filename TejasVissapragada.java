import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TejasVissapragada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TejasVissapragada extends Student implements SpecialInterestOrHobby 
{
    /**
     * Act - do whatever the TejasVissapragada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TejasVissapragada() {
       firstName="Tejas";
       lastName="Vissapragada";
       myRow=2;
       mySeat=1;
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
    }
    public TejasVissapragada(String f, String l, int r, int c) {
       firstName=f;
       lastName=l;
       myRow=r;
       mySeat=c;
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
    }
    public void myHobby(String s){
        System.out.println(s);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sitting = false;
            setImage(standingFile);
            System.out.println("");
            getName();
            myHobby("I like to play basketball");
            sayName(soundFile);
            specialMethod();
            provideLesson();
            sitDown();
        }
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    } //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
    public void provideLesson(){
        while(!sitting){
            String answer = Greenfoot.ask("Are you ready to start");
            if(answer.contains("yes")){
                bluej.utility.Utility.openWebBrowser("https://youtu.be/bUDmwb2AKh0");
                sitDown();
                break;
            }
            answer = Greenfoot.ask("May I sit?");
            if(answer.equals("yes")){
                Greenfoot.delay(10);
                sitDown();
            }
        }
    } // each group should implement their own version of this method.
                                           // See the notes in the assignment instructions for possible implementation.
    public void answerQuestion(){}
    public void specialMethod(){
        boolean end = false;
        for(int i = 1; i<4; i++){
            for(int x = 0; x<72; x++){
                turn(5);
                Greenfoot.delay(2);
            }
        }
    }
}
