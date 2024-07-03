// https://www.acmicpc.net/problem/14075
// Luhn
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(i % 2 == 0){
                n *= 2;
                if(n > 9){
                    int result = 1 + (n % 10);
                    list.add(String.valueOf(result));
                } else {
                    list.add(String.valueOf(n));
                }
            } else {
                list.add(String.valueOf(n));
            }
        }
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum += Integer.parseInt(list.get(j));
        }
        if(sum % 10 == 0){
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
        bw.flush();
        bw.close();
    }


}