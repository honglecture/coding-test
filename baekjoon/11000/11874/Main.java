// https://www.acmicpc.net/problem/11874
// ZAMKA
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int x = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= d; i++) {
            int sum = 0;
            String str = i+"";
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(j)));
                sum += n;
            }
            if(sum == x){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        bw.flush();
        bw.close(); 
    }

}