// https://www.acmicpc.net/problem/9322
// 철벽 보안 알고리즘
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            List<Integer> orderList = new ArrayList<>();
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            String[] sArray3 = bf.readLine().split(" ");
            for (int j = 0; j < sArray1.length; j++) {
                String str1 = sArray1[j];
                for (int k = 0; k < sArray2.length; k++) {
                    String str2 = sArray2[k];
                    if(str1.equals(str2)){
                        orderList.add(k);
                        break;
                    }
                }
            }
            for (int j = 0; j < orderList.size(); j++) {
                String result = sArray3[orderList.get(j)];
                bw.write(result + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}