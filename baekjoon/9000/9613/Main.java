// https://www.acmicpc.net/problem/9613
// 스티커
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private static Map<String, Integer> map = new HashMap<>();
    private static Map<Integer, Boolean> primeMap = new HashMap<>();
    private static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = Integer.parseInt(sArray[j + 1]);
            }
            long result = getAnswer();
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static long getAnswer(){
        long sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int n1 = Integer.max(array[i], array[j]);
                int n2 = Integer.min(array[i], array[j]);
                int result = getGcd(n1, n2);
                sum += result;
            }
        }
        return sum;
    }

    private static int getGcd(int n1, int n2){
        String key = n1 + " " + n2;
        int result = 1;
        boolean checkPrime1 = false;
        boolean checkPrime2 = false;
        if(map.get(key) != null){
            result = map.get(key);
            return result;
        }
        if(n1 == 1 || n2 == 1){
            map.put(key, result);
            return result;
        }
        if(primeMap.get(n1) == null){
            checkPrime1 = isPrime(n1);
            primeMap.put(n1, checkPrime1);
        } else {
            checkPrime1 = primeMap.get(n1);
        }
        if(primeMap.get(n2) == null){
            checkPrime2 = isPrime(n2);
            primeMap.put(n2, checkPrime2);
        } else {
            checkPrime2 = primeMap.get(n2);
        }
        if(checkPrime1 == true && checkPrime2 == true){
            map.put(key, result);
            return result;
        }

        // 두 수의 gcd
        int start = 2;
        while(true){
            if(n1 == 1 || n2 == 1){
                break;
            }
            if(n1 % start == 0 && n2 % start == 0){
                n1 /= start;
                n2 /= start;
                result *= start;
            } else if(n1 % start == 0){
                n1 /= start;
            } else if(n2 % start == 0){
                n2 /= start;
            } else {
                start++;
            }
        }
        map.put(key, result);
        return result;
    }

    private static boolean isPrime(int n){
        boolean resilt = true;
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                resilt = false;
                break;
            }
        }
        return resilt;
    }

}