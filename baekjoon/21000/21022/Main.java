// https://www.acmicpc.net/problem/21022
// Three Points for a Win
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        String[] array1 = bf.readLine().split(" ");
        String[] array2 = bf.readLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            int n1 = Integer.parseInt(array1[i]);
            int n2 = Integer.parseInt(array2[i]);
            if(n1 > n2){
                answer += 3;
            } else if(n1 == n2){
                answer += 1;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
