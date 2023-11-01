// https://www.acmicpc.net/problem/17256
// 달달함이 넘쳐흘러
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        String answer = "";
        for (int i = 0; i < sArray1.length; i++) {
            int n1 = Integer.parseInt(sArray1[sArray1.length - 1 - i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(i == 0){
                answer += n2 - n1 + " ";
            } else if(i == 1){
                answer += n2 / n1 + " ";
            } else {
                answer += n2 - n1 + " ";
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
