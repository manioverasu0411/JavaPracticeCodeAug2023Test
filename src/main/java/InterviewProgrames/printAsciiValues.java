package InterviewProgrames;

public class printAsciiValues {

    public static void main(String[] args) {

        int i;
        char c;

        for(c='A'; c<='Z'; c++){
            i = c;
            System.out.println(c+" "+(i-64));
        }

    }

    }

