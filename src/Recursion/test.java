package Recursion;

public class test {
    private static void subSeq(String p, String up)
    {
        if(up.isEmpty())
        {
            if(p.isEmpty())
                System.out.print("# ");
            else
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    public static void main(String[] args) {
        String s = "ABC";
        subSeq("", s);
    }
}
