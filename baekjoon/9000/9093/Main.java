// https://www.acmicpc.net/problem/9093
// 단어 뒤집기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String result = "";
            for (int j = 0; j < sArray.length; j++) {
                String str = sArray[j];
                String reverseStr = "";
                for (int k = str.length() - 1; k >= 0; k--) {
                    reverseStr += str.charAt(k);
                }
                result += reverseStr + " ";
            }
            result = result.substring(0, result.length() - 1);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}