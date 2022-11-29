from dataclasses import dataclass
from datetime import date

@dataclass
class Persona:
    id: int
    nombre: str
    apellido: str
    fechaNacimiento: date

    