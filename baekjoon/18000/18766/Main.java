// https://www.acmicpc.net/problem/18766
// 카드 바꿔치기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            boolean flag = true;
            for (int j = 0; j < sArray1.length; j++) {
                list1.add(sArray1[j]);
            }
            for (int j = 0; j < sArray2.length; j++) {
                list2.add(sArray2[j]);
            }
            Collections.sort(list1);
            Collections.sort(list2);
            for (int j = 0; j < list1.size(); j++) {
                if(!list1.get(j).equals(list2.get(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("NOT CHEATER\n");
            } else {
                bw.write("CHEATER\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
