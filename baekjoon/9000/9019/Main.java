// https://www.acmicpc.net/problem/9019
// DSLR
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
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
            String answer = "";
            Set<Integer> set = new HashSet<>();
            Queue<Object[]> queue = new ArrayDeque<>();
            queue.add(new Object[]{n1, ""});
            while(queue.size() != 0){
                Object[] pollArray =  queue.poll();
                int n = (int) pollArray[0];
                if(set.contains(n)){
                    continue;
                }
                set.add(n);
                String strN = String.valueOf(n);
                String order = (String) pollArray[1];
                if(n == n2){
                    answer = order;
                    break;
                }
                queue.add(new Object[]{(n * 2) % 10000, order + "D"});
                queue.add(new Object[]{n - 1 == 0 ? 9999 : n - 1, order + "S"});
                if(strN.length() > 1){
                    String str1 = strN.substring(1, strN.length()) + String.valueOf(strN.charAt(0));
                    String str2 = String.valueOf(strN.length() - 1) + strN.substring(0, strN.length() - 1);
                    queue.add(new Object[]{Integer.parseInt(str1), order + "L"});
                    queue.add(new Object[]{Integer.parseInt(str2), order + "R"});
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}