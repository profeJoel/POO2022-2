from Producto import Producto

class Credito(Producto):
    def __init__(self, identificador, interes, monto, cuotas):
        super().__init__(identificador)
        self.interes = interes
        self.monto = monto
        self.cuotas = cuotas

    def __str__(self):
        return super().__str__() + "Credito: " + str(self.monto) + " (" + str(self.interes) + " en " + str(self.cuotas)
