import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg_World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg_World extends World
{

    /**
     * Constructor for objects of class Bg_World.
     * 
     */
    public Bg_World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        orang orang = new orang();
        addObject(orang,183,199);
        block block = new block();
        addObject(block,447,51);
        orang.setLocation(192,197);
        orang.setLocation(295,220);
    }
}
