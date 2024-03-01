// https://www.acmicpc.net/problem/6030
// Scavenger Hunt
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
        String[] sArray = bf.readLine().split(" ");
        int p = Integer.parseInt(sArray[0]);
        int q = Integer.parseInt(sArray[1]);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(p); i++) {
            if(p % i == 0){
                if(p / i == i){
                    list1.add(p / i);
                } else {
                    list1.add(p / i);
                    list1.add(i);
                }
            }
        }
        for (int i = 1; i <= Math.sqrt(q); i++) {
            if(q % i == 0){
                if(q / i == i){
                    list2.add(q / i);
                } else {
                    list2.add(q / i);
                    list2.add(i);
                }
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i < list1.size(); i++) {
            int n1 = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                int n2 = list2.get(j);
                bw.write(n1 + " " + n2 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}