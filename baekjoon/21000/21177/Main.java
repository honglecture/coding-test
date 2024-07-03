// https://www.acmicpc.net/problem/21177
// No Thanks!
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            int beforeNum = list.get(list.size() - 1);
            if(beforeNum + 1 == n){
                list.add(n);
            } else {
                answer += list.get(0);
                list.clear();
                list.add(n);
            }
        }
        answer += list.get(0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
