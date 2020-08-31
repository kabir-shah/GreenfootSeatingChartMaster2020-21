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
        KabirShah kabirShah = new KabirShah("Kabir", "Shah", 1, 1);
        addObject(kabirShah, 1, 1);
        kabirShah.sitDown();

        OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 1, 2);
        addObject(olegbychenkov, 1, 2);
        olegbychenkov.sitDown();

        ShriyaRudrashetty shriyarudrashetty = new ShriyaRudrashetty("Shriya", "Rudrashetty", 1, 3);
        addObject(shriyarudrashetty, 1, 3);
        shriyarudrashetty.sitDown();

        EllaDeGuzman elladeguzman = new EllaDeGuzman("Ella", "DeGuzman", 1, 4);
        addObject(elladeguzman, 1, 4);
        elladeguzman.sitDown();

        EeshanWalia eeshanwalia = new EeshanWalia("Eeshan", "Walia", 1, 5);
        addObject(eeshanwalia, 1, 5);
        eeshanwalia.sitDown();

        KaushalRamalingam kaushalramalingam = new KaushalRamalingam("Kaushal", "Ramalingam", 1, 6);
        addObject(kaushalramalingam,1,6);
        kaushalramalingam.sitDown();

        AnishKolan anishKolan = new AnishKolan("Anish", "Kolan", 1, 7);
        addObject(anishKolan, 1, 7);
        anishKolan.sitDown();

        ArinManohar arinmanohar = new ArinManohar("Arin", "Manohar", 1, 8);
        addObject(arinmanohar, 1, 8);
        arinmanohar.sitDown();

        ShaanMathur shaanmathur = new ShaanMathur("Shaan", "Mathur", 2, 1);
        addObject(shaanmathur, 2, 1);
        shaanmathur.sitDown();

        JennyWang jennywang = new JennyWang("Jenny", "Wang", 2, 2);
        addObject(jennywang, 2, 2);
        jennywang.sitDown();

        GraceLiu graceliu = new GraceLiu("Grace", "Liu", 2, 3);
        addObject(graceliu, 2, 3);
        graceliu.sitDown();

        AnikaSharma anikasharma = new AnikaSharma("Anika", "Sharma", 2, 4);
        addObject(anikasharma, 2, 4);
        anikasharma.sitDown();

        ShreyaChandra shreyachandra = new ShreyaChandra("Shreya", "Chandra", 2, 5);
        addObject(shreyachandra, 2, 5);
        shreyachandra.sitDown();

        KarenZhao karenzhao = new KarenZhao("Karen", "Zhao", 2, 6);
        addObject(karenzhao, 2, 6);
        karenzhao.sitDown();

        TameemSaydi tameemsaydi = new TameemSaydi("Tameem", "Saydi", 2, 7);
        addObject(tameemsaydi, 2, 7);
        tameemsaydi.sitDown();

        KaushikPendiyala kaushikpendiyala = new KaushikPendiyala("Kaushik", "Pendiyala", 2, 8);
        addObject(kaushikpendiyala, 2, 8);
        kaushikpendiyala.sitDown();

        MarkOwenMacasaet markowenmacasaet = new MarkOwenMacasaet("MarkOwen", "Macasaet", 3, 1);
        addObject(markowenmacasaet, 3, 1);
        markowenmacasaet.sitDown();

        RohanGovindarajan rohangovindarajan = new RohanGovindarajan("rohan", "govindarajan", 3, 2);
        addObject(rohangovindarajan, 3, 2);
        rohangovindarajan.sitDown();

        AkhilGiridhar akhilgiridhar = new AkhilGiridhar("Akhil", "Giridhar", 3, 3);
        addObject(akhilgiridhar, 3, 3);
        akhilgiridhar.sitDown();

        AnshulKashyap anshulkashyap = new AnshulKashyap("Anshul", "Kashyap", 3, 4);
        addObject(anshulkashyap, 3, 4);
        anshulkashyap.sitDown();

        JustinFok justinfok = new JustinFok("Justin", "Fok", 3, 5);
        addObject(justinfok, 3, 5);
        justinfok.sitDown();
    }
}
