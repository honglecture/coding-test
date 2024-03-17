// https://www.acmicpc.net/problem/9723
// Right Triangle
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int[] array = {n1, n2, n3};
            Arrays.sort(array);
            if((array[0] * array[0]) + (array[1] * array[1]) == array[2] * array[2]){
                bw.write("Case #"+(i + 1)+": YES\n");
            } else {
                bw.write("Case #"+(i + 1)+": NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}