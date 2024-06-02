// https://www.acmicpc.net/problem/12606
// Reverse Words (Large)
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder answer = new StringBuilder();
            answer.append("Case #"+(i+1)+": ");
            for (int j = sArray.length - 1; j >= 0; j--) {
                answer.append(sArray[j] + " ");
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


