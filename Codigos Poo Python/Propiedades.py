class Persona:
    def __init__(self,nombre,edad):
        self.__nombre=nombre
        self._edad=edad
        
        #Accediendo al atributo
    @property
    def nombre(self):
        return self.__nombre
    
    #Modificando al atributo
    @nombre.setter
    def nombre(self,newname):
        self.__nombre=newname
        
    #Elimina una función o atributo que le ponga
    @nombre.deleter
    def nombre(self):
        del self.__nombre
        
Luis=Persona("Luis",21)

#Usando el @property el get pasa hace como una propiedad 
nombre= Luis.nombre
print(nombre)

 
Luis.nombre="Andrés"
nombre=Luis.nombre
print(nombre)