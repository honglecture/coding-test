// https://www.acmicpc.net/problem/31789
// 모험의 시작
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int maxMoney = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 <= maxMoney){
                answer = Integer.max(answer, n2);
            }
        }
        if(answer > key){
            bw.write("YES\n");
        } else {
            bw.write("NO\n");
        }
        bw.flush();
        bw.close();
    }

    

}
