// https://www.acmicpc.net/problem/12927
// 배수 스위치
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(str);
        int answer = Integer.MAX_VALUE;
        // 하나는 다 Y
        int index = 0;
        int count = 0;
        while (true) {
            if(index == str.length()){
                break;
            }
            boolean flag = false;
            if(sb1.charAt(index) == 'N'){
                flag = true;
            }
            if(flag){
                for (int i = index; i < sb1.length(); i += index + 1) {
                    char c = sb1.charAt(i);
                    if(c == 'N'){
                        sb1.setCharAt(i, 'Y');
                    } else {
                        sb1.setCharAt(i, 'N');
                    }
                }
                count++;
            }
            index++;
        }
        if(count + 1 < answer){
            answer = count + 1;
        }
        // 하나는 다 N
        index = 0;
        count = 0;
        while (true) {
            if(index == str.length()){
                break;
            }
            boolean flag = false;
            if(sb2.charAt(index) == 'Y'){
                flag = true;
            }
            if(flag){
                for (int i = index; i < sb2.length(); i += index + 1) {
                    char c = sb2.charAt(i);
                    if(c == 'N'){
                        sb2.setCharAt(i, 'Y');
                    } else {
                        sb2.setCharAt(i, 'N');
                    }
                }
                count++;
            }
            index++;
        }
        if(count < answer){
            answer = count;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}