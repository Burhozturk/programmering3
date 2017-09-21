/*
 *Programmet beregner antal minutter og rest af 
 * brugerens input
 *
 */
package pkg2.pkg5;
import java.util.Scanner;
/**
 *
 * @author burhan
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Variabler
        int antalSekunder;
        int minutterRes;
        int sekunderRes;
        //Opretter objekt af klassen
        Scanner input = new Scanner(System.in);
        //Udskriver
        System.out.println("Indtast antal sekunder" );
        //Gemmer input som antalsekunder
        antalSekunder= input.nextInt();
        //Variabler
        minutterRes=antalSekunder/60;
        sekunderRes=antalSekunder%60;
        //Udskriver resultatet
        System.out.println(antalSekunder+" Sekunder svarer til "+minutterRes+" minutter og "+sekunderRes +" sekunder");
        
        
        // TODO code application logic here
    }
    
}
