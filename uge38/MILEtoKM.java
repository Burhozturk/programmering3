/*Opgave 2.2 omregner km til mile.
 */
package miletokm;
import java.util.Scanner;
/**
 *
 * @author burhan
 */
public class MILEtoKM 

    {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner input=new Scanner(System.in);
        System.err.println("Indtast venligt antal km");
        double km=input.nextDouble();
        double mile=km*1.6;
        System.out.println("Antal km"+ km +"giver antal" +mile "fahrenheit");
        // TODO code application logic here
    }
    
}
