// https://www.acmicpc.net/problem/11068
// 회문인 수
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            boolean flag = false;
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            if(sb.toString().equals(sb.reverse().toString())){
                bw.write("1\n");
                continue;
            }
            for (int j = 2; j <= 64; j++) {
                if(j == 10){
                    continue;
                }
                if(getAnswer(n, j)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
    private static boolean getAnswer(int n, int count){
        boolean flag = true;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int num = n;
        while (true) {
            int n1 = num / count;
            int n2 = num % count;
            list1.add(n2);
            if(n1 <= count - 1){
                if(n1 != 0){
                    list1.add(n1);
                }
                break;
            }
            num /= count;
        }
        for (int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            int n1 = list1.get(i);
            int n2 = list2.get(i);
            if(n1 != n2){
                flag = false;
                break;
            }
        }
        return flag;
    }

}