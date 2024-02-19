// https://www.acmicpc.net/problem/4592
// 중복을 없애자
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            if(array[0] == 0){
                break;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < array.length; i++) {
                int n = array[i];
                if(list.size() == 0){
                    list.add(n);
                } else {
                    if(list.get(list.size() - 1) != n){
                        list.add(n);
                    }
                }
            }
            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str += list.get(i) + " ";
            }
            str += "$";
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}