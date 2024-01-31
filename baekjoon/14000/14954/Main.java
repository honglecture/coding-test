// https://www.acmicpc.net/problem/14954
// Happy Number
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentNum = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        set.add(currentNum);
        while (true) {
            String str = currentNum + "";
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                n = n * n;
                sum += n;
            }
            if(currentNum == sum){
                System.out.println("HAPPY");
                break;
            }
            if(set.contains(sum)){
                System.out.println("UNHAPPY");
                break;
            }
            set.add(sum);
            currentNum = sum;
        }
        bw.flush();
        bw.close();
    }
    
}