t = int(input())

def strfry(a: str, b: str):
    a1 = sorted(a)
    b1 = sorted(b)

    if a1 == b1:
        print("Possible")
    else:
        print("Impossible")


while t > 0:
    a, b = input().split()
    strfry(a,b)
    t -= 1
    