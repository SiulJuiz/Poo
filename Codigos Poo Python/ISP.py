from abc import ABC, abstractclassmethod

class Trabajador(ABC):
    @abstractclassmethod
    def trabajar(self):
        pass
    
class Comedor(ABC):    
    @abstractclassmethod
    def comer(self):
        pass
    
class Durmido(ABC):
    @abstractclassmethod
    def dormir(self):
        pass

class Humano (Trabajador,Durmido,Comedor):
    def comer(self):
        print("Humano Come")

    def trabajar(self):
        print("Humano trabaja")
    
    
    def dormir(self):
        print("Humano duerme")
        
class Robot(Trabajador):
 
    def trabajar(self):
        print("Robot trabaja")
    
    
        
robot=Robot()
humano=Humano()
robot.trabajar()
humano.comer()
