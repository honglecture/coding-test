// https://www.acmicpc.net/problem/13777
// Hunt The Rabbit
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            List<Integer> list = new ArrayList<>();
            int start = 1;
            int end = 50;
            while (true) {
                int temp = end + start;
                int mid = temp / 2;
                if(temp % 2 == 0){
                    mid = temp / 2;
                } else {
                    mid = (temp - 1) / 2;
                }
                list.add(mid);
                if(mid == n){
                    break;
                }
                if(mid < n){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}