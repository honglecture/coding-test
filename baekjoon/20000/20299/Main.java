// https://www.acmicpc.net/problem/20299
// 3대 측정
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int l = Integer.parseInt(sArray[2]);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int sum = n1 + n2 + n3;
            if(sum >= k){
                if(n1 >= l && n2 >= l && n3 >= l){
                    sb.append(n1 + " " + n2 + " " + n3 + " ");
                    count++;
                }
            }
        }

        bw.write(count + "\n");
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }

}
