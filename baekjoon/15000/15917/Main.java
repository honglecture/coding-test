// https://www.acmicpc.net/problem/15917
// 노솔브 방지문제야!!
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (true) {
            double result = Math.pow(2, count++);
            if(result > Integer.MAX_VALUE){
                break;
            }
            set.add((int)result);
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(set.contains(n)){
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}