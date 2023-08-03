// https://www.acmicpc.net/problem/1009
//  분산처리
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int a = Integer.parseInt(sArray[0]);
            int b = Integer.parseInt(sArray[1]);
            if(a % 10 == 0){
                bw.write("10\n");
                continue;
            }
            List<Integer> list = new ArrayList<>();
            list.add(a % 10);
            int result = list.get(0);
            while(true){
                result = result * a;
                if(result % 10 == list.get(0)){
                    break;
                }
                list.add(result % 10);
            }
            int answer = b % list.size();
            if(answer == 0){
                answer = list.size() - 1;
            } else {
                answer -= 1;
            }
            bw.write(list.get(answer) + "\n");
        }
        bw.flush();
        bw.close();
    }

}