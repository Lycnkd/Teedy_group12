import java.util.Scanner;
public class data {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=17;i++){
            int temp=in.nextInt();
            sum+=temp*(Math.pow(2,18-i)%11);
        }
        int answer=(12-sum%11)%11;
        System.out.println(answer);
    }
}
