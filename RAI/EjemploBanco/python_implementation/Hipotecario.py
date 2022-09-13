from Credito import Credito

class Hipotecario(Credito):
    
    def __init__(self, identificador, interes, monto, cuotas, propiedad):
        super().__init__(identificador, interes, monto, cuotas)
        self.propiedad = propiedad

    def __str__(self):
        return super().__str__() + " Propiedad: " + self.propiedad