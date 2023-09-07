    // function to check prime no

    public static int prime(int n)
    {
        if(n<=1)
            return 1;
        
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return 0;         // 0 for not prime yani composite hai
        return 1;                 // 1 for prime yani prime hai
    }
