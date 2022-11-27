class Solution:
    def compress(self, chars: List[str]) -> int:
        length = 0
        count = 1
        chars.append(" ")

        for i in range(1, len(chars)): 
            if chars[i] == chars[i - 1]: 
                count += 1
                continue

            chars[length] = chars[i - 1]
            length += 1

            if count == 1: continue 

            for number in str(count): 
                chars[length] = number
                length += 1

            count = 1
        
        return length
