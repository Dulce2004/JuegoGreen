import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    public int esperar = 30;
    public int pausa = 0;
    public void movimiento()
    {
        setLocation(getX(), getY()+1);
        if (getY()> 500){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(50));
        }
    }
    public void act()
    {
        movimiento();
        if (esperar == 0)
        {
            esperar = 30;
        }
        if(pausa>0)pausa--;
        if(pausa == 1) getWorld().addObject(new Lase3(), getX(), getY() +50);
        if(pausa == 0) pausa = 120;
    }
}
