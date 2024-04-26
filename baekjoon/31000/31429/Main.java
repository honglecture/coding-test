// https://www.acmicpc.net/problem/31429
// SUAPC 2023 Summer
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array1 = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
        int[] array2 = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};
        bw.write(array1[n - 1] + " " + array2[n - 1] + "\n");
        bw.flush();
        bw.close();
    }

    

}
