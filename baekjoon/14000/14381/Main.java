// https://www.acmicpc.net/problem/14381
// 숫자세는 양 (Small)
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
            } else {
                Set<Integer> set = new HashSet<>();
                int count = 1;
                String answer = "";
                while (true) {
                    int result = count * n;
                    String str = String.valueOf(result);
                    for (int j = 0; j < str.length(); j++) {
                        set.add(Integer.parseInt(String.valueOf(str.charAt(j))));
                    }
                    if(set.size() == 10){
                        answer = str;
                        break;
                    }
                    count++;
                }
                bw.write("Case #"+(i + 1)+": "+answer+"\n");
            }
        }
        bw.flush();
        bw.close();
    }


}