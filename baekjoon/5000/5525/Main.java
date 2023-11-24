// https://www.acmicpc.net/problem/5525
// IOIOI
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
        int n2 = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        int count = 0;
        int size = n1;
        for (int i = 1; i < str.length() - 1; i++) {
            char c1 = str.charAt(i - 1);
            char c2 = str.charAt(i);
            char c3 = str.charAt(i + 1);
            if(c1 == 'I' && c2 == 'O' && c3 == 'I'){
                count++;
                if(count == size){
                    count--;
                    answer++;
                }
                i++;
            } else {
                count = 0;
            }
        }

        bw.write(answer + "\n");

        bw.flush();
        bw.close();
    }
}