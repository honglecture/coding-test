// https://www.acmicpc.net/problem/1072
// 게임
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result1 = (int) (((double)n2 / (double)n1) * 100.0);
        if(n1 == n2 || result1 == 99){
            System.out.println("-1");
            return;
        }
        int count = 0;
        while(true){
            n1++;
            n2++;
            count++;
            int result2 = (int) (((double)n2 / (double)n1) * 100.0);
            if(result1 != result2){
                break;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
