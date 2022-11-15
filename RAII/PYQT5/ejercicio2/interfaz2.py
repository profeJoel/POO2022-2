import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg

# Se importa el diseño de la ventana secundaria para que exista en el contexto de esta aplicación
from interfaz2b import ventana_secundaria

# Esta es la clase que se despliega al inicio
class ventana_principal(qtw.QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Interfaz 1: intercambiando layouts PyQt5...")
        self.setLayout(qtw.QVBoxLayout())

        #Conjunto de componentes Layout 1 (QVBox)
        componentes_layout1 = []
        texto1 = qtw.QLabel("Este es el QVBox")
        texto1.setFont(qtg.QFont("Helvetica", 18))
        componentes_layout1.append(texto1)

        # En esta línea se captura el evento de click en el boton y ejecuta la acción
        boton1 = qtw.QPushButton("OK",clicked = lambda: self.cambiar_ventana(ventana_secundaria(self)))
        # es el método self.cambiar_ventana() recibe un objeto de tipo ventana_secundaria() y, a su vez, 
        # ventana_secundaria() recibe el objeto de la ventana principal que está haciendo el llamado
        componentes_layout1.append(boton1)
        self.agregar_componentes(componentes_layout1)
        
        self.show()

    # Realiza la asignación de los componentes al layout
    def agregar_componentes(self, lista_componentes):
        for componente in lista_componentes:
            self.layout().addWidget(componente)

    # Realiza el cambio de ventana, objeto dado por ventana_secundaria()
    def cambiar_ventana(self, ventana):
        if ventana == None:
            app2 = qtw.QApplication([])
            ventana2 = ventana_secundaria(self)
            app2.exec_()
        else:
            # Muestra la ventana secundaria creada
            ventana.show()
        # Oculta la ventana principal (pero sigue existiendo)
        self.hide()

if __name__ == "__main__":
    # Lanzar la aplicación de la ventana principal
    app = qtw.QApplication([])
    ventana = ventana_principal()

    app.exec_()
    # ejecutar como:> python3 interfaz2.py