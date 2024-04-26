// https://www.acmicpc.net/problem/15577
// Prosjek
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Double.parseDouble(bf.readLine()));
        }
        Collections.sort(list);
        while (true) {
            if(list.size() == 1){
                break;
            }
            double n1 = list.get(0);
            double n2 = list.get(1);
            double result = (n1 + n2) / 2;
            list.remove(0);
            list.remove(0);
            list.add(0, result);
        }
        System.out.println(String.format("%.6f", list.get(0)));
        bw.flush();
        bw.close();
    }

    
}
