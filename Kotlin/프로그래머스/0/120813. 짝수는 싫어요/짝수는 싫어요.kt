class Solution 
{
    fun solution(n: Int): IntArray 
    {
        var answer : IntArray = intArrayOf()
        answer.sort() 
        for (i in 1..n)
        {
            if(i % 2 != 0)
            {
                answer += i
            }
        }
        return answer
    }
}