// https://www.acmicpc.net/problem/3745
// 오름세
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
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            String[] sArray = bf.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < sArray.length; i++) {
                if(sArray[i].equals(" ")){
                    continue;
                }
                list.add(Integer.parseInt(sArray[i]));
            }
            int[] array = new int[list.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = list.get(i);
            }
            int start = 0;
            int answer = 1;
            while (true) {
                if(start >= array.length - 1){
                    break;
                }
                int n1 = array[start];
                int n2 = array[start + 1];
                if(n1 < n2){
                    int count = 1;
                    for (int i = start; i < array.length - 1; i++) {
                        n1 = array[i];
                        n2 = array[i + 1];
                        if(n1 < n2){
                            count++;
                        } else {
                            start = i + 1;
                            break;
                        }
                    }
                    if(answer < count){
                        answer = count;
                    }
                } else {
                    start++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}

