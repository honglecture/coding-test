// https://www.acmicpc.net/problem/12605
// 단어순서 뒤집기
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = sArray.length - 1; j >= 0; j--) {
                sb.append(sArray[j] + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write("Case #"+(i + 1)+": " + sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


