import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg

class ventana_principal(qtw.QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Interfaz 1: Probando PyQt5...")
        self.setLayout(qtw.QVBoxLayout())

        texto1 = qtw.QLabel("Hola Mundo!!!...")
        texto1.setFont(qtg.QFont("Helvetica", 18))
        self.layout().addWidget(texto1)

        boton = qtw.QPushButton("OK", clicked = lambda: texto1.setText("Se acabó la Clase..."))
        self.layout().addWidget(boton)

        self.show()

if __name__ == "__main__":
    # Lanzar la aplicación
    app = qtw.QApplication([])
    ventana = ventana_principal()

    app.exec_()