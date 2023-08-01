// https://www.acmicpc.net/problem/11723
// 집합
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            set1.add(i);
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String type = sArray[0];
            if(type.equals("add")){
                int n = Integer.parseInt(sArray[1]);
                set.add(n);
            } else if(type.equals("remove")){
                int n = Integer.parseInt(sArray[1]);
                set.remove(n);
            } else if(type.equals("check")){
                int n = Integer.parseInt(sArray[1]);
                if(set.contains(n)){
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if(type.equals("toggle")){
                int n = Integer.parseInt(sArray[1]);
                if(set.contains(n)){
                    set.remove(n);
                } else {
                    set.add(n);
                }
            } else if(type.equals("all")){
                set.addAll(set1);
            } else if(type.equals("empty")){
                set.clear();
            }
        }
        bw.flush();
        bw.close();
    }
}