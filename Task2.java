import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by manarmobile on 11/02/2021.
 */
public class Task2 {
    //algorithm for add
    int a[]=new int[5];
    int num=0;
    public void add(int e) {

            if(num>a.length)
            {
             a[num]=e;
            }
            else {
                System.out.println("is full");
            }
        }
    
        public static void main(String[] args) {
            //algorithm for search reaptitive one number
            int b[] = {1, 4, 4};
            for (int i = 0; i <b.length ; i++)
            {
                if(b[i]==b[i+1]){
                    System.out.println(b[i]);
                    break;
                }
            }
            //algorithm for search reaptitive five number
            int a[] = {1, 2, 2, 2, 2};
            for (int i = 0; i <a.length ; i++)
            {
                if(a[i]==a[i+1]){
                    System.out.println(a[i]);
                    break;
                }
            }}



        }





