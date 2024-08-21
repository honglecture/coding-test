// https://www.acmicpc.net/problem/6765
// Icon Scaling
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
        int size = Integer.parseInt(bf.readLine());
        String[] array = {"*x*", " xx", "* *"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            for (int j = 0; j < size; j++) {
                String answer = "";
                for (int k = 0; k < str.length(); k++) {
                    for (int l = 0; l < size; l++) {
                        answer += String.valueOf(str.charAt(k));
                    }
                }
                list.add(answer);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}