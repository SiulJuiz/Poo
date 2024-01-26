class Persona: 
    #Método constructor
    def __init__(self, nombre, edad, pais) :
        self.nombre=nombre
        self.edad=edad
        self.pais=pais
        #Método definido en python
    def hablar(self):
        print ("Estoy hablando un poquito")
        
# Otra clase que hereda
class Artista:
    def __init__(self, habilidad) :
       self.habilidad=habilidad
    
    
    def mostrar_habilidad(self):
        return f"Mi habilidad es: {self.habilidad}"
       
      #Sobreescribir un método 
    #def hablar(self):
       # print("No se puede hablar ahora")
        
        
        
class EmpleadoArtista(Persona,Artista):
    def __init__(self, nombre, edad, pais,habilidad,salario,empresa):
        Persona.__init__(self,nombre, edad, pais)
        Artista.__init__(self,habilidad)
        self.salario=salario
        self.empresa=empresa
        
    def presentarse(self):
        #Si uso el método usando self accece al método de esa clase y puede reescribirse
        #print (f"self.mostrar_habilidad()")
          
        #Si uso el super se accede a ese método en la clase padre
        print(f'Hola soy: {self.nombre}, {self.mostrar_habilidad()} y trabajo en: {self.empresa}')
        
      
#Rellenando datos de la clase Persona
roberto=EmpleadoArtista("Luis",21,"Ecuador","Programador",1520,"Programer")
roberto.presentarse()
 