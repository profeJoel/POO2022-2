from Animal import Animal
from Cat import Cat

if __name__ == "__main__":
    oscar = Animal("Oscar","Gato")
    print(oscar.to_string())
    oscar.make_sound()

    minino = Cat("Minino","Gato","Blanco")
    print(minino.to_string())
    minino.purr()