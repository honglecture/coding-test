// https://www.acmicpc.net/problem/5671
// 호텔 방 번호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            String[] sArray = str.split(" ");
            int start = Integer.parseInt(sArray[0]);
            int end = Integer.parseInt(sArray[1]);
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = start; i <= end; i++) {
                String s = i + "";
                boolean flag = true;
                for (int j = 0; j < s.length(); j++) {
                    int n = Integer.parseInt(s.charAt(j) + "");
                    if(set.contains(n)){
                        flag = false;
                        break;
                    }
                    set.add(n);
                }
                if(flag){
                    count++;
                }
                set.clear();
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}