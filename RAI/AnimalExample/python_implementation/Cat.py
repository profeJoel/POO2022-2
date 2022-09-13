from Animal import Animal

class Cat(Animal):
    def __init__(self, name, specie, color) -> None:
        super().__init__(name, specie)
        self.color = color

    def purr(self):
        print("El gato " + self.name + " hace PURRRRRRRRR!!!!\n")
    
    def make_sound(self):
        print("El gato " +self.name + " hace MIAUUU...\n")

    def to_string(self):
        return "El Gato " + self.name + " de color " + self.color

    def __str__(self):
        return "El Gato " + self.name + " de color " + self.color