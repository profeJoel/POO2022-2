from dataclasses import dataclass

@dataclass
class Persona:
    #Atributos
    nombre: str
    edad: int
    altura: float

    """
    def __init__(self, nombre, edad, altura):
        self.nombre = nombre
        self.edad = edad
        self.altura = altura
    """

if __name__ == "__main__":
    A = Persona("Pancho", 15, 1.83)
    print(f"La persona es {A.nombre} de {A.edad} años de edad con una altura de {A.altura} mts")