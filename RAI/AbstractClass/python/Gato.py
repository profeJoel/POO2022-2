from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre):
        self.nombre = nombre

    def makeSound(self):
        print(self.nombre + " Maulla...")