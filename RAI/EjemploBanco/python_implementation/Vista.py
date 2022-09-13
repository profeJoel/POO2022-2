from Cuenta import Cuenta

class Vista(Cuenta):
    def __init__(self, id, saldo, limite_saldo):
        super().__init__(id, saldo)
        self.limite_saldo = limite_saldo

    def get_limite_saldo(self):
        return self.limite_saldo

    def __str__(self):
        return super().__str__() + "(" + str(self.limite_saldo) + ")"
