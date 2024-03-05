// https://www.acmicpc.net/problem/10643
// FUNGHI
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < i + 4; j++) {
                if(j >= array.length){
                    sum += array[j - array.length];
                } else {
                    sum += array[j];
                }
            }
            list.add(sum);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        bw.flush();
        bw.close();
    }


    

}