import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public final int TIEMPO_NIVEL = 15;
    private Counter contGusanos;
    private Counter contVidas;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private Crab cangrejo;
    private Lobster langosta;

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos = new Counter("Gusanos: ");
        addObject(contGusanos, 64, 18);
        prepare();
        contTiempo.setValue( TIEMPO_NIVEL );
        reloj = new SimpleTimer();
    }

    public void started()
    {
        reloj.mark();
        System.out.println("Botón Run presionado");
    }
    
    public void stopped()
    {
        System.out.println("Botón Pause presionado");
    }
    
    public void act()
    {
        if (reloj.millisElapsed() > 1000)   {
            contTiempo.add(-1);     
            reloj.mark();
        }
    }
    
    public void cangrejoAtrapado()
    {
          //  mundo.showText("Game Over", 250, 250);
         decrementaVidas();
         langosta.setLocation(20,30);
         cangrejo.setLocation(214, 211);
         if (contVidas.getValue() == 0) {
            Label etiquetaFin = new Label("Game Over", 50);
            addObject(etiquetaFin, 250, 250);
            Greenfoot.stop();
        }        
    }

    public void incrementaGusanos()
    {
        contGusanos.add(1);
    }
    
    public void decrementaVidas()
    {
        contVidas.add(-1);
    }
    
    public void reiniciaPosCangrejo()
    {
        cangrejo.setLocation(214, 211);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,417,68);
        Worm worm2 = new Worm();
        addObject(worm2,498,260);
        Worm worm3 = new Worm();
        addObject(worm3,454,387);
        Worm worm4 = new Worm();
        addObject(worm4,284,368);
        Worm worm5 = new Worm();
        addObject(worm5,166,397);
        Worm worm6 = new Worm();
        addObject(worm6,98,293);
        Worm worm7 = new Worm();
        addObject(worm7,87,152);
        Worm worm8 = new Worm();
        addObject(worm8,251,98);
        Worm worm9 = new Worm();
        addObject(worm9,410,148);
        Worm worm10 = new Worm();
        addObject(worm10,410,253);
        Worm worm11 = new Worm();
        addObject(worm11,294,268);
        Worm worm12 = new Worm();
        addObject(worm12,378,91);
        cangrejo = new Crab();
        addObject(cangrejo,214,211);
        langosta = new Lobster();
        addObject(langosta,174,72);
        contVidas = new Counter("Vidas: ");
        contVidas.setValue(3);
        addObject(contVidas,451,24);

        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,268,27);
    }
}





