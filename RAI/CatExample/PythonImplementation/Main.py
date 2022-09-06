from Cat import Cat

if __name__ == "__main__":

    oscar = Cat("Oscar", "Macho", 7, 5, "Naranja", "Rayado")
    #print("Existe un objeto: " + oscar.name)
    oscar.meow()

    print("El gato se llama: " + oscar.get_name() + " de color " + oscar.get_color() + "\n")

    print("Ingrese un nuevo color para el gato: \n")
    if oscar.set_color(input()):
        print("color cambiado...\n")
    else:
        print("color inválido...\n")

    print("El gato se llama: " + oscar.get_name() + " de color " + oscar.get_color()+"\n")