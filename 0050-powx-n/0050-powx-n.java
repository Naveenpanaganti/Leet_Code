// class Solution {
//     public double myPow(double x, int n) {
//         long N = n;
//         if(n ==0) return 1; // base case 

//         // converting negative value of n to positive (x/-n can be represented as 1/x(n) )
//         if( n<0){   
//             return 1/myPow(x,-n);
//         }


//         double ans =myPow(x,n/2);  // faith case my belife while each time it will divide by 2
//         double bans =ans*ans;      // actual work / case 

//         if(n%2 != 0){               // if n is a not even we should multiply ans with x
//             return bans*x;          
//         }
//     return bans;                    // if n is even jst return answer
//     }
// }


class Solution {
    public double myPow(double x, int n) {
        long N = n;          // convert to long
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            return 1 / power(x, -n);
        }

        double half = power(x, n / 2);
        double result = half * half;

        if (n % 2 != 0) {
            result = result * x;
        }

        return result;
    }
}
