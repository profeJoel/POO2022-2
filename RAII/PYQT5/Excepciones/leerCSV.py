from Persona import Persona

nueva_persona = None
lista_personas = []

palabras = []
es_primero = True

try:
    with open("datosPersonas.csv","r") as f:
        for linea in f.readlines():
            if es_primero:
                es_primero = False
            else:
                palabras = linea.split(",")
                print(palabras[1])

                nueva_persona = Persona(int(palabras[0]), palabras[1], palabras[2], palabras[3])

                lista_personas.append(nueva_persona)

    print(f"El tamaño de la lista es {lista_personas.__len__()} Personas\n")
    #print(f"El tamaño de la lista es {len(lista_personas)}")
    for p in lista_personas:
        print(f">>> {p.nombre}")
except:
    print("Error en la lectura de archivo")