/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author user
 */
public class Vcount {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int count=0;
        System.out.println("Enter a word:\t");
        String w=ob.next();
        String z=w.toLowerCase();
        for(int i=0;i<z.length();i++)
        {
            char ch=z.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
            
        }
        System.out.println("No of Vowels ="+count);
    }
    
}
