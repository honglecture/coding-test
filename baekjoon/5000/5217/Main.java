// https://www.acmicpc.net/problem/5217
// 쌍의 합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append("Pairs for "+n+":");
            for (int j = 1; j <= n; j++) {
                int reuslt = n - j;
                if(reuslt <= j){
                    break;
                }
                sb.append(" " + j + " " + reuslt + ",");
            }
            if(sb.toString().charAt(sb.length() - 1) == ','){
                sb.deleteCharAt(sb.length() - 1);
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}