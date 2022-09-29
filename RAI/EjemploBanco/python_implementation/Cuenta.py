from Producto import Producto

class Cuenta(Producto):
    def __init__(self, id, saldo):
        super().__init__(id)
        self.saldo = saldo

    def get_saldo(self):
        return self.saldo

    def __str__(self):
        return super().__str__() + "Cuenta: " + str(self.saldo)