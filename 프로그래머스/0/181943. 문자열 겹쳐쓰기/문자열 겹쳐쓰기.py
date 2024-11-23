def solution(my_string, overwrite_string, s):
    answer = ''
    len1 = len(my_string)
    len2 = len(overwrite_string)
    str1 = my_string[:s]
    str2 = overwrite_string+my_string[s+len2:] 
    answer = str1 + str2
    return answer