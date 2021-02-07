import java.util.Random;

public class Task1 {
    int a[]={1,2,3,4,5,6,7,8,9};
    public void random(){
        Random random=new Random();
        int n = random.nextInt(10);
        int pos=0;
        for (int i = 0; i <a.length ; i++)
        {
            if (n==a[i]){pos=i;break;}
        }
        for (int i = pos; i <a.length ; i++)
        {
            if(i==a.length-1){
                a[a.length-1]=0;
                break;
            }
            else a[i]=a[i+1];
        }
        System.out.println(n);

    }
    public void delete(int n){
       
        int pos=0;
        for (int i = 0; i <a.length ; i++)
        {
            if (n==a[i]){pos=i;break;}
        }

        for (int i = pos ; i <a.length ; i++)
        {
            if(i==a.length-1){
                a[a.length-1]=0;
                break;
            }
            else a[i]=a[i+1];
        }
        
    }
    public void clone1(){
        int b[]=new int[a.length];
        for (int i = 0; i <b.length ; i++) {
            b[i]=a[i];
        }
        System.out.print("{");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("}");
    }
    public void reverse(){
        int b[]=new int[9];
        for (int i = 0; i <a.length ; i++) {
            b[i]=a.length-i;
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=b[i];
        }
    }
    public void print(){
        System.out.print("{");
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>0)
            {
                if(a.length-1==i)System.out.print(a[i]+"");
                else System.out.print(a[i]+",");
            }
            else if(a.length-1==i)System.out.print(" ");
            else System.out.print(" "+",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.print();
        task1.random();
        task1.print();

    }
}
