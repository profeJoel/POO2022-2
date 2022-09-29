from Producto import Producto

class Cliente:
    def __init__(self, rut, nombre):
        self.rut = rut
        self.nombre = nombre
        self.mis_productos = [None] * 4
        self.limite = 4
        self.cupo = 4

    def add_producto(self, nuevo: Producto):
        if self.cupo > 0:
            self.mis_productos[self.limite - self.cupo] = nuevo
            self.cupo -= 1

    def __str__(self):
        str_productos = ""
        for p in self.mis_productos:
            str_productos += "\n" + str(p)

        return "Cliente (" + self.rut + "): " + self.nombre + "\nProductos:" + str_productos