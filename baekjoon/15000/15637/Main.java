// https://www.acmicpc.net/problem/15637
// Lotto
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) - 1;
        int[] array = {
            103
,88
,91
,99
,101
,86
,96
,100
,71
,91
,96
,91
,98
,102
,96
,85
,102
,97
,91
,112
,85
,79
,86
,91
,97
,98
,110
,80
,88
,80
,95
,83
,93
,109
,88
,91
,103
,90
,95
,113
,81
,86
,97
,93
,93
        };
        System.out.println(array[n]);
        bw.flush();
        bw.close();
    }

    
}
