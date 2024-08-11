// https://www.acmicpc.net/problem/6108
// The Perfect Cow
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
            int[] array = new int[size];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            list.add(array[size / 2]);
        }
        Collections.sort(list);
        System.out.println(list.get(size / 2));
        bw.flush();
        bw.close();
    }
    
}