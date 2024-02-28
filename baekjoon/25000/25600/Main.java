// https://www.acmicpc.net/problem/25600
// Triathlon
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int result = n1 * (n2 + n3);
            if(n1 == n2 + n3){
                result *= 2;
            }
            list.add(result);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        bw.flush();
        bw.close();
    }

    
}
