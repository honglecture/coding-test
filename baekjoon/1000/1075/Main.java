// https://www.acmicpc.net/problem/1075
// 나누기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        String str = String.valueOf(n1);
        str = str.substring(0, str.length() - 2);
        String answer = "";
        for (int i = 0; i <= 99; i++) {
            String temp = str;
            String plus = i < 10 ? "0" + i : i + "";
            temp += plus;
            int n3 = Integer.parseInt(temp);
            if(n3 % n2 == 0){
                answer = plus;
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}