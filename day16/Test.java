class Test
{
    public static void main(String[] args)
    {
       int[][] nums={
        {1,2,3},
        {4,5},
        {6}
       };

       int count=0;
       for(int[]row:nums)
       {
        //System.out.println(nums.length);
        for(int n:row)
        {
            if(n%2==0)
            {
                count+=n;
            }
        }
       }
        System.out.println(nums[2][1]);
    }
        
}