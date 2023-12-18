package naveenautomation.StringConcepts;

public class StringReverse {

    public static String stringRev(String str){

        if(str == null){
            System.out.println("String is Null, Can not reverse, please pass valid value");
            return null;
        }

        // String having space

        if(str.isBlank()){
            System.out.println("Hi");
            return "hello";
        }

        int len = str.length();

        // String having one letter or empty

        if(len==1 || len == 0){
            return str;
        }
        String rev = "";
        for(int i = len-1;i>=0; i--){
            rev = rev+str.charAt(i);
        }

        return rev;

    }

    public static void main(String[] args) {

       /* System.out.println(stringRev("MANI"));
        System.out.println(stringRev("VINITHA"));
        System.out.println(stringRev("VENBA"));
        System.out.println(stringRev("a"));*/
        System.out.println(stringRev(null));
        System.out.println(stringRev(" "));
        System.out.println(stringRev(""));


    }
}
