// https://www.acmicpc.net/problem/3076
// 상근이의 체스판
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray1[0]);
        int n2 = Integer.parseInt(sArray1[1]);
        int n3 = Integer.parseInt(sArray2[0]);
        int n4 = Integer.parseInt(sArray2[1]);
        String[][] array = new String[n1 * n3][n2 * n4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        for (int i = 0; i < array.length; i += n3 * 2) {
            for (int j = 0; j < array[i].length; j += n4 * 2) {
                for (int k = i; k < i + n3; k++) {
                    for (int l = j; l < j + n4; l++) {
                        array[k][l] = "X";
                    }
                }
            }
        }
        for (int i = n3; i < array.length; i += n3 * 2) {
            for (int j = n4; j < array[i].length; j += n4 * 2) {
                for (int k = i; k < i + n3; k++) {
                    for (int l = j; l < j + n4; l++) {
                        array[k][l] = "X";
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j]+"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}