// https://www.acmicpc.net/problem/1337
// 올바른 배열
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
        Set<Integer> set = new HashSet<>();
        int answer = 4;
        for (int i = 0; i < size; i++) {
            set.add(Integer.parseInt(bf.readLine()));
        }
        for (int n : set) {
            int count = 0;
            int temp1 = n - 2;
            int sum = 0;
            if(temp1 == -2){
                sum = 3;
            } else if(temp1 == -1){
                sum = 2;
            } else if(temp1 == 0){
                sum = 1;
            }
            int n1 = n - 2 + sum;
            int n2 = n - 1 + sum;
            int n3 = n + 1 + sum;
            int n4 = n + 2 + sum;
            if(!set.contains(n1)){
                count++;
            }
            if(!set.contains(n2)){
                count++;
            }
            if(!set.contains(n3)){
                count++;
            }
            if(!set.contains(n4)){
                count++;
            }
            answer = Integer.min(answer, count);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
