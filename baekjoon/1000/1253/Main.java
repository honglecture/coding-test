// https://www.acmicpc.net/problem/1253
// 파티
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        Set<Integer> arraySet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            arraySet.add(array[i]);
        }
        Arrays.sort(array);
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int start = 0;
            int end = array.length - 1;
            while(true){
                if(start >= end){
                    break;
                }
                if(start == index){
                    start++;
                    continue;
                }
                if(end == index){
                    end--;
                    continue;
                }
                int sum = array[start] + array[end];
                if(sum == array[index]){
                    answer++;
                    break;
                } else {
                    if(sum > array[index]){
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}
