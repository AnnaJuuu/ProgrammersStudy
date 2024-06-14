class Solution 
{
    fun solution(my_string: String, n: Int): String 
    {
        return my_string.map {it.toString().repeat(n)}.joinToString("")
    }
}

// def solution(my_string, n):
//     answer = ''
//     for i in my_string:
//         answer += i * n
//     return answer