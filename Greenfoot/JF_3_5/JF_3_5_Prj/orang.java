import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orang here.
 * 
 * @author (andika) 
 * @version (3_6)
 */
public class orang extends Actor
{
    /**
     * Act - do whatever the orang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
    public void robotMovement()
    {
        //next section
    }
    public void detectWallCollision()
    {
        // ketika menabrak wall akan kembali ke tempat awal
        if (isTouching(brick.class))
        {
            setLocation(45,50);
        }
    }
    public void detectBlockCollision()
    {
        // ketika menabrak block akan kembali ke tempat awal
        if (isTouching(brick.class))
        {
            setLocation(45,50);
        }
    }
}
