class Solution 
{
    fun solution(x: Int, n: Int): List<Long> 
    {
        var answer = mutableListOf<Long>()
        
        for(i in 1..n)
        {
            answer.add(x.toLong() * i)
        }
        return answer
    }
}