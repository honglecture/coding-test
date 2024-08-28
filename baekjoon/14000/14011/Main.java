// https://www.acmicpc.net/problem/14011
// Small PhD Restaurant
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int sum = Integer.parseInt(sArray[1]);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < sArray1.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(n1 >= n2){
                continue;
            }
            list1.add(n1);
            list2.add(n2);
        }
        while (true) {
            boolean flag = false;
            int deleteIndex = -1;
            for (int i = 0; i < list1.size(); i++) {
                int n1 = list1.get(i);
                int n2 = list2.get(i);
                if(sum >= n1){
                    sum -= n1;
                    sum += n2;
                    deleteIndex = i;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                break;
            }
            list1.remove(deleteIndex);
            list2.remove(deleteIndex);
            
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }


}