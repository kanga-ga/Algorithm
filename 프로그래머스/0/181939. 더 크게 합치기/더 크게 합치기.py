def solution(a, b):
    answer = 0
    c,d= map(str,(a,b))
    e = c+d
    f = d+c
    if int(e)< int(f):
        answer = int(f)
    else:
        answer =int(e)
    return answer