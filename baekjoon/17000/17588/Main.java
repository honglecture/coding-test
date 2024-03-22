// https://www.acmicpc.net/problem/17588
// Missing Numbers
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
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int lastNum = array[array.length - 1];
        for (int i = 1; i <= lastNum; i++) {
            set.add(i);
        }
        for (int i = 0; i < array.length; i++) {
            set.remove(array[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size() == 0){
            bw.write("good job\n");
        } else {
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
