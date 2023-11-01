// https://www.acmicpc.net/problem/12904
// A와 B
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        Queue<String> queue = new ArrayDeque<>();
        queue.add(str2);
        int answer = 0;
        Set<String> set = new HashSet<>();
        while(queue.size() != 0){
            String s = queue.poll();
            if(s.equals(str1)){
                answer = 1;
                break;
            }
            if(s.length() <= str1.length()){
                continue;
            }
            if(set.contains(s)){
                continue;
            }
            StringBuilder sb1 = new StringBuilder(s);
            StringBuilder sb2 = new StringBuilder(s).reverse();
            set.add(s);
            if(sb1.charAt(sb1.length() - 1) == 'A'){
                sb1.deleteCharAt(sb1.length() - 1);
                queue.add(sb1.toString());
            }
            if(sb2.charAt(0) == 'B'){
                sb2.deleteCharAt(0);
                queue.add(sb2.toString());
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}