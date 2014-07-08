
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dragonslayer
 */
public class Factorial {
    double n;
    static double result=1.0;
    
    Factorial(int x){
        n = x;
    }
    
    public static double factorial(double x){
        if(x==1){
            return 1;
        }else{
            result = x * factorial(x-1);
        }
        return result;
    }
    
    public static void main(String[] args){
             
       Scanner ob=new Scanner(System.in);
        System.out.println("Enter your number to calculate factorial:");
        int x=ob.nextInt();
        Factorial fa = new Factorial(x);
        System.out.println("Factorial is "+fa.factorial(x));
        
    }
}
