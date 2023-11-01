// https://www.acmicpc.net/problem/2331
// 반복수열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Long> set = new HashSet<>();
        String[] sArray = bf.readLine().split(" ");
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        List<Long> list = new ArrayList<>();
        long start = n1;
        long index = 0;
        list.add(n1);
        set.add(n1);
        while(true){
            long sum = 0;
            String str = start + "";
            for (int i = 0; i < str.length(); i++) {
                long n = Long.parseLong(str.charAt(i) + "");
                n = (long) Math.pow(n, n2);
                sum += n;
            }
            if(set.contains(sum)){
                start = sum;
                break;
            }
            list.add(sum);
            set.add(sum);
            start = sum;
            index++;
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == start){
                break;
            }
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    
}