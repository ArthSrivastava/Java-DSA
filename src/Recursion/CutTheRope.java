package Recursion;

public class CutTheRope {

    private static int cut(int n, int a, int b, int c){
            if(n == 0)
                return 0;
            if(n < 0)
                return -1;
            int res = max(cut(n-a,a,b,c), cut(n-b,a,b,c), cut(n-c,a,b,c));

            if(res == -1)
                return -1;

        return res + 1;
    }

    private static int max(int cut, int cut1, int cut2) {
        int m;
        if(cut >= cut1 && cut >= cut2)
        {
            m = cut;
        }
        else if( cut1 >= cut && cut1 >= cut2)
        {
            m = cut1;
        }
        else{
            m = cut2;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(cut(23, 9, 11, 12));
    }
}
