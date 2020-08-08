import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * This is the world where students sit in a classroom and perform and animation.
 * 
 * @author Mark Owen Macasaet 
 * @version 8/07/20
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        MarkOwenMacasaet markowenmacasaet = new MarkOwenMacasaet("MarkOwen", "Macasaet", 10, 4);
        addObject(markowenmacasaet, 1, 1);
        markowenmacasaet.sitDown();
         
        


    }  
}
