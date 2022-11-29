"""
Modos:
r - permite leer un archivo
w - permite escribir (sobreescribir)
a - escribir al final
x - crear archivos

t - modo texto
b - modo binario
"""
try:
    #Leer un archivo
    f = open("archivo.txt", "r")
    print(f.read())
    f.close()

    #Escritura de archivo
    #Sobreescritura
    f = open("archivo.txt", "w")
    f.write("Esta es una nueva línea")
    f.close()

    #Agrega al final
    f = open("archivo.txt", "a")
    f.write("Esta es otra línea al final")
    f.close()

    #Crear un archivo
    f = open("archivo2.txt", "w")
    f.write("Se crea Archivio con w")
    f.close()

    f = open("archivo3.txt", "a")
    f.write("Se crea Archivio con a")
    f.close()

    if open("archivo4.txt", "x"):
        print("Archivo creado con éxito")

    with open("archivo2.txt", "r") as f:
        print(f.read())
        f.close()
except:
    print("El archivo no existe...")