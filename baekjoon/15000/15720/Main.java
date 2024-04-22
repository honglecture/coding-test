// https://www.acmicpc.net/problem/15701
// 순서쌍
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer1 = 0;
        int answer2 = 0;
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int size3 = Integer.parseInt(sArray[2]);
        int minSize = Integer.min(Integer.min(size1, size2), size3);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < size1; i++) {
            int n =  Integer.parseInt(sArray[i]);
            list1.add(n);
            answer1 += n;
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < size2; i++) {
            int n =  Integer.parseInt(sArray[i]);
            list2.add(n);
            answer1 += n;
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < size3; i++) {
            int n =  Integer.parseInt(sArray[i]);
            list3.add(n);
            answer1 += n;
        }
        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        Collections.sort(list3, Collections.reverseOrder());
        for (int i = 0; i < minSize; i++) {
            int n1 = list1.get(i);
            int n2 = list2.get(i);
            int n3 = list3.get(i);
            answer2 += (n1 + n2 + n3) * 0.9;
        }
        for (int i = minSize; i < list1.size(); i++) {
            answer2 += list1.get(i);
        }
        for (int i = minSize; i < list2.size(); i++) {
            answer2 += list2.get(i);
        }
        for (int i = minSize; i < list3.size(); i++) {
            answer2 += list3.get(i);
        }
        System.out.println(answer1);
        System.out.println(answer2);
        bw.flush();
        bw.close();
    }

    
}