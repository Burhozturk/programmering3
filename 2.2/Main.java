/*
 *Programmet beregner arealet af en cirkel 
 *og udskriver værdien
 */
package pkg2.pkg2;
import java.util.Scanner;
import javafx.application.ConditionalFeature;
import javax.swing.text.html.HTML;


/**
 *
 * @author burhan
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double areal;
        //Bruges for at kunne få input fra brugeren
        Scanner input = new Scanner(System.in);
        //Udskriver 
        System.out.print("Enter a number for radius: ");
        //Gemmer indtastningen som et variabel
        double radius=input.nextDouble();
        //Beregner arealet
        areal=radius*radius*3.14;
        //Udskriver arealet
        System.out.println("Arealet for cirklen med radius"+radius);
        System.out.println("er " +areal +"m");
        
        
    }
    
}
