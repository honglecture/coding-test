// https://www.acmicpc.net/problem/29725
// 체스 초보 브실이
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 8; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '.'){
                    continue;
                }
                boolean flag = true;
                int result = 0;
                if(c >= 65 && c <= 90){
                    flag = false;
                }
                String s = String.valueOf(c).toUpperCase();
                if(s.equals("K")){
                    result = 0;
                } else if(s.equals("P")){
                    result = 1;
                } else if(s.equals("N")){
                    result = 3;
                } else if(s.equals("B")){
                    result = 3;
                } else if(s.equals("R")){
                    result = 5;
                } else if(s.equals("Q")){
                    result = 9;
                }
                if(flag){
                    sum1 += result;
                } else {
                    sum2 += result;
                }
            }
        }
        System.out.println(sum2 - sum1);
        bw.flush();
        bw.close();
    }

    

}
