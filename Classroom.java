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
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();

        KabirShah kabirShah = new KabirShah("Kabir", "Shah", 1, 2);
        addObject(kabirShah, 1, 2);
        kabirShah.sitDown();

        OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 1, 3);
        addObject(olegbychenkov, 1, 3);
        olegbychenkov.sitDown();

        ShriyaRudrashetty shriyarudrashetty = new ShriyaRudrashetty("Shriya", "Rudrashetty", 1, 4);
        addObject(shriyarudrashetty, 1, 4);
        shriyarudrashetty.sitDown();

        EllaDeGuzman elladeguzman = new EllaDeGuzman("Ella", "DeGuzman", 1, 5);
        addObject(elladeguzman, 1, 5);
        elladeguzman.sitDown();

        EeshanWalia eeshanwalia = new EeshanWalia("Eeshan", "Walia", 1, 6);
        addObject(eeshanwalia, 1, 6);
        eeshanwalia.sitDown();

        KaushalRamalingam kaushalramalingam = new KaushalRamalingam("Kaushal", "Ramalingam", 1, 7);
        addObject(kaushalramalingam,1,7);
        kaushalramalingam.sitDown();
    }
}
