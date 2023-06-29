// https://www.acmicpc.net/problem/15596
// 정수 N개의 합
public class Test {
    
    public long sum(int[] a){
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}
