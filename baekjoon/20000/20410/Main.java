// https://www.acmicpc.net/problem/20410
// 추첨상 사수 대작전! (Easy)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int m = Integer.parseInt(sArray[0]);
        int seed = Integer.parseInt(sArray[1]);
        int x1 = Integer.parseInt(sArray[2]);
        int x2 = Integer.parseInt(sArray[3]);
        int a = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < m; j++) {
                if((i * seed + j) % m == x1 && (i * x1 + j) % m == x2) {
                    a = i;
                    c = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(a + " " + c);

        bw.flush();
        bw.close();
    }

}
