import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Actor
{
    /**
     * Act - do whatever the Explosion2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pausa =10;
    public void act()
    {
        if(pausa > 0) pausa--;
        else getWorld().removeObject(this);
    }
}
