// https://www.acmicpc.net/problem/20040
// 사이클 게임
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(set.contains(n1) && set.contains(n2)){
                answer = i + 1;
                break;
            }
            set.add(n1);
            set.add(n2);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
