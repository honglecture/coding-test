// https://www.acmicpc.net/problem/10489
// Even Up Solitaire
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        while (true) {
            boolean flag = false;
            int deleteIndex = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                int n1 = list.get(i);
                int n2 = list.get(i + 1);
                if((n1 + n2) % 2 == 0){
                    deleteIndex = i;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                break;
            }
            list.remove(deleteIndex);
            list.remove(deleteIndex);
        }
        System.out.println(list.size());
        bw.flush();
        bw.close();
    }


    

}