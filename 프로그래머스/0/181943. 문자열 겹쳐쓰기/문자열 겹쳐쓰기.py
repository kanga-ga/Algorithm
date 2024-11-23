def solution(my_string, overwrite_string, s):
    answer = ''
    len1 = len(my_string)
    len2 = len(overwrite_string)
    str1 = my_string[0:s]
    str2 = my_string[s+len2:]
    answer = str1 + overwrite_string + str2
    return answer