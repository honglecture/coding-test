// https://www.acmicpc.net/problem/9288
// More Dice
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
            Set<String> set = new HashSet<>();
            bw.write("Case "+(i + 1)+":\n");
            for (int j = 1; j <= 6; j++) {
                for (int k = j; k <= 6; k++) {
                    if(j + k == n){
                        int min = Integer.min(j, k);
                        int max = Integer.max(j, k);
                        String result = "("+min+","+max+")";
                        if(set.contains(result)){
                            continue;
                        }
                        set.add(result);
                        bw.write(result + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}