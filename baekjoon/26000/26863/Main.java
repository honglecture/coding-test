// https://www.acmicpc.net/problem/26863
// Absolutely Flat
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(bf.readLine()));
        list.add(Integer.parseInt(bf.readLine()));
        list.add(Integer.parseInt(bf.readLine()));
        list.add(Integer.parseInt(bf.readLine()));
        Collections.sort(list);
        int n = Integer.parseInt(bf.readLine());
        if(list.get(0) == list.get(3)){
            System.out.println("1");
        } else {
            if(list.get(0) == list.get(3)){
                System.out.println("1");
            } else {
                list.set(0, list.get(0) + n);
                int key = list.get(0);
                boolean flag = true;
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i) != key){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
