import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
int speed = 2;
int timeShoot = 0;
int speedShoot = 5;
private boolean shooting;
   public void act()
   {
       laserShoot();
       bergerak();
      if (!shooting && Greenfoot.isKeyDown("space")) shooting = true;
        
        if (timeShoot > 0) 
        {
            timeShoot = timeShoot -1;
        }
        else if (shooting == true)
        {
            Actor laser = new Laser();
            timeShoot = speedShoot;
        }
    }
    public void bergerak()
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
    int laserTimer = 0;
    public void laserShoot(){
        if (laserTimer == 30){
            getWorld().addObject (new Laser(), getX() +5, getY());
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
