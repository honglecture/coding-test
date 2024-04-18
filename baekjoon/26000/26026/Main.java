// https://www.acmicpc.net/problem/26026
// Coffee Cup Combo
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 0;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '1'){
                answer += 1;
                count = 2;
            } else {
                if(count > 0){
                    answer += 1;
                    count -= 1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
