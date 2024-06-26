class Solution {
    fun solution(num: Int): Int {
        var count = 0
        var n = num.toLong()
        while(n != 1L) {
            if(count >= 500) break

            if(n % 2 == 0L) n = n / 2
            else n = n * 3 + 1
            count++
        }

        return if(count >= 500) -1 else count
    }
}

//조건문으로 
//if(num % 2 == 0) answer = num / 2
//else answer = num * 3 + 1
//conut += 1
//반복문 필요