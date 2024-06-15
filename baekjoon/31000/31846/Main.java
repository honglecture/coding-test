// https://www.acmicpc.net/problem/31846
// 문자열 접기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]);
            int end = Integer.parseInt(sArray[1]);
            String s = str.substring(start - 1, end);
            int result = getAnswer(s);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String str){
        int result = 0;
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder("");
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            sb2.append(" ");
            temp += " ";
        }
        while (true) {
            char c = sb1.charAt(sb1.length() - 1);
            sb1.deleteCharAt(sb1.length() - 1);
            sb1.insert(0, " ");
            sb2.deleteCharAt(0);
            sb2.append(String.valueOf(c));
            if(temp.equals(sb1.toString())){
                break;
            }
            int count = 0;
            for (int i = 0; i < sb1.length(); i++) {
                if(sb1.charAt(i) == ' '){
                    continue;
                }
                if(sb1.charAt(i) == sb2.charAt(i)){
                    count++;
                }
            }
            result = Integer.max(count, result);
        }
        return result;
    }

    

}
