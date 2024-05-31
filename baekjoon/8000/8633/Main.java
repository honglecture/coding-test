// https://www.acmicpc.net/problem/8633
// Sortowanie biżuterii
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(bf.readLine());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                } else {
                    if(s1.length() > s2.length()){
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}