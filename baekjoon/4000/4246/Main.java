// https://www.acmicpc.net/problem/4246
// To and Fro
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            String str = bf.readLine();
            StringBuilder sb = new StringBuilder();
            int x = size;
            int y = str.length() / size;
            String[][] array = new String[y][x];
            int index = 0;
            String temp = "";
            for (int i = 0; i < str.length(); i += size) {
                StringBuilder tempSb = new StringBuilder(str.substring(i, i + size));
                if(i % 2 == 0){
                    temp += tempSb.toString();
                } else {
                    temp += tempSb.reverse().toString();
                }
            }
            str = temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = String.valueOf(str.charAt(index++));
                }
            }
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    sb.append(array[j][i]);
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}