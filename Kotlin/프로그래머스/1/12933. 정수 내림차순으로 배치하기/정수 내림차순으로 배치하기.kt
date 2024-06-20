class Solution 
{
    fun solution(n: Long): Long 
    {
        return n.toString()         // 숫자를 문자열로 변환  -> "118372"
            .toList()               // 문자열을 문자 리스트로 변환  -> 
                                    //['1', '1', '8', '3', '7', '2']
            .sortedDescending()     // 내림차순으로 정렬
            .joinToString("")       // 정렬된 리스트를 문자열로 결합 -> "873211"
            .toLong()               // 문자열을 Long 타입으로 변환
    }
}
