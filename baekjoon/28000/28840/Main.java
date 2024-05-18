// https://www.acmicpc.net/problem/28840
// Как покормить дракона
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int h = 0;
        int m = 0;
        String[] sArray1 = bf.readLine().split(":");
        String[] sArray2 = bf.readLine().split(":");
        int n1 = Integer.parseInt(sArray1[0]) * 60;
        int n2 = Integer.parseInt(sArray1[1]);
        int n3 = Integer.parseInt(sArray2[0]) * 60;
        int n4 = Integer.parseInt(sArray2[1]);
        int result = (1440 - (n1 + n2)) + (n3 + n4);
        int result1 = result / 60;
        int result2 = result % 60;
        String answer1 = result1 < 10 ? "0" + result1 : String.valueOf(result1);
        String answer2 = result2 < 10 ? "0" + result2 : String.valueOf(result2);
        System.out.println(answer1 + ":" + answer2);
        bw.flush();
        bw.close();
    }

  
}
