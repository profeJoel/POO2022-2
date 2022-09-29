from Animal import Animal
from Gato import Gato

if __name__ == "__main__":
    #tom = Animal() # no se puede porque Animal es una clase abstracta

    tom = Gato("Tom")
    tom.makeSound()