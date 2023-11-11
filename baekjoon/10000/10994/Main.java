// https://www.acmicpc.net/problem/10994
// 별 찍기 - 19
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine()) * 4 - 3;
        String[][] array = new String[size][size];
        
        bw.flush();
        bw.close();
    }

}