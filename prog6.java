class prog6{
    public static String func(String str,String word){
        StringBuilder obj=new StringBuilder();
        int lenw=word.length(),lenstr=str.length();
        for(int i=0;i<lenstr;i++){
            if(i+lenw<=lenstr && str.substring(i,i+lenw).equalsIgnoreCase(word)){
                if(i>0){
                    obj.append(str.charAt(i-1));}
                if(i+lenw<lenstr){
                    obj.append(str.charAt(i+lenw));}
                }
            }
        return obj.toString();
        }
    public static void main(String[] args) {
        String str = "xvxXY123XYabcXY";
        String word = "XY";
        String result = func(str, word);
        System.out.println(result);}}