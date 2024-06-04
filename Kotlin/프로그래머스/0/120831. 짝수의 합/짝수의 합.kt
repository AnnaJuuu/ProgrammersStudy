class Solution 
{
    fun solution(n: Int): Int 
    {
        var answer = 0
        for (i in 1..n)
        {
            if (i % 2 == 0)
            {
                answer += i
            } else 0
        }
        return answer
    }
}

