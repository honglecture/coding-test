// https://www.acmicpc.net/problem/14209
// Bridž
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'A'){
                    answer += 4;
                } else if(c == 'K'){
                    answer += 3;
                } else if(c == 'Q'){
                    answer += 2;
                } else if(c == 'J'){
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}