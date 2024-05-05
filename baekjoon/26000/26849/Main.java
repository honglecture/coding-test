// https://www.acmicpc.net/problem/26849
// Non Classical Problem
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
        double sum = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double result = n1 / n2;
            list.add(result);
            sum += result;
        }
        Collections.sort(list);
        bw.write(list.get(0) + " " + list.get(list.size() - 1) + " " + sum + "\n");
        bw.flush();
        bw.close();
    }

}
