class Sum
{
    int a;
    int b;
    public int pri(int x,int y)
        {
            //System.out.print(x+y);
            return x+y;
        }
    
    }
    public class Operations
    {
        public static void main(String[] args)
        { 
            Sum su= new Sum();
            int ans=su.pri(12,19);
        System.out.println(ans);
    }
}