// https://www.acmicpc.net/problem/15553
// 난로
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int answer = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        answer = array[array.length - 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i] + 1;
            int n2 = array[i + 1];
            list.add(n2 - n1);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= list.size() - key + 1; i--) {
            answer -= list.get(i);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}

