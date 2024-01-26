class Persona:
    def __init__(self,nombre,edad):
        self._nombre=nombre
        self._edad=edad
        
    def get_nombre(self):
        return self._nombre
    
    def set_nombre(self,newname):
        self._nombre=newname
        
Luis=Persona("Luis",21)

nombre= Luis.get_nombre()
print(nombre)
#Aquí cambio el nombre de el nombre de la persona 
#Si no se usa nombre=Luis.get_nombre() no funcionaría 
Luis.set_nombre("Juanito")
nombre= Luis.get_nombre()
print(nombre)