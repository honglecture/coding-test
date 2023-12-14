// https://www.acmicpc.net/problem/5354
//  J박스
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
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 1){
                bw.write("#\n");
            } else if(n == 2){
                bw.write("##\n");
                bw.write("##\n");
            } else {
                String[][] array = new String[n][n];
                for (int j = 0; j < array.length; j++) {
                    array[0][j] = "#";
                }
                for (int j = 0; j < array.length; j++) {
                    array[array.length - 1][j] = "#";
                }
                for (int j = 1; j < array.length - 1; j++) {
                    for (int k = 0; k < array.length; k++) {
                        if(k == 0 || k == array.length - 1){
                            array[j][k] = "#";
                        } else {
                            array[j][k] = "J";
                        }
                    }
                }
                for (int j = 0; j < array.length; j++) {
                    for (int k = 0; k < array.length; k++) {
                        bw.write(array[j][k] + "");
                    }
                    bw.write("\n");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}