
package looping2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Looping2 {


    public static void main(String[] args) {
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double total=0;
        double num=0;
        int x;
        Scanner loop = new Scanner(System.in);
        System.out.println("How many number would you like to enter ? ");
        x=loop.nextInt();
        for(int i=1; i<=x; i++)
        {
            System.out.println("Enter the Number #" +i+ " ==> ");
            num=loop.nextDouble();
            total+=num;
        }
        //System.out.println("The total is ==> " +total);
        System.out.println("The total is ==> " + decimalFormat.format(total));
        System.out.println("The average is ==> " + decimalFormat.format(total/x));
        
        
                       
    }
    
}
