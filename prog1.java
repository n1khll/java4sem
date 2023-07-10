import java.util.Scanner;
public class prog1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of ARRAY:");
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    int six=-1,sev=-1,sum=0;
    for(int i=0;i<n;i++){
        if(a[i]==6){
            six=i;break;}}
    for(int i=0;i<n;i++){
        if(a[i]==7)
            sev=i;}
    if(sev==-1)
        six=-1;
    for(int i=0;i<n;i++){
    if(six!=-1 && i>=six && i<=sev){
        continue;}
    sum+=a[i];
    }
        System.out.println("Sum:"+sum);}}