// https://www.acmicpc.net/problem/10181
// Federation Favorites
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == -1){
                break;
            }
            int sum = 0;
            List<Integer> list;
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    set.add(i);
                    set.add(n / i);
                }
            }
            list = new ArrayList<>(set);
            Collections.sort(list);
            for (int i = 0; i < list.size() - 1; i++) {
                sum += list.get(i);
            }
            if(n == sum){
                String answer = n + " = ";
                for (int i = 0; i < list.size() - 1; i++) {
                    if(i == list.size() - 2){
                        answer += list.get(i);
                    } else {
                        answer += list.get(i) + " + ";
                    }
                }
                bw.write(answer + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}


