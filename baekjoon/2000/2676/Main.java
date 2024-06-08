// https://www.acmicpc.net/problem/2676
// 라스칼 삼각형
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 50000; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(0);
        for (int i = 1; i <= 50000; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    list.get(i).add(1);
                } else {
                    int n1 = list.get(i - 1).get(j - 1);
                    int n2 = list.get(i - 1).get(j);
                    int result = (n1 * n2) + 1;
                    list.get(i).add(result);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            bw.write(list.get(n1).get(n2) + "\n");
        }
        bw.flush();
        bw.close();
    }

}