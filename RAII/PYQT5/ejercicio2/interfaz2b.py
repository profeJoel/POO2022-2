import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg

# Se describe la ventana_secundaria, que no es instanciada 
# hasta que es llamada desde la clase ventana_principal()
class ventana_secundaria(qtw.QWidget):
    
    # en este caso se recibe la referencia al objeto de la clase principal para poder realizar acciones sobre ella (hide y show)
    def __init__(self, ventana): 
        super().__init__()

        self.setWindowTitle("Interfaz 2: intercambiando layouts PyQt5...")
        self.setLayout(qtw.QHBoxLayout())
        
        #Conjunto de componentes Layout 2 (QHBox)
        componentes_layout2 = []
        texto2 = qtw.QLabel("Este es el QHBox")
        texto2.setFont(qtg.QFont("Helvetica", 18))
        componentes_layout2.append(texto2)

        # en esta línea se captura el evento del boton y se lanza el método cambiar_ventana()
        boton2 = qtw.QPushButton("OK", clicked = lambda: self.cambiar_ventana(ventana))
        # Cambiar ventana realizará acciones sobre el objeto ventana (ventana_principal)
        componentes_layout2.append(boton2)
        self.agregar_componentes(componentes_layout2)
        
        self.show()

    def agregar_componentes(self, lista_componentes):
        for componente in lista_componentes:
            self.layout().addWidget(componente)

    # En este método se realiza el cambio entre hide() para la ventana actual y show() para la ventana principal
    def cambiar_ventana(self,ventana):
        ventana.show()
        self.hide()