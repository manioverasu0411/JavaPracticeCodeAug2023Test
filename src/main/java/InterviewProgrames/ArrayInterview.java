package InterviewProgrames;

import org.testng.annotations.Test;

public class ArrayInterview {

    @Test
    public void findNumbers(){

        int a[] = {4,3,7,11,50,8};
        int x = 10 ; int y = 14;

        if(x<y){
            for(int i = 0; i<a.length-1; i++){
                if(a[i]>x && a[i]<y){
                    System.out.println(a[i]);
                }
            }

        }else {
            System.out.println("Mismatch");
        }

    }

    public static void main(String[] args) {

    }

}
