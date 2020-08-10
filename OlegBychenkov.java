import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Specific Oleg student that sets all the student-specific details like the
 * name, location, and image files. Special movement when clicked is moving
 * in random directions for 30 ticks.
 * 
 * @ author Oleg Bychenkov
 * @ version 1.0
 */
public class OlegBychenkov extends Student implements SpecialInterestOrHobby, NumberOfSiblings, CSALearnedSoFar
{

    /**
     * Constructor for the OlegBychenkov class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public OlegBychenkov(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public OlegBychenkov() {
        firstName="Oleg";
        lastName="Bychenkov";
        myRow=2;
        mySeat=3;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the OlegBychenkov actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I enjoy reading fantasy and science fiction");
            System.out.println("I have " + Integer.toString(numberOfBrothers()) +" brother.");
            LearnedSoFar();
            
            bounceAround();
            returnToSeat();
            provideLesson();
            sitDown();
        }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void provideLesson(){
        Greenfoot.delay(30);
        while (!sitting) {
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes")){
         bluej.utility.Utility.openWebBrowser("https://drive.google.com/file/d/1xE0wQSPAU1Ku_Fzbr64Y8EkrfhlJKMiO/view?usp=sharing%22");
        }
        else {
          q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
        }
         if (q.equals("yes")){
            Greenfoot.delay(10);
            sitDown();
        }
    }
        
    }
    public void answerQuestion(){
        // may not need
    }
    /**
     * This is a local method specific to the OlegBychenkov class used to animate the character once the image is clicked on.
     * Moves the character constantly, turning a random direction every 5 ticks
     * and bouncing off edges for a total of 30 ticks and then return to seat.
     */
    public void bounceAround(){
         Greenfoot.delay(10);
        // bounce
        for (int i=1;i<=30;i++){
            move(1);
            if (i % 5 == 0) {
                turn(Greenfoot.getRandomNumber(360));
            }
            if (isAtEdge()) {
                turn(86);
            }
            Greenfoot.delay(5);
        }   
           returnToSeat();
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
     }
     public void LearnedSoFar() {
         System.out.println("So far in CSA I have learned the basics of Java such as syntax, objects and constructors as well as refactoring code.");
     }
     public int numberOfSiblings() {
         return 1;
     }
     public int numberOfBrothers() {
         return 1;
     }
     public int numberOfSisters() {
         return 0;
     }
     

}