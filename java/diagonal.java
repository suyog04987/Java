import java.util.*;
public class diagonal {
    public static void main(String[] args) {
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
        }

    
        System.out.println("diagonal elements :");
        if(m==n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.println(a[i][j]);
    
                }
            }
            
        }
    }
    
    
    }
    }
    

