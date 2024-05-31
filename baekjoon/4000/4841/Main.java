// https://www.acmicpc.net/problem/4841
// Look and Say
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
            String str = bf.readLine();
            String result = getAnswer(str);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static String getAnswer(String str){
        StringBuilder sb = new StringBuilder();
        int currentNum = Integer.parseInt(String.valueOf(str.charAt(0)));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(currentNum == n){
                count++;
            } else {
                sb.append(count + "" + currentNum);
                count = 1;
                currentNum = n;
            }
        }
        sb.append(count + "" + currentNum);
        return sb.toString();
    }
}