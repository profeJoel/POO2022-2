from Animal import Animal
from Cat import Cat
from Dog import Dog

if __name__ == "__main__":
    oscar = Animal("Oscar","Gato")
    print(oscar.to_string())
    oscar.make_sound()

    minino = Cat("Minino","Gato","Blanco")
    print(minino.to_string())
    print(">>>" + str(minino))
    minino.purr()
    minino.make_sound()

    firulais = Dog("Firulais", "Perro", 100, "cobrizo")
    print(firulais.to_string())
    print(">>>" + str(firulais))
    firulais.make_sound()