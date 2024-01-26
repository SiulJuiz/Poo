class Persona: 
    #Método constructor
    def __init__(self, nombre, edad, pais) :
        self.nombre=nombre
        self.edad=edad
        self.pais=pais
        #Método definido en python
    def hablar(self):
        print ("Estoy hablando un poquito")
        
class Estudiante(Persona):
    def __init__(self, nombre, edad, pais,notas,universidad):
        super().__init__(nombre, edad, pais)
        self.notas=notas
        self.universidad=universidad
    def presentarse(self):
        print(f"Datos del Estudiante: \nNombre: {self.nombre}\nEdad: {self.edad}\nPaís: {self.pais}\nNotas:{self.notas}\nUniversidad: {self.universidad} ") 
        
juan=Estudiante("Juan", 45,"Colombia",19, "Espe")
juan.presentarse()