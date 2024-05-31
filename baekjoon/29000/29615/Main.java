// https://www.acmicpc.net/problem/29615
// 알파빌과 베타빌
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int[] array = new int[size1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            set.add(Integer.parseInt(sArray[i]));
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(set.contains(n)){
                if(size2 - 1 < i){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
