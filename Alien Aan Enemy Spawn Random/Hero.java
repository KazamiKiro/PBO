import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public void act()
    {
    Bergerak();
    }
    public void Bergerak()
    {
            if(Greenfoot. isKeyDown("Up")){
        setLocation(getX(),getY()-5);
        }
        if(Greenfoot. isKeyDown("Down")){
        setLocation(getX(),getY()+5);
        }
        if(Greenfoot. isKeyDown("Left")){
        setLocation(getX()-5,getY());
        }    
        if(Greenfoot. isKeyDown("Right")){
        setLocation(getX()+5,getY());
        }
    }
}
