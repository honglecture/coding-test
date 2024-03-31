// https://www.acmicpc.net/problem/31216
// 슈퍼 소수
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        boolean[] array =  new boolean[400001];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
        array[0] = array[1] = false;
        for (int i = 2; i <= Math.sqrt(array.length - 1); i++) {
            if(array[i]){
                for (int j = i * i; j <= array.length - 1; j += i) {
                    array[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                count++;
                if(array[count]){
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(list.get(n - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
