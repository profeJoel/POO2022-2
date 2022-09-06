
class Animal:
    def __init__(self, name, specie):
        self.name = name
        self.specie = specie

    def make_sound(self):
        print("El animal " +self.name + " hace un sonido...\n")

    def to_string(self):
        return "El animal se llama " + self.name + " de la especie " + self.specie