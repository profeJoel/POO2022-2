n1 = int(input())
n2 = int(input())

try:
    print(f"El resultado es {n1/n2}")
except:
    print("La operación no es posible de realizar")
finally:
    print("Pase por la excepción")