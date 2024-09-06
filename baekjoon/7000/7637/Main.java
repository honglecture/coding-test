// https://www.acmicpc.net/problem/7637
// AAAAHH! Overbooked!
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
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            List<Integer> startList = new ArrayList<>();
            List<Integer> endList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String[] sArray = bf.readLine().split("\\-");
                String[] str1 = sArray[0].split("\\:");
                String[] str2 = sArray[1].split("\\:");
                int sum1 = Integer.parseInt(str1[0]) * 60 + Integer.parseInt(str1[1]);
                int sum2 = Integer.parseInt(str2[0]) * 60 + Integer.parseInt(str2[1]);
                startList.add(sum1);
                endList.add(sum2);
            }
            boolean result = getAnswer(startList, endList);
                if(result){
                    bw.write("no conflict\n");
                } else {
                    bw.write("conflict\n");
                }
        }
        bw.flush();
        bw.close();
    }
    private static boolean getAnswer(List<Integer> startList, List<Integer> endList){
        boolean flag = true;
        for (int i = 0; i < startList.size() - 1; i++) {
            int start1 = startList.get(i);
            int end1 = endList.get(i);
            for (int j = i + 1; j < startList.size(); j++) {
                int start2 = startList.get(j);
                int end2 = endList.get(j);
                if(start2 < start1 && end2 > start1){
                    flag = false;
                    break;
                }
                if(start2 < end1 && end2 > end1){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }
}