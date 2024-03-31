// https://www.acmicpc.net/problem/6780
// Sumac Sequences
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
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        while (true) {
            int num1 = list.get(list.size() - 1);
            int num2 = list.get(list.size() - 2);
            if(num1 > num2){
                break;
            }
            list.add(num2 - num1);
        }
        System.out.println(list.size());
        bw.flush();
        bw.close();
    }

    
}