class Solution {
public:
    bool isHappy(int n)
    {
        int r=0;
        int count=0;
        int temp=0;
        while(n!=1)
        {
            temp=n;
            n=0;
            while(temp>0)
            {
            
                r=temp%10;
                n=n+(r*r);
                temp=temp/10;
            }
            count++;
            if(count>=1000)
            {
                break;
            }
        }
        if(n==1)
        {
            return true;
        }
            return false;
        
        
    }
};
