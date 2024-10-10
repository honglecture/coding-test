// https://www.acmicpc.net/problem/20186
// 수 고르기
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
        int[] array = new int[sArray.length];
        List<Integer> list = new ArrayList<>();
        boolean[] visitArray = new boolean[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            list.add(array[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < key; i++) {
            int n1 = list.get(i);
            for (int j = 0; j < array.length; j++) {
                int n2 = array[j];
                if(!visitArray[j] && n1 == n2){
                    visitArray[j] = true;
                    break;
                }
            }
        }
        int count = 0;
        int answer = 0;
        for (int i = 0; i < visitArray.length; i++) {
            if(visitArray[i]){
                answer += array[i] - count;
                count++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
