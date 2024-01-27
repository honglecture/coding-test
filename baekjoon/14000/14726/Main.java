// https://www.acmicpc.net/problem/14726
// 신용카드 판별
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();;
            int result = 0;
            int count = 1;
            for (int j = str.length() - 1; j >= 0; j--) {
                int n = Integer.parseInt(str.charAt(j) + "");
                if(count % 2 == 0){
                    n = n * 2;
                    if(n > 9){
                        String temp = n + "";
                        int sum = Integer.parseInt(temp.charAt(0) + "") + Integer.parseInt(temp.charAt(1) + "");
                        result += sum;
                    } else {
                        result += n;
                    }
                } else {
                    result += n;
                }
                count++;
            }
            if(result % 10 == 0){
                bw.write("T\n");
            } else {
                bw.write("F\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}