class Estudiante:
    def __init__(self,nombre,edad,grado):
       self.nombre=nombre
       self.edad=edad
       self.grado=grado
       
    def estudiar(self):
        print ( est.nombre+" está estudiando")
       
nombre=input("Ingrese el nombre: ")
edad=input("Ingrese la edad: ")
grado=input("Ingrese el grado: ")

est=Estudiante(nombre,edad,grado)

print(f"""Datos del estudiante: 
      Nombre: {est.nombre}
      Edad: {est.edad}  
      Grado: {est.grado}""")

while True: 
 estudiar=input()
 if(estudiar.lower()=="estudiar"):
    est.estudiar()
