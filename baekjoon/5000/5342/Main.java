// https://www.acmicpc.net/problem/5342
//  Billing
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Double> map = new HashMap<>();
        map.put("Paper", 57.99);
        map.put("Printer", 120.50);
        map.put("Planners", 31.25);
        map.put("Binders", 22.50);
        map.put("Calendar", 10.95);
        map.put("Notebooks", 11.20);
        map.put("Ink", 66.95);
        double answer = 0;
        while (true) {
            String str = bf.readLine();
            if(str.equals("EOI")){
                break;
            }
            answer += map.get(str);
        }
        System.out.println("$"+answer);
        bw.flush();
        bw.close();
    }
}