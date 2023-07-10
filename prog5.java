import java.util.*;
public class prog5 {
    public static void subs(String s){
        String longest=null;int len=0;
        Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);}
            else{
                i=map.get(ch);
                map.clear();}
            if(map.size()>len){
                len=map.size();
                longest=map.keySet().toString();
            }}
        System.out.println("Input string:"+s);
        System.out.println("Longest Substring:"+longest);
        System.out.println("Length of longest substring:"+len);}
    public static void main(String[] args){
    subs("thelongestsubstring");}
}