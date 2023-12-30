// https://www.acmicpc.net/problem/2204
// 도비의 난독증 테스트
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            List<String[]> list= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String str = bf.readLine();
                list.add(new String[]{str, str.toUpperCase()});
            }
            Collections.sort(list, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[1].compareTo(o2[1]);
                }
            });
            
            bw.write(list.get(0)[0] + "\n");
        }
        bw.flush();
        bw.close();
    }
}