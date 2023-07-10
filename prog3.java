import java.util.*;
public class prog3 {
    public static int find(int[] a){Arrays.sort(a);
        int small=1;
        for(int i=0;i<5;i++){
            if(small>=a[i]){
                small+=a[i];
            }}
        return small;}
    public static void main(String[] args){
    int[] a=new int[5];Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();}
        int p=find(a);
        System.out.println("Smallest +ve integer is:"+p);
        }
}
