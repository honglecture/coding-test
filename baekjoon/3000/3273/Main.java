// https://www.acmicpc.net/problem/3273
// 두 수의 합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> numSet = new HashSet<>();
        Set<String> set = new HashSet<>();
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(sArray[i]);
            numSet.add(n);
        }
        int goal = Integer.parseInt(bf.readLine());
        for (int n : numSet) {
            int key = goal - n;
            if(key <= 0){
                continue;
            }
            if(key == n){
                continue;
            }
            if(numSet.contains(key)){
                int n1 = Integer.max(n, key);
                int n2 = Integer.min(n, key);
                set.add(n1 + " " + n2);
            }
        }
        bw.write(set.size() + "\n");
        bw.flush();
        bw.close();
    }
}