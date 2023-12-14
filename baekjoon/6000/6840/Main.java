// https://www.acmicpc.net/problem/6840
// Who is in the middle?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[3];
        array[0] = Integer.parseInt(bf.readLine());
        array[1] = Integer.parseInt(bf.readLine());
        array[2] = Integer.parseInt(bf.readLine());
        Arrays.sort(array);
        System.out.println(array[1] + "\n");
        bw.flush();
        bw.close();
    }

    
}