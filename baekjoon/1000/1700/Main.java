// https://www.acmicpc.net/problem/1700
// 멀티탭 스케줄링
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int key = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            if(set.size() < key){
                set.add(n1);
            } else {
                Set<Integer> removeSet = new HashSet<>(set);
                if(!set.contains(n1)){
                    // 뽑아야 함.
                    for (int j = i + 1; j < array.length; j++) {
                        if(removeSet.size() == 1){
                            break;
                        }
                        int n2 = array[j];
                        if(removeSet.contains(n2)){
                            removeSet.remove(n2);
                        }
                    }
                    // remove set
                    set.remove(removeSet.iterator().next());
                    set.add(n1);
                    answer++;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}
