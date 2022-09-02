//Array and Functions
/*WAP to create an array of size "n" then promt the user to input "n" numbers and find the sum of those number that end with "0" and "1".
 * 2. WAP to sort the elements of an array in asseding order/
 * 3.WAP  to print the diagonal elements of matrix.
 * 4.Create a finction void print(int a,int b) that prints all even numbers from a to b.
 * 5.Create a function int max(int[a]) that returns the largest element in an array.
 */

import java.util.*;

import javafx.scene.effect.Light.Spot;
 public class lab2 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=ob.nextInt();
        int num[]= new int [n];
        System.out.println("enter the numbers of an array");
        int s=0;
        for (int i=0;i<n;i++){
            num[i]=ob.nextInt();
        if (num[i]%10==0 || num[i]%10 == 1){
            
            s=s+num[i];

        
    }
        
    }
    System.out.println("the sum is"+s);

    void diagonalElement();
}

//3

static void diagonalElement(){
    Scanner oc=new Scanner(System.in);
    System.out.println("Enter the size of 1st 2D array");
    int m=oc.nextInt();
    int n=oc.nextInt();
    int a[][]=new int [m][n];
    System.out.println("enter the elements");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            a[i][j]=oc.nextInt();
        }

    System.out.println("diagonal elements :");
    for(int i=0;i<m,i++){
        for(int j=0;j<n;j++){
            if(i==j){
                System.out.println(a[i][j]);

            }
        }
        
    }


}
 


}

 
