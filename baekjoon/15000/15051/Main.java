// https://www.acmicpc.net/problem/15051
// Máquina de café
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int answer1 = n2 + n2 + n3 + n3 + n3 + n3;
        int answer2 = n1 + n1 + n3 + n3;
        int answer3 = n1 + n1 + n1 + n1 + n2 + n2;
        int[] array = {answer1, answer2, answer3};
        Arrays.sort(array);
        System.out.println(array[0]);
        bw.flush();
        bw.close();
    }

    

    
}
