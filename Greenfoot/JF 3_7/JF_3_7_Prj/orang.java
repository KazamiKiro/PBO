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
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
    }
    public void detectWallCollision()
    {
        // respawn orang ketika collide dengan wall + sound
        if (isTouching(brick.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectBlockCollision()
    {
        // respawn orang ketika collide dengan block + sound
        if (isTouching(block.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome()
    {
        // respawn orang ketika collide dengan block + sound
        if (isTouching(house.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("yipee.wav");
        }
    }
}
