// https://www.acmicpc.net/problem/16546
// Missing Runners
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= size; i++) {
            set.add(i);
        }
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            set.remove(n);
        }
        System.out.println(set.iterator().next());
        bw.flush();
        bw.close();
    }

    


}
