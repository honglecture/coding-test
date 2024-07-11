// https://www.acmicpc.net/problem/7218
// Pasislėpę romėniški skaičiai
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String[] array = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(str.contains(array[i])){
                sb.append((i + 1) + " ");
            }
        }
        if(sb.length() != 0){
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }
}