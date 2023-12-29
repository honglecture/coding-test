// https://www.acmicpc.net/problem/1235
// 학생 번호
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(bf.readLine());
        }
        int count = 1;
        while (true) {
            Set<String> set = new HashSet<>();
            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                String result = str.substring(str.length() - count, str.length());
                if(set.contains(result)){
                    flag = false;
                    break;
                } else {
                    set.add(result);
                }
            }
            if(flag){
                break;
            }
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
