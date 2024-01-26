# class Diccionario:
#     def verificar_palabra(self,palabra):
#         #Lògica de verificar palabras 
#         pass

# class CorrectorOrtogràfico:
#     def __init__(self):
#         self.diccionario=Diccionario()
        
#     def corregir_texto(self,texto):
#         # Diccionario para corregir las plabaras 
#         pass
    
from abc import ABC, abstractclassmethod

class VerificadorOrtografico(ABC):
    @abstractclassmethod
    def verificar_palabra(self,palabra):
        pass
    
class Diccionario(VerificadorOrtografico):
    def verificar_palabra(self, palabra):
        pass

class ServicioOnline(VerificadorOrtografico):
    def verificar_palabra(self,palabra):
        pass
    
class CorrectorOrtogràfico:
    def __init__(self,verificador) :
        self.verificador=verificador
        
    def corregir_texto(self,texto):
        #Usamos verificador
        
    