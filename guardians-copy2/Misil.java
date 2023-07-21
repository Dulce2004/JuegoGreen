import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Misil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misil extends Actor
{
    /**
     * Act - do whatever the Misil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void movimiento(){
        setLocation(getX(),getY()-5);
        if(getY()<20){
            getWorld().removeObject(this);
        }
        else{
            controlar();
        }
    }
    public void controlar(){
        if(isTouching(Enemigo.class)){
            getWorld().addObject(new Explosion(), getX(), getY());
            MyWorld m= (MyWorld)getWorld();
            m.addScore(20);
            
            Greenfoot.playSound("explosion.wav");
            removeTouching(Enemigo.class);
        }
    }
    public void act()
    {
        // Add your action code here.
    }
}
