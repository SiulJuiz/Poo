class Persona:
    def __init__(self,nombre,edad) :
        self.nombre=nombre
        self.edad=edad
        
    def __str__(self):
        return f'Persona(nombre={self.nombre}, edad={self.edad})'

    def __repr__(self):
        return f'Persona ("{self.nombre}",{self.edad})'

    def __add__(self,otro):
        nuevo_valor=self.edad + otro.edad
        return Persona (self.nombre+otro.nombre,nuevo_valor)

ana  = Persona("Ana",28)
luis = Persona("Luis",21)
marcelo = Persona("Marcelo",41)

nueva_persona= ana + luis
print(nueva_persona.nombre)