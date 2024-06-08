// https://www.acmicpc.net/problem/8111
// 0과 1
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String result = getAnswer(n);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(int n){
        String result = "BRAK";
        Queue<StringBuilder> queue = new ArrayDeque<>();
        queue.add(new StringBuilder("1"));
        while (queue.size() != 0) {
            StringBuilder str = queue.poll();
            if(str.length() > 100){
                continue;
            }
            BigInteger b = new BigInteger(str.toString());
            if(b.remainder(new BigInteger(String.valueOf(n))).toString().equals("0")){
                result = str.toString();
                break;
            }
            queue.add(new StringBuilder(str.toString()).append("0"));
            queue.add(new StringBuilder(str.toString()).append("1"));
        }
        return result;
    }
   
}