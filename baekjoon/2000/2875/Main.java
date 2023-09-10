// https://www.acmicpc.net/problem/2875
// 대회 or 인턴
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        while(n3 != 0){
            if(n2 * 2 <= n1){
                n1--;
            } else {
                n2--;
            }
            n3--;
        }
        int answer = 0;
        int startN1 = 2;
        int startN2 = 1;
        while(true){
            if(n1 >= startN1 && n2 >= startN2){
                answer++;
                startN1 += 2;
                startN2 += 1;
            } else {
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}