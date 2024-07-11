// https://www.acmicpc.net/problem/13627
// Dangerous Dive
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
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n1; i++) {
            set.add(i);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            set.remove(Integer.parseInt(sArray[i]));
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(n1 == n2){
            System.out.println("*");
        } else {
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}