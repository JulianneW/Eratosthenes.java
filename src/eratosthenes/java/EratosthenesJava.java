/*
 * Julianne Wojdak
 * Eratosthenes.java
 * 27/02/2020
 */

package eratosthenes.java;

/**
 *
 * @author JuWoj8013
 */
public class EratosthenesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i = 0;
     int num = 0;
     
     String primeNumbers = "";
     
     for(i = 1; i <=1000; i++)
     {
         int counter = 0;
         for(num = i; num>=1; num--)
         {
             if(i%num==0)
             {
                 counter = counter + 1;
             }
         }
         if (counter == 2)
         {
             primeNumbers = primeNumbers + i + " ";
         }
     }
        System.out.println("The prime numbers from 1-1000 are:");
        System.out.println(primeNumbers);
     

    }
    
}
