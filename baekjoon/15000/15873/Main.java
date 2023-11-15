// https://www.acmicpc.net/problem/15873
// 공백 없는 A+B
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        char last = str.charAt(str.length() - 1);
        if(str.length() == 2){
            String s1 = str.charAt(0) + "";
            String s2 = str.charAt(1) + "";
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int answer = n1 + n2;
            bw.write(answer + "\n");
        } else if(str.length() == 3){
            if(str.charAt(1) == '0'){
                int n1 = 10;
                String s1 = str.charAt(2) + "";
                int n2 = Integer.parseInt(s1);
                int answer = n1 + n2;
                bw.write(answer + "\n");
            } else {
                int n2 = 10;
                String s1 = str.charAt(0) + "";
                int n1 = Integer.parseInt(s1);
                int answer = n1 + n2;
                bw.write(answer + "\n");
            }
        } else {
            bw.write("20\n");
        }
        bw.flush();
        bw.close();
    }
    
}