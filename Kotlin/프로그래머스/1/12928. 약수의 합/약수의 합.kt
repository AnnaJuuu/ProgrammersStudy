class Solution 
{
    fun solution(n: Int): Int 
    {
        var answer = 0
        var n1 = n
        
        for ( i in 1..n1)
        {
            if (n % i == 0) 
            {
                answer += i
            }
        }
        return answer
    }
}