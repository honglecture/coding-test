// https://www.acmicpc.net/problem/30684
// 모르고리즘 회장 정하기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String name = bf.readLine();
            if(name.length() == 3){
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }

    

}
