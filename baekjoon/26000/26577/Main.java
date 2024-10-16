// https://www.acmicpc.net/problem/26577
// Math
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int result = getAnswer(bf.readLine());
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String param){
        int result = 0;
        List<String> list = new ArrayList<>();
        String[] sArray = param.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < sArray.length; i++) {
            
        }
        return result;
    }
    

}
