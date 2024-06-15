// https://www.acmicpc.net/problem/5340
//  Secret Location
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String str = bf.readLine().trim();
            list.add(str.length());
        }
        System.out.println("Latitude " + list.get(0) + ":"+list.get(1)+":"+list.get(2));
        System.out.println("Longitude " + list.get(3) + ":"+list.get(4)+":"+list.get(5));
        bw.flush();
        bw.close();
    }
}