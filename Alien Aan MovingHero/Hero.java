import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("Right"))
        {
        setRotation(0);
        move(5);
    }
        if(Greenfoot.isKeyDown("Down"))
        {
        setRotation(90);
        move(5);
    }
        if(Greenfoot.isKeyDown("left"))
        {
        setRotation(180);
        move(5);
    }
        if(Greenfoot.isKeyDown("Up"))
        {
        setRotation(270);
        move(5);
    }
}
}
