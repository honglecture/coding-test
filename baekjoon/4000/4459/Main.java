// https://www.acmicpc.net/problem/4459
// Always Follow the Rules in Zombieland
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(array.length -1 < n || n < 1){
                bw.write("Rule "+ n +": No such rule\n");
            } else {
                bw.write("Rule "+ n +": "+array[n]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
