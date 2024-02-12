// https://www.acmicpc.net/problem/13225
// Divisors
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = getAnswer(n);
            bw.write(n + " " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static int getAnswer(int n){
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                int n1 = i;
                int n2 = n / i;
                set.add(n1);
                set.add(n2);
            }
        }
        return set.size();
    }
}