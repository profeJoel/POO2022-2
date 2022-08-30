class Cat:
    #name:str

    def __init__(self, name, sex, age, weight, color, texture):
        self.name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.color = color
        self.texture = texture
    
    def meow(self):
        print(self.name + " hace MEOWWW!!!")