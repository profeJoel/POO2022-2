class Cat:
    #name:str

    def __init__(self, name, sex, age, weight, color, texture):
        self._name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.__color = color
        self.texture = texture

    def get_name(self)->str:
        return self._name

    def get_color(self)->str:
        return self.__color

    def set_color(self, nuevo_color:str)->bool:
        colores_validos = ["blanco","gris","negro","naranja","marron"]
        for color in colores_validos:
            if color == nuevo_color:
                self.__color = nuevo_color
                return True
        return False

    def meow(self):
        print(self._name + " hace MEOWWW!!!")