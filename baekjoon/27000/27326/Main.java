// https://www.acmicpc.net/problem/27326
// 두 사람 삼각대 (Three-Legged Race)
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray =  bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(set.contains(n)){
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        bw.write(set.iterator().next() + "\n");
        bw.flush();
        bw.close();
    }

    

}
