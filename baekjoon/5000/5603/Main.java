// https://www.acmicpc.net/problem/5603
// 問題2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        StringBuilder str = new StringBuilder(bf.readLine());
        for (int i = 0; i < n1; i++) {
            StringBuilder result = new StringBuilder();
            int count = 0;
            String beforeString = "";
            for (int j = 0; j < str.length(); j++) {
                if(beforeString.equals("")){
                    beforeString = String.valueOf(str.charAt(j));
                    count++;
                } else {
                    String currentString = String.valueOf(str.charAt(j));
                    if(beforeString.equals(currentString)){
                        count++;
                    } else {
                        result.append(count + beforeString);
                        beforeString = currentString;
                        count = 1;
                    }
                }
            }
            result.append(count + beforeString);
            str = result;
        }
        System.out.println(str.toString());
        bw.flush();
        bw.close();
    }
}