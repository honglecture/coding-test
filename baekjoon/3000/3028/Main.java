// https://www.acmicpc.net/problem/3028
// 창영마을
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        boolean[] array = new boolean[3];
        array[0] = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A'){
                boolean temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            } else if(c == 'B'){
                boolean temp = array[1];
                array[1] = array[2];
                array[2] = temp;
            } else {
                boolean temp = array[0];
                array[0] = array[2];
                array[2] = temp;
            }
        }
        if(array[0]){
            System.out.println("1");
        } else if(array[1]){
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        bw.flush();
        bw.close();
    }
}