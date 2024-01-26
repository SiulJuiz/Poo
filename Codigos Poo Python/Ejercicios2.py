class Persona:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad
        
    def mostrar_persona(self):
        print(f"**** Datos de la Persona ****: \nNombre: {self.nombre}\nEdad: {self.edad}")
        
class Estudiante(Persona):
    def __init__(self, nombre, edad,grado):
        #Para usar super ya dentro de los parámetros no se usa self
        #Si no se usa super se debe de colocar self 
        super().__init__(nombre, edad)
        self.grado=grado
        
    def mostrar_grado(self):
     print(f"Grado: {self.grado}")
     
est=Estudiante("Luis",21,"4to ")
est.mostrar_persona()
est.mostrar_grado()