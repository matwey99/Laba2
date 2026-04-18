def cyclic_shift(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    doubled = s + s
    return t in doubled

def main():
    s = input("S: ")
    t = input("T: ")

    if cyclic_shift(s, t):
        print("Yes")
    else:
        print("No")