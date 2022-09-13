from Producto import Producto

class Cliente:
    def __init__(self, rut, nombre):
        self.rut = rut
        self.nombre = nombre
        self.mis_productos = [3]
        self.limite = 4
        self.cupo = 4
    
    def get_nombre(self):
        return self.nombre

    def add_producto(self, nuevo: Producto):
        if self.cupo > 0:
            self.mis_productos[self.limite - self.cupo] = nuevo
            self.cupo -= 1

    def __str__(self):
        