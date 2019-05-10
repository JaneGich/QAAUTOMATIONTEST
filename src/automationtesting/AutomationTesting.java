/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationtesting;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AutomationTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int result;
        System.out.println("Enter an integer: ");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        //check 2<n<20 constraint
   if(n>2&&n<20)
   {        //if condition is true code program print mulyiples

        for(int i=2;i<10;i++){
            result=i*n;
        System.out.println(i+"*"+n+"="+result); 
    }
   }
   else{ //end the process
                 }
    }
    }
        
    

