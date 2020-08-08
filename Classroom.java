import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * This is the world where the student, Kaushik Pendiyala will reside in and 
 * perform their animations and present their lessons (Strings)
 * Kaushik Pendiyala 
 * Version 1.0
 * August 7, 2020
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
        KaushikPendiyala kaushikpendiyala = new KaushikPendiyala("Kaushik", "Pendiyala", 1, 1);
        addObject(kaushikpendiyala, 1, 1);
        kaushikpendiyala.sitDown();
         
        


    }  
}
