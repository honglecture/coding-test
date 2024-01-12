// https://www.acmicpc.net/problem/2810
// 컵홀더
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        List<String> list = new ArrayList<>();
        list.add("*");
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
            if(str.charAt(i) == 'L'){
                if(!flag){
                    flag = true;
                    continue;
                } else {
                    flag = false;
                }
            }
            list.add("*");
        }
        int count = 0;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("*")){
                count++;
            }
        }
        if(count >= size){
            answer = size;
        } else {
            answer = count;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}