import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    public int esperar = 10;
    private int pausa=0;
    private int vida;
    
    public void Boton(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        if (esperar==0){
            if(Greenfoot.isKeyDown("Space")){
                getWorld().addObject(new Misil(),getX(),getY());
                Greenfoot.playSound("disparo.wav");
                
            }
            esperar=10;
        }
    }
    public void act()
    {
        esperar--;
        Boton();
        if(pausa>0)pausa--;
        if(pausa==1)
        if(pausa==0)pausa=20;
    }
}
