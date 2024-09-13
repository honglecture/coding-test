// https://www.acmicpc.net/problem/4540
// Q
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
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size1 = Integer.parseInt(sArray[0]);
            int size2 = Integer.parseInt(sArray[1]);
            String[] array = bf.readLine().split(" ");
            List<String> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                list.add(array[j]);
            }
            for (int j = 0; j < size2; j++) {
                sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]) - 1;
                int n2 = Integer.parseInt(sArray[1]) - 1;
                String str = list.get(n1);
                list.remove(n1);
                list.add(n2, str);
            }
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                answer.append(list.get(j) + " ");
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}