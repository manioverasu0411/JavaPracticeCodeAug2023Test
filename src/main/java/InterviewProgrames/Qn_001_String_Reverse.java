package InterviewProgrames;

public class Qn_001_String_Reverse {
    public static void main(String[] args) {

        String name = "Manikandan";
        int len = name.length();
        String rev = "";

        for(int i = len-1; i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println(rev);

        // using string buffer method

        String s = "VinithA";
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.append(s).reverse());
        //System.out.println(buffer.reverse());


    }
}
