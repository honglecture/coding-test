// https://www.acmicpc.net/problem/29683
// Рождественская лотерея
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            answer += n / n2;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
