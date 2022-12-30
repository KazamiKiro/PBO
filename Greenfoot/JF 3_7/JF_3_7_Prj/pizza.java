import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza here.
 * 
 * @author (andika_2115101003) 
 * @version (3_6)
 */
public class pizza extends Actor
{
    /**
     * Act - do whatever the pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //ketika pizza disentuh player maka pizza di remove + sound
        if (isTouching(orang.class))
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("eat.wav");
        }
    }
}
