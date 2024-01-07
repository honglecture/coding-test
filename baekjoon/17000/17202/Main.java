// https://www.acmicpc.net/problem/17202
// 핸드폰 번호 궁합
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            list.add(Integer.parseInt(String.valueOf(c1)));
            list.add(Integer.parseInt(String.valueOf(c2)));
        }
        while (true) {
            if(list.size() == 2){
                break;
            }
            List<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                int n1 = list.get(i);
                int n2 = list.get(i + 1);
                String result = (n1 + n2) + "";
                if(result.length() == 2){
                    nextList.add(Integer.parseInt(String.valueOf(result.charAt(1))));
                } else {
                    nextList.add(Integer.parseInt(result));
                }
            }
            list = nextList;
        }
        System.out.println(list.get(0) + "" + list.get(1));
        bw.flush();
        bw.close();
    }

   
}
