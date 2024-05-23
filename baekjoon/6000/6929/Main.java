// https://www.acmicpc.net/problem/6929
// Dressing Up
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
        String[][] array = new String[size][size * 2];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "*";
            }
        }
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = count; j < array[i].length - count; j++) {
                array[i][j] = " ";
            }
            count += 2;
        }
        count -= 2;
        for (int i = array.length / 2 + 1; i < array.length; i++) {
            for (int j = count; j < array[i].length - count; j++) {
                array[i][j] = " ";
            }
            count -= 2;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] +"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    
}