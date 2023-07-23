import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lase3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lase3 extends Actor
{
    /**
     * Act - do whatever the Lase3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vida;
    
    public void movimiento()
    {
        setLocation(getX(), getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }
        else{
            controlar();
        }
    }
    public void controlar(){
        if(isTouching(Nave.class))
        {
            getWorld().addObject(new Explosion2(), getX(), getY());
            MyWorld w = (MyWorld)getWorld();
            w.updateVida(-1);
            getWorld().removeObject(this);
            
        }
    }
    public void act(){
        movimiento();
    }
}
