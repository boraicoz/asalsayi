public class AsalSayi {
    public static void main(String[] args) {
        int k,i;
        for(i=2;i<100;i++)
        {
            for(k=2;k<i;k++)
            {
             if(i%k==0)
               break;
            }
               if (i==k)
                   System.out.println(i);
        }

    }
}
