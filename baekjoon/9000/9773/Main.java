// https://www.acmicpc.net/problem/9773
// ID Key
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            bw.write(getAnswer(str) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String str){
        String result = "";
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum1 += n;
        }
        sum2 = Integer.parseInt(str.substring(str.length() - 3, str.length())) * 10;
        int sum3 = sum1 + sum2;
        String sumStr = String.valueOf(sum3);
        if(sumStr.length() > 4){
            result = sumStr.substring(sumStr.length() - 4, sumStr.length());
        } else if(sumStr.length() < 4){
            result = String.valueOf(sum3 + 1000);
        } else {
            result = String.valueOf(sum3);
        }
        return result;
    }
}