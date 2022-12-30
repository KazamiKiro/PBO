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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Tambah Tembok
        brick brick = new brick();
        addObject(brick,54,138);
        brick brick2 = new brick();
        addObject(brick2,161,139);
        brick brick3 = new brick();
        addObject(brick3,269,139);
        brick brick4 = new brick();
        addObject(brick4,596,143);
        
        //TambahBlock
        block block = new block();
        addObject(block,432,139);
        
        //Tambah Hero
        orang orang = new orang();
        addObject(orang,36,39);
        
        //TambahPizza
        pizza pizza = new pizza();
        addObject(pizza,557,39);
        pizza pizza2 = new pizza();
        addObject(pizza2,129,43);
        pizza pizza3 = new pizza();
        addObject(pizza3,258,46);
        pizza pizza4 = new pizza();
        addObject(pizza4,751,224);
        pizza pizza5 = new pizza();
        addObject(pizza5,62,224);
        brick brick5 = new brick();
        addObject(brick5,704,142);
        brick brick6 = new brick();
        addObject(brick6,771,141);
        pizza pizza6 = new pizza();
        addObject(pizza6,55,459);
        
        //TambahScorePanel
        scorePanel scorePanel = new scorePanel();
        addObject(scorePanel,85,539);
        
        //TambahHouse
        house house = new house();
        addObject(house,734,533);
        
    }
}
