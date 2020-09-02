package recursion.rabbitProblem.hannuota;

/**
 * @author Gena
 * @description
 * @date 2020/8/1 0001
 */
public class HannuoTa {
    public static void hannuota(String from,String to,String temp,int n){
        if (n==1){
            System.out.println(from+"------->"+to);
        }else {
            hannuota(from,temp,to,n-1);
            hannuota(from,to,temp,1);
            hannuota(temp,to,from,n-1);
        }
    }

    public static void main(String[] args){
        hannuota("A","C","B",64);
    }
}
