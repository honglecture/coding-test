// https://www.acmicpc.net/problem/11637
// 인기 투표
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size + 1];
            int sum = 0;
            int max = 0;
            List<Integer> maxIndexlist = new ArrayList<>();
            for (int j = 1; j < size + 1; j++) {
                array[j] = Integer.parseInt(bf.readLine());
                sum += array[j];
                if(max < array[j]){
                    max = array[j];
                    maxIndexlist.clear();
                    maxIndexlist.add(j);
                } else if(max == array[j]){
                    maxIndexlist.add(j);
                }
            }
            if(maxIndexlist.size() > 1){
                bw.write("no winner\n");
            } else {
                if(sum / 2 < max){
                    bw.write("majority winner " + maxIndexlist.get(0) + "\n");
                } else {
                    bw.write("minority winner " + maxIndexlist.get(0) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    
}

