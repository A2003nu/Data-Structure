import java.io.*;
 
// Java implementation to
// reverse bits of a number
class arrayresevsereBit  {
    // function to reverse bits of a number
    public static int reverseBits(int n)
    {
        int rev = 0;
 
        // traversing bits of 'n'
        // from the right
        while (n > 0) {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;
 
            // if current bit is '1'
            if ((int)(n & 1) == 1)
                rev ^= 1;
 
            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        
        return rev;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 11;
        System.out.println(reverseBits(n));
    }
}
 

        int rev = 0;

 

        while (n > 0) {

            

            // 'rev' by 1

            rev <<= 1;

 

            // if current bit is '1'

            if ((int)(n & 1) == 1)

                rev ^= 1;

 

            // bitwise right shift

            //'n' by 1

            n >>= 1;

        }

       

        return rev;

    }

 

    

    public static void main(String[] args)

    {

        int n = 11;

        System.out.println(reverseBits(n));

    }

}

 
