from Animal import Animal

class Dog(Animal):
    def __init__(self, name, specie, size, pelaje):
        super().__init__(name, specie)
        self.size = size
        self.pelaje = pelaje

    
    def make_sound(self):
        print("El perro " +self.name + " hace GUAUU...\n")

    def to_string(self):
        return "El perro " + self.name + " de pelaje " + self.pelaje

    def __str__(self):
        return "El perro " + self.name + " de pelaje " + self.pelaje