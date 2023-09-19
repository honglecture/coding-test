// https://www.acmicpc.net/problem/1543
// 문서 검색
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < str1.length(); i++) {
            queue.add(str1.charAt(i) + "");
        }
        StringBuilder sb = new StringBuilder("");
        int answer = 0;
        while(queue.size() != 0){
            sb.append(queue.poll());
            if(sb.length() < str2.length()){
                continue;
            } else if(sb.length() == str2.length()){
                if(sb.toString().equals(str2)){
                    answer++;
                    sb = new StringBuilder("");
                } else {
                    sb.deleteCharAt(0);
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}
