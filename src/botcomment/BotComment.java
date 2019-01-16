/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botcomment;

/**
 *
 * @author Alfredo Reyeshola mundo
 */
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
 
class BotComment {
 
    //arreglo de teclas para escribir "HOLA MUNDO" en la ventana activa del escritorio
    final static int teclas[] = {
        KeyEvent.VK_B,
        KeyEvent.VK_O,
        KeyEvent.VK_T,        
        KeyEvent.VK_SPACE,
        KeyEvent.VK_C,
        KeyEvent.VK_O,
        KeyEvent.VK_M,
        KeyEvent.VK_M,
        KeyEvent.VK_E,
        KeyEvent.VK_N,
        KeyEvent.VK_T,
        KeyEvent.VK_ENTER
    };
 
    public static void main(String[] args) throws AWTException {
        //instanciamos la clase Robot
        Robot robot = new Robot();
 
        //esperamos 2 segundos antes de empezar a escribir
        robot.delay(6000);
    for (int j = 0 ; j < 200 ; j++) {
        //iteramos a través del arreglo de teclas
        for (int i = 0 ; i < teclas.length ; i++) {
            //presionamos y soltamos cada tecla del array
            robot.keyPress(teclas[i]);
            robot.keyRelease(teclas[i]);
 
            //dormimos el robot por 250 mili segundos luego de usar cada tecla
            robot.delay(10);
        }
    }
    }
}
