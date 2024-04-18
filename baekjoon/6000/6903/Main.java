// https://www.acmicpc.net/problem/6903
// Trident
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        String[][] array = new String[n1 + n3 + 1][3 + n2 + n2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < array[i].length; j += n2 + 1) {
                array[i][j] = "*";
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            array[n1][i] = "*";
        }
        for (int i = n1 + 1; i < array.length; i++) {
            array[i][4] = "*";
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i >= n1 + 1 && j >= 5){
                    break;
                }
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    
}