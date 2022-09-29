from abc import ABC, abstractmethod

class Animal(ABC):
    #ABC indica que no se debe tener un constructor

    @abstractmethod
    def makeSound(self):
        pass  # Equivalente a {}