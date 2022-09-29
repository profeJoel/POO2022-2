from Cliente import Cliente
from Producto import Producto
from Cuenta import Cuenta
from Credito import Credito
from Vista import Vista
from Corriente import Corriente
from Consumo import Consumo
from Hipotecario import Hipotecario

if __name__ == "__main__":
    c1 = Cliente("000000000-0", "NN")

    cv = Vista(1, 1000000, 2000000)
    cc = Corriente(2, 4000000, 10000000)
    cconsumo = Consumo(3, 2.5, 20000000, 24, 5.0)
    ch = Hipotecario(4, 1.5, 300000000, 120, "Casa")

    c1.add_producto(cv)
    c1.add_producto(cc)
    c1.add_producto(cconsumo)
    c1.add_producto(ch)

    print(c1)
    
    