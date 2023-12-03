import java.util.*;

class UL{
    int tc, n;

    public void cntSub()
    {
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();

        int cnt;

        while(tc>0)
        {
            n=sc.nextInt();
            cnt=(int)Math.pow(10,n);
            cnt=cnt-(n-1);
            
            System.out.println(cnt);

            tc--;
        }


    }
}

class TestClass {
    public static void main(String args[] ) throws Exception {

        UL ob= new UL();
        ob.cntSub();
    }
}
