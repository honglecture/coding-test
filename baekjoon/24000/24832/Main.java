// https://www.acmicpc.net/problem/24832
// Longest Palindrome
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static String[] array;
    private static boolean[] visitArray;
    private static String[] strArray;
    private static String answer = "";
    private static Set<String> set = new HashSet<>();


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        array = new String[size];
        visitArray = new boolean[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
            set.add(array[i]);
        }
        for (int i = array.length; i >= 0; i--) {
            strArray = new String[i];
            visitArray = new boolean[size];
            getAnswer(0, i);
            if(!answer.equals("")){
                break;
            }
        }
        System.out.println(answer.length());
        if(!answer.equals("")){
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int count, int size){
        if(count != 0){
            StringBuilder temp = new StringBuilder(strArray[count - 1]);
            if(!set.contains(temp.reverse().toString())){
                return;
            }
        }
        if(count == size){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2;
            for (int i = 0; i < strArray.length; i++) {
                sb1.append(strArray[i]);
            }
            sb2 = new StringBuilder(sb1.toString());
            if(sb1.toString().equals(sb2.reverse().toString())){
                answer = sb1.toString();
            }
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                strArray[count] = array[i];
                visitArray[i] = true;
                getAnswer(count + 1, size);
                strArray[count] = null;
                visitArray[i] = false;
            }
        }
    }

    

}
