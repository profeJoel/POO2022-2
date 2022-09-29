class Exterior:
    def __init__(self, mensaje):
        self.mensaje = mensaje
        #self.creador = self.Coordenada(x,y)
    
    def mostrar(self):
        print("Este es el mensaje de la clase exterior: " + self.mensaje)

    class Coordenada:
        def __init__(self, x, y):
            self.x = x
            self.y = y
        
        def mostrar(self):
            print("Coordenada [" + str(self.x) + "," + str(self.y) + "]")