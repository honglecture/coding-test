// https://www.acmicpc.net/problem/11502
// 세 개의 소수 문제
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    private static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        list = new ArrayList<>();
        list.add(2);
        for (int i = 3; i <= 999; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(getAnswer(n)+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(int n){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            int n1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int n2 = list.get(j);
                for (int k = 0; k < list.size(); k++) {
                    int n3 = list.get(k);
                    if(n1 + n2 + n3 > n){
                        break;
                    }
                    if(n1 + n2 + n3 == n){
                        result = n1 + " " + n2 + " " + n3;
                        break;
                    }
                }
                if(n1 + n2 >= n){
                    break;
                }
                if(!result.equals("")){
                    break;
                }
            }
            if(n1 >= n){
                break;
            }
            if(!result.equals("")){
                break;
            }
        }
        return result;
    }

    private static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    
}