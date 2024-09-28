// https://www.acmicpc.net/problem/20978
// 공통 요소 (Common Elements)
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < sArray1.length; i++) {
            set1.add(Integer.parseInt(sArray1[i]));
        }
        for (int i = 0; i < sArray2.length; i++) {
            set2.add(Integer.parseInt(sArray2[i]));
        }
        for (int n1 : set1) {
            for (int n2 : set2) {
                if(n1 == n2){
                    list.add(n1);
                    break;
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
