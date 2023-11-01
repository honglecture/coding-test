// https://www.acmicpc.net/problem/2212
// 센서
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int key = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            set.add(n);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        int start = array[0];
        int end = array[array.length - 1];
        
        bw.flush();
        bw.close();
    }

    
}