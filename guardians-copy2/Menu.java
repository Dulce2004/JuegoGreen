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
        if (this.getClass().getName().equalsIgnoreCase("MenuPrincipaL")){
            BotonAyuda ayuda = new BotonAyuda();
            addObject(ayuda ,361,510);
            BotonInicio inicio= new BotonInicio();
            addObject(inicio, 141,510);
        }
        else{
            addObject (new BotonRegresar(),61,61);
        }
    }
}
