// https://www.acmicpc.net/problem/6784
// Multiple Choice
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array1 = new String[size];
        String[] array2 = new String[size];
        int answer = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = bf.readLine();
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = bf.readLine();
        }
        for (int i = 0; i < array2.length; i++) {
            if(array1[i].equals(array2[i])){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}