
package looping;


/**
types of looping
 */
public class Looping {

    /**
    concatenation
     */
    public static void main(String[] args) {
        int x=1;
        int y=1; //if this was removed
        System.out.println("Table of Multiplication");
        System.out.println("========================");
        while (x<=12)
        {
            System.out.println("The Table of " + x );
            System.out.println("================");
            //int y = 1; //can also work if outside removed 
            while (y<=12)
            {
                System.out.println(x + " x " + y + " = " + (x*y));
                y++;
                
            }
            System.out.println();
            y=1;
            x++;
        }
        /*
        INCORRECT
        int x=1;
        int y=1;
        System.out.println("Table of Multiplication");
        System.out.println("========================");
        while (x<=12)
            while (y<=12)
        {
            System.out.println("Table " + y );
            System.out.println(y + " x " + x + " = " + (y*x));
            x++;
            y++;
        }/*
        
        
        
    /*for(int x=1; x<=1; x==2)
    {
        System.out.println(x);
    }*/
    
    }
    
}
