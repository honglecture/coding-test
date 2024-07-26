// https://www.acmicpc.net/problem/18142
// Tapioka
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            if(str.equals("bubble") || str.equals("tapioka")){
                continue;
            }
            list.add(str);
        }
        if(list.size() == 0){
            System.out.println("nothing");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i) + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
        bw.flush();
        bw.close();
    }

}
