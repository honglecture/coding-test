// https://www.acmicpc.net/problem/9842
// Prime
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int keyNum = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int count = 2;
        while (true) {
            if(list.size() == 10000){
                break;
            }
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(count); i++) {
                if(count % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(count);
            }
            count++;
        }
        System.out.println(list.get(keyNum - 1));
        bw.flush();
        bw.close();
    }
}