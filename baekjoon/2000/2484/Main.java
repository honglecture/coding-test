// https://www.acmicpc.net/problem/2484
// 주사위 네개
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
                set.add(array[j]); 
            }
            Arrays.sort(array);
            if(set.size() == 1){
                sum += 50000 + (array[2] * 5000);
            } else if(set.size() == 2){
                int count1 = 1;
                int count2 = 0;
                int keyNum = array[0];
                for (int j = 1; j < array.length; j++) {
                    if(array[j] == keyNum){
                        count1++;
                    } else {
                        count2++;
                    }
                }
                if(count1 == count2){
                    sum += 2000 + (array[0] * 500) + (array[2] * 500);
                } else {
                    if(count1 == 1){
                        sum += 10000 + (array[1] * 1000);
                    } else {
                        sum += 10000 + (array[0] * 1000);
                    }
                }
            } else if(set.size() == 3){
                int keyNum = 0;
                set.clear();
                for (int j = 0; j < array.length; j++) {
                    if(set.contains(array[j])){
                        keyNum = array[j];
                        break;
                    }
                    set.add(array[j]);
                }
                sum += 1000 + (keyNum * 100);
            } else {
                sum += array[array.length - 1] * 100;
            }
            answer = Integer.max(answer, sum);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}