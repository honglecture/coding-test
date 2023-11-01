// https://www.acmicpc.net/problem/12738
// 가장 긴 증가하는 부분 수열 3
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(i == 0){
                list.add(n);
                continue;
            }
            if(list.get(list.size() - 1) < n){
                list.add(n);
            } else {
                int resultIndex = Collections.binarySearch(list, n);
                if(resultIndex >= 0){
                    list.set(resultIndex, n);
                } else {
                    resultIndex = -resultIndex - 1;
                    list.set(resultIndex, n);
                }
            }
        }
        //System.out.println(list);
        bw.write(list.size() + "\n");
        bw.flush();
        bw.close();
    }

}
