// https://www.acmicpc.net/problem/10799
// 쇠막대기
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int count = 0;
        int answer = 0;
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            String s1 = String.valueOf(str.charAt(i));
            String s2 = String.valueOf(str.charAt(i + 1));
            if(flag){
                flag = false;
                continue;
            }
            if(s1.equals("(") && s2.equals(")")){
                flag = true;
                answer += count;
            } else {
                if(s1.equals("(")){
                    count += 1;
                } else {
                    count -= 1;
                    if(count < 0){
                        count = 0;
                    }
                    answer++;
                    if(i == str.length() - 1 && s2.equals(")")){
                        answer++;
                    }
                }
            }
        }
        bw.write(answer + count + "\n");
        bw.flush();
        bw.close();
    }

}