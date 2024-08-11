// https://www.acmicpc.net/problem/31618
// カードゲーム 2 (Card Game 2)
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        String answer = "No";
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            set.add(array[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            int n2 = n1 + 3;
            int n3 = n1 + 6;
            if(set.contains(n2) && set.contains(n3)){
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
