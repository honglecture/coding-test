// https://www.acmicpc.net/problem/13226
// Divisors Again
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int max = 0;
            for (int j = n1; j <= n2; j++) {
                int result = getAnswer(j);
                max = Integer.max(max, result);
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n){
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                set.add(i);
                set.add(n / i);
            }
        }
        return set.size();
    }
}