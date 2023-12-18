package InterviewProgrames;

import com.fasterxml.jackson.core.util.BufferRecyclers;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InterviewProgrames {

    @Test
    public void StringReverse() {
        String name = "Manikandan";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);

    }

    @Test
    public void IntReverse() {
        int num = 123456;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);

        int id = 978654213;
        StringBuffer buffer = new StringBuffer();
        StringBuffer rev_id = buffer.append(id).reverse();
        System.out.println(rev_id);
    }

    @Test
    public void occurrenceOfLetter() {

        String name = "Manikandan Overasu";
        char[] charName = name.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (char n : charName) {
            if (n == ' ')
                continue;
            if (!hm.containsKey(n)) {
                hm.put(n, 1);
            } else {
                hm.put(n, hm.get(n) + 1);
            }
        }
        System.out.println(hm);
    }

    @Test
    public void findLargestValue() {

        int arr[] = {8, 5, 6, 85, 2, 9, 25};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

    }

    @Test
    public void findSecondLargestValue() {
        int a[] = {8, 5, 6, 85, 2, 9, 25};
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[2]);


    }

    @Test
    public void MissingNumberArray() {
        int[] num = {1, 2, 3, 5, 6, 7, 8, 9};
        int n = num.length;
        int missing = 0;
        for (int i = 0; i < n - 1; i++) {
            missing += num[i];
        }
        System.out.println(missing);

        int N = n * (n + 1) / 2;
        System.out.println(N);
    }

    @Test
    public void DuplicateUsingForLoop() {
        String courses[] = {"Java", "Python", "Python", "C++", "C++", "C"};

        for (int i = 0; i < courses.length; i++) {
            for (int j = i + 1; j < courses.length; j++) {
                if (courses[i].equals(courses[j])) {
                    System.out.println(courses[i]);
                }
            }
        }
    }

    @Test
    public void DuplicateUsingHashSet() {
        String courses[] = {"Java", "Python", "Python", "C++", "C++", "C"};
        HashSet<String> hs = new HashSet<>();
        for (String c : courses) {
            if (!hs.add(c)) {
                System.out.println(c);
            }
        }
    }

    @Test
    public void DuplicateArray() {
        int a[] = {1, 2, 3, 4, 2, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }


    /*
     *  if duplicate exist return 0 else add all the numbers
     *
     * */
    @Test
    public void addingArrays() {

        int numArray[] = {1, 2, 3, 4};
        int temp = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int n : numArray) {
            if (!hs.add(n)) {
                temp = 0;
                break;
            }
            temp += n;

        }
        System.out.println(temp);
    }

    @Test
    public void StringWordReverse(){

        String name = "Manikandan Overasu";
        String[] words = name.split(" ");
        String reversewords = "";

        for (String w : words) {
            String reverse = "";
            for (int i = w.length()-1; i >= 0; i--) {
                reverse += w.charAt(i);
            }
            reversewords = reversewords + reverse + " ";
        }
        System.out.println(reversewords);

    }

    @Test
    public void adding3Gap(){

        int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int total = 0;
        for(int i = 0; (i< numArray.length);  i = i+3 ){
            total = total+numArray[i]+2;

        }
        System.out.println(total);

    }

    @Test
    public void unsortedArraySum(){

        int[] numArray = {0,5,6,0,5,6,7};
        int sum = 0;
        int big = 0;

        for(int i =0 ; i<numArray.length-1; i++){
            sum = numArray[i]+numArray[i+1];
            if(big<sum){
                big = sum;
            }
        }
        System.out.println(big);

    }



}





