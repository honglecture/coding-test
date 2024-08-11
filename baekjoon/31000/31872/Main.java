// https://www.acmicpc.net/problem/31872
// 강의실
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size + 1];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i - 1]);
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        long sum1 = 0;
        long sum2 = 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum1 += array[i + 1] - array[i];
            list.add(array[i + 1] - array[i]);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if(count == key){
                break;
            }
            sum2 += list.get(i);
            count++;
        }
        System.out.println(sum1 - sum2);
        bw.flush();
        bw.close();
    }

    

}
