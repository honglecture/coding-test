// https://www.acmicpc.net/problem/14382
// 숫자세는 양 (Large)
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
            if(n == 0){
                bw.write("Case #"+(i + 1)+": INSOMNIA\n");
                continue;
            }
            Set<Integer> set = new HashSet<>();
            int count = 1;
            int answer = 0;
            while (true) {
                String str = String.valueOf(count * n);
                for (int j = 0; j < str.length(); j++) {
                    int num = Integer.parseInt(String.valueOf(str.charAt(j)));
                    set.add(num);
                }
                if(set.size() == 10){
                    answer = count * n;
                    break;
                }
                count++;
            }
            bw.write("Case #"+(i + 1)+": "+answer+"\n");
        }
        bw.flush();
        bw.close();
    }


}