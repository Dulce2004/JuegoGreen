import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
        private int pausa = 0;
        private int score;
        private int vida = 0;
        private int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        //MosPuntaje();
        //MosScore();
        //ShowTime();
        time = 1000;
        addObject (new Nave(), 250, 250);
    }
    public void updateVida(int point)
    {
        vida = vida + point;
        // MosPuntaje();
        // ShowText("Vida : "+ vida, 400,25);
        //MosPuntaje();
        //ShowText("Vida : "+ vida, 400,25);
    }
}
