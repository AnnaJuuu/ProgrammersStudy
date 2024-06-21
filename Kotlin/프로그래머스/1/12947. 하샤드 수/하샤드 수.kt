class Solution 
{
    fun solution(x: Int): Boolean 
    {
        val num = x.toString().split("")
        var result = 0
       
        for(i in num) 
        {
            if(i != "")
            result += i.toInt()
        }
        
        return if (x % result == 0) true
        else false
    }
}
