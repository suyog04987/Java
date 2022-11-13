/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
package javaapplication5;

/**
 *
 * @author user
 */
public class StartingLetter {
    public static void main(String[] args) {
        String w[]=new String[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name of 5 countries:\t");
        for(int i=0;i<5;i++)
        {
            w[i]=ob.next();
            
        }
        System.out.println("Name starting with N:");
        for(int i=0;i<5;i++)
        {
            if(w[i].startsWith("N"))
            {
                System.out.println(w[i]);
            }
        }
    }
    
}
