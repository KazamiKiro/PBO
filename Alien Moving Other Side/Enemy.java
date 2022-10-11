import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
    setRotation(180);
    }
    public void act()
    {
    move(5);
    if (isAtEdge()){
    getWorld().removeObject(this);
    }
    
}   
}