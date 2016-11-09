/**
 * Created by admin on 2016/11/1.
 */
public class 循环阶乘 {
    public static void main(String[] args) {
        int i,n,sum;
        n=1;
        sum=0;
        for (i=1;i<=10;i++)
        {
            sum = sum + n;
            n = n + 1;
            System.out.print("sum=" + sum);
        }
    }
}
