// https://www.acmicpc.net/problem/13698
// Hawk eyes
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = new int[4];
        array[0] = 1;
        array[3] = 2;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int start = 0;
            int end = 0;
            if(c == 'A'){
                start = 0;
                end = 1;
            } else if(c == 'B'){
                start = 0;
                end = 2;
            } else if(c == 'C'){
                start = 0;
                end = 3;
            } else if(c == 'D'){
                start = 1;
                end = 2;
            } else if(c == 'E'){
                start = 1;
                end = 3;
            } else if(c == 'F'){
                start = 2;
                end = 3;
            }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                answer1 = i + 1;
            } else if(array[i] == 2){
                answer2 = i + 1;
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
        bw.flush();
        bw.close();
    }

}