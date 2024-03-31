// https://www.acmicpc.net/problem/25632
// 소수 부르기 게임
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n1 = Integer.parseInt(sArray1[0]);
        int n2 = Integer.parseInt(sArray1[1]);
        int n3 = Integer.parseInt(sArray2[0]);
        int n4 = Integer.parseInt(sArray2[1]);
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(n >= n1 && n <= n2){
                set1.add(n);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(n >= n3 && n <= n4){
                set2.add(n);
            }
        }
        boolean flag = true;
        String answer = "";
        while (true) {
            int deleteNum = 0;
            if(flag){
                if(set1.size() == 0){
                    answer = "yj";
                    break;
                }
                flag = false;
                for (int n : set1) {
                    if(set2.contains(n)){
                        deleteNum = n;
                        break;
                    }
                }
                if(deleteNum == 0){
                    deleteNum = set1.iterator().next();
                } else {
                    set2.remove(deleteNum);
                }
                set1.remove(deleteNum);
            } else {
                if(set2.size() == 0){
                    answer = "yt";
                    break;
                }
                flag = true;
                for (int n : set2) {
                    if(set1.contains(n)){
                        deleteNum = n;
                        break;
                    }
                }
                if(deleteNum == 0){
                    deleteNum = set2.iterator().next();
                } else {
                    set1.remove(deleteNum);
                }
                set2.remove(deleteNum);
            }
        }
        System.out.println(answer);
        
        bw.flush();
        bw.close();
    }

}
