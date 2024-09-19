// https://www.acmicpc.net/problem/20811
// Öar
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        while (true) {
            int n = list.get(list.size() - 2) + list.get(list.size() - 1);
            list.add(n);
            if(n >= 10000){
                break;
            }
        }
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            sum += n;
            if(key <= sum){
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    

}
