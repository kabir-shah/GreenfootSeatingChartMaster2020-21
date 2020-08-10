import java.util.*;
import greenfoot.*;
import java.util.ArrayList;

/**
 * Sets the size of the world and creates the students
 *
 * @author (your name)
 * @version (a version number or a date)
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
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();

        KabirShah kabirShah = new KabirShah("Kabir", "Shah", 1, 2);
        addObject(kabirShah, 1, 2);
        kabirShah.sitDown();

        OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 1, 3);
        addObject(olegbychenkov, 1, 3);
        olegbychenkov.sitDown();

    }
}
