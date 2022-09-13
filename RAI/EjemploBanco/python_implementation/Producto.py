class Producto:
    def __init__(self, identificador):
        self.identificador = identificador
    
    def get_identificador(self):
        return self.identificador

    def __str__(self):
        return "\nProducto [" + str(self.identificador) + "]"