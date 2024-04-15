class newq{
    public static void main(String args[])
    {
        int arr[]={1,5,7,};
        int k=6;
        int pair=0;
        for (int i=0;i<arr.length;i++)
        {
           for(int j=1;j<arr.length-1;j++)
           {
            if(arr[i]+arr[j]==k)
            {
                pair++;
            }
           } 
        }
        System.out.println(pair);
    }
}