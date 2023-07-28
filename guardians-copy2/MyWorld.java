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
        private int vida = 3;
        private int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        MosVida();
        MosScore();
        showTime();
        time = 1000;
        addObject (new Nave(), 250, 250);
        Greenfoot.playSound("Guardians.wav");
    }
    public void updateVida(int point)
    {
        vida = vida + point;
        MosVida();
        
        if (vida == 0){
            
            addObject(new Perder(),250,300);
            addObject(new Volver(), 250, 500);
            addObject(new Finish(), 425, 550);
            Greenfoot.stop();
            
            Greenfoot.playSound("over.wav");
        }
        
        
    
    }
    public void MosVida(){
        showText("Vida : "+ vida, 400,25);
    }
    public void addScore (int points){
        score=score+points;
        MosScore();
    }
    private void MosScore(){
        showText ("Score : "+score, 100, 25);
    }
    private void countTime(){
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.stop();
            addObject(new Ganar(), 250,300);
            addObject(new Volver(), 235, 475);
            addObject(new Finish(), 425, 550);
            
            Greenfoot.playSound("ganar.wav");
        }
    }
    private void showTime(){
        showText("Tiempo : "+time,250,25);
    }
    public void act(){
        if (Greenfoot.getRandomNumber (100) < 3){
            addObject(new Enemigo(), Greenfoot.getRandomNumber (599), 500);
        }
        countTime();
        
    }
}
