// https://www.acmicpc.net/problem/27622
// Suspicious Event
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n > 0){
                set.add(n);
            } else {
                n = -n;
                if(!set.contains(n)){
                    answer++;
                } else {
                    set.remove(n);
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
