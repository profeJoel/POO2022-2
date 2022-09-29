from Credito import Credito

class Consumo(Credito):

    def __init__(self, identificador, interes, monto, cuotas, morasidad):
        super().__init__(identificador, interes, monto, cuotas)
        self.morasidad = morasidad

    def __str__(self):
        return super().__str__() + " Morasidad: " + str(self.morasidad)