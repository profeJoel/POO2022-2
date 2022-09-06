from Animal import Animal

class Cat(Animal):
    def __init__(self, name, specie, color) -> None:
        super().__init__(name, specie)
        self.color = color

    def purr(self):
        print("El gato " + self.name + " hace PURRRRRRRRR!!!!\n")