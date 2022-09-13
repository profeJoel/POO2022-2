from Cuenta import Cuenta

class Corriente(Cuenta):

    def __init__(self, id, saldo, cupo_tarjeta):
        super().__init__(id, saldo)
        self.cupo_tarjeta = cupo_tarjeta

    def get_cupo_tarjeta(self):
        return self.cupo_tarjeta

    def __str__(self):
        return super().__str__() + "Cupo: " + str(self.cupo_tarjeta) + " "