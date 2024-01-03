// https://www.acmicpc.net/problem/2033
// 반올림
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder(bf.readLine());
        int start = 10;
        int index = 1;
        while (true) {
            if(str.length() - index == 0){
                break;
            }
            int n = Integer.parseInt(String.valueOf(str.charAt(str.length() - index)));
            if(n >= 5){
                str.setCharAt(str.length() - index, '0');
                int result = Integer.parseInt(str.toString());
                result += start;
                str = new StringBuilder(result + "");
                start *= 10;
                index++;
            } else {
                str.setCharAt(str.length() - index, '0');
                start *= 10;
                index++;
            }
        }
        System.out.println(str.toString());
        bw.flush();
        bw.close();
    }


}