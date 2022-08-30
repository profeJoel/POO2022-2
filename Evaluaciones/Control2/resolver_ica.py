altura_validada = False
cintura_validado = False

while not altura_validada:
    print("Ingrese su altura (en Centimetros):")
    altura = float(input())
    if altura > 30 and altura < 250:
        altura_validada = True

while not cintura_validado:
    print("Ingrese la circunsferencia de su cintura (en Centimetros):")
    cintura = float(input())
    if cintura > 30 and cintura < 300:
        cintura_validado = True

ICA = cintura/altura

if ICA < 0.5:
    print(f"> ICA: {ICA} > NORMAL")
elif ICA < 0.583:
    print(f"> ICA: {ICA} > ROBUSTO")
else:
    print(f"> ICA: {ICA} > RIESGO FATAL")