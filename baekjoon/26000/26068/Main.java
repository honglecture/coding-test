// https://www.acmicpc.net/problem/26068
// 치킨댄스를 추는 곰곰이를 본 임스 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("\\-");
            int n = Integer.parseInt(sArray[1]);
            if(n <= 90){
                count++;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
