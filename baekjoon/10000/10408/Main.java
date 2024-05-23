// https://www.acmicpc.net/problem/10408
// The return of the King
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        double count = 0;
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(n == 0){
                continue;
            }
            if(n == 1){
                if(i + 1 <= str.length() - 1){
                    int nextN = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                    if(nextN == 0){
                        count++;
                        sum += 10;
                    } else {
                        count++;
                        sum += n;
                    }
                } else {
                    count++;
                    sum += n;
                }
            } else {
                count++;
                sum += n;
            }
        }
        double result = sum / count;
        System.out.println(String.format("%.2f", result));
        bw.flush();
        bw.close();
    }
}



