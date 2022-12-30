import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orang here.
 * 
 * @author (andika_2115101003) 
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
        //gerak orang
        
    }
    public void detectWallCollision()
    {
        // respawn orang ketika collide dengan wall
        if (isTouching(brick.class))
        {
            setLocation(45,50);
        }
    }
    public void detectBlockCollision()
    {
        // respawn orang ketika collide dengan block
        if (isTouching(block.class))
        {
            setLocation(45,50);
        }
    }
}
