altura_validada = False
peso_validado = False

while not altura_validada:
    print("Ingrese su altura (en Metros):")
    altura = float(input())
    if altura > 0.3 and altura < 2.5:
        altura_validada = True

while not peso_validado:
    print("Ingrese su peso (en Kg):")
    peso = float(input())
    if peso > 30 and peso < 300:
        peso_validado = True

IMC = peso/(altura**2)

if IMC < 18.5:
    print(f"> IMC: {IMC} > DELGADEZ")
elif IMC < 25:
    print(f"> IMC: {IMC} > NORMAL")
else:
    print(f"> IMC: {IMC} > SOBREPESO")