// https://www.acmicpc.net/problem/19774
// ABCD-код
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int n1 = Integer.parseInt(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1)));
            int n2 = Integer.parseInt(String.valueOf(str.charAt(2)) + String.valueOf(str.charAt(3)));
            int result1 = n1 * n1;
            int result2 = n2 * n2;
            int sum = result1 +  result2;
            if((sum - 1) % 7 == 0){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

}