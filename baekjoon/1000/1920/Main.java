//https://www.acmicpc.net/problem/1920
// 수 찾기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            set.add(sArray[i]);
        }
        bf.readLine();
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            if(set.contains(sArray[i])){
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }
}