package Interview.lecode;

/**
 * @author Gena
 * @description
 * @date 2019/5/9 0009
 */
public class longArray {
    static short A[] = {0,1,2,3,1,1,2,3,8,4,10,13,14,9,6,5,4,5};
    static int C[] = new int[256];
    static int max1=0, max2=0; //max1>=max2
    public static int get_len(int begin, int end, int diff)
    {
        int total_len = (end-begin)/diff;
        if(max2>total_len)
        {
            return max2;
        }
        else if(max1>total_len)
        {
            max2 = total_len;
            return max2;
        }
        else //total_len>max1
        {
            max2 = max1;
        }
        int flag=0;
        int head_len=0, comm_len=0, tail_len=total_len;
        int sub1=0, sub2=0;
        for(int i=begin; i<end; i+=diff)
        {
            if(C[i]<2)
            {
                if(flag==1)
                {
                    tail_len = total_len - head_len - comm_len;
                    sub1 = head_len+comm_len;
                    sub2 = comm_len+tail_len;
                    int tmp_min = (sub1<sub2)?sub1:sub2;
                    if(tmp_min>max2)
                    {
                        max2 = tmp_min;
                    }
                    head_len = head_len+comm_len;
                }
                flag=0;
                head_len ++;
                comm_len = 0;
            }
            else //(C[i]>=2)
            {
                if(flag==0)
                {
                    comm_len=0;
                }
                flag=1;
                comm_len ++;
            }
        }
        max1 = total_len;
        return max2;
    }
    public static void main(String[] argv)
    {
        int i;
        for(i=0; i<256; i++)
        {
            C[i] = 0;
        }
        for(i=0; i<A.length; i++)
        {
            C[A[i]]++;
//            C[A[i]+128]++;
        }

        int diff; // difference between the consecutive terms
        int maxlen=0;
        max1=0; max2=0;
        for(i=0; i<256; i++)
        {
            if(C[i]>max1)
            {
                max2=max1;
                max1=C[i];
            }
            else if (C[i]>max2)
            {
                max2=C[i];
            }
        }
        int diff_0 = (max1/2>max2)?max1/2:max2;
        maxlen = (maxlen>diff_0)?maxlen:diff_0;   //diff=0

        for(diff=1;diff<256;diff++)
        {
            max1=0; max2=0;
            int consecutive_begin=-1;
            for(int base=0; base<diff; base++)
            {
                for(int step=base; step<256; step+=diff)
                {
                    if(C[step]==0)
                    {
                        if((consecutive_begin!=-1))
                        {
                            int tmp = get_len(consecutive_begin, step, diff);
                            maxlen = (maxlen>tmp)?maxlen:tmp;
                        }
                        consecutive_begin = -1;
                    }
                    else{
                        if(consecutive_begin == -1)
                        {
                            consecutive_begin = step;
                        }
                    }
                }
            }
        }
        System.out.println(maxlen);
        return;
    }
}
