def potencia(b,e):
  pot = 1
  for i in range(e):
    pot *= b

  return pot



print("Ingrese la base\n")
b = int(input())
print("Ingrese el exponente\n")
e = int(input())

print("La base es" + str(b) + " y el exponente" + str(e))
print("El resultado es : " + str(potencia(b,e)))