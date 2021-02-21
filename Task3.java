import java.util.Arrays;

/**
 * Created by dcy on 26/07/2010.
 */

public class Task3 <A> {
    //genereic method for reseve element array of any type
    public void reseve(A a[]){
        A b[]=(A[])new Object[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i]=b[a.length-(i+1)];
        }
        System.out.println(Arrays.toString(a));
    }

    //genereic method for merge tow array of any type
    public void merge(A a[],A b[]){
        A c[]=(A [])new Object[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            c[i]=a[i];
        }
        for (int i = a.length; i <c.length; i++) {
            c[i]=b[i-a.length];
        }
        System.out.println(Arrays.toString(c));
    }


    public static void main(String[] args) {
       Integer a[]={1,2,3,4,5,6};
        Integer a1[]={1,2,3,4,5,6,7,8,9};
        String a2[]={"a","b","c"};
        String a3[]={"a","b","c"};
        Task3<String> b =new Task3<>();
        Task3<Integer> c =new Task3<>();
        b.merge(a2,a3);
        c.merge(a,a1);
        b.reseve(a2);
        c.reseve(a);
    }
}
