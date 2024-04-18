// https://www.acmicpc.net/problem/4118
// Fred’s Lotto Tickets
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
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                String[] sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    set.add(Integer.parseInt(sArray[j]));
                }
            }
            if(set.size() == 49){
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        
        
        bw.flush();
        bw.close();
    }
}