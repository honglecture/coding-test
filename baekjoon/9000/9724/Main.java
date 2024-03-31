// https://www.acmicpc.net/problem/9724
// Perfect Cube
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        long count = 1;
        while (true) {
            long result = count * count * count;
            if(result > 2000000000){
                break;
            }
            list.add((int) result);
            count++;
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int answer = 0;
            for (int j = 0; j < list.size(); j++) {
                int n = list.get(j);
                if(n >= n1 && n2 >= n){
                    answer++;
                }
            }
            bw.write("Case #"+(i + 1)+": " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}