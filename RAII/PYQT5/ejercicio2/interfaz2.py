import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg


class ventana_principal(qtw.QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Interfaz 2: intercambiando layouts PyQt5...")
        self.setLayout(qtw.QVBoxLayout())


        #Conjunto de componentes Layout 1 (QVBox)
        componentes_layout1 = []
        texto1 = qtw.QLabel("Este es el QVBox")
        texto1.setFont(qtg.QFont("Helvetica", 18))
        componentes_layout1.append(texto1)

        boton1 = qtw.QPushButton("OK", clicked = lambda: self.cambiar_ventana())
        componentes_layout1.append(boton1)
        self.layout1 = qtw.QVBoxLayout()
        self.agregar_componentes(self.layout1, componentes_layout1)
        self.layout().addLayout(self.layout1)

        #Conjunto de componentes Layout 2 (QHBox)
        componentes_layout2 = []
        texto2 = qtw.QLabel("Este es el QHBox")
        texto2.setFont(qtg.QFont("Helvetica", 18))
        componentes_layout2.append(texto2)

        boton2 = qtw.QPushButton("OK", clicked = lambda: self.cambiar_ventana())
        componentes_layout2.append(boton2)
        self.layout2 = qtw.QHBoxLayout()
        self.agregar_componentes(self.layout2, componentes_layout2)
        self.layout().addLayout(self.layout2)
        
        self.show()


    def agregar_componentes(self, layout, lista_componentes):
        for componente in lista_componentes:
            layout.addWidget(componente)
    
    def agregar_layout(self, layout, componentes):
        self.agregar_componentes(layout, componentes)
        self.setLayout(layout)

    def cambiar_ventana(self):
        self.hide()

if __name__ == "__main__":
    # Lanzar la aplicación
    app = qtw.QApplication([])
    ventana = ventana_principal()

    app.exec_()