import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        if (this.getClass().getName().equalsIgnoreCase("MenuPrinci")){
            Ayuda BotonAyuda= new Ayuda();
            addObject(BotonAyuda, 361, 510);
            Inicion BotonInicio = new Inicion();
            addObject(BotonInicio, 141,510);
        }
        else{
            addObject(new Backk(), 61,61);
        }
        
    }
}
