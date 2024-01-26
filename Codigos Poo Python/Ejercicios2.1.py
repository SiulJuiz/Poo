class Animal:
    def comer(self):
        print("Está comiendo ")
        
class Mamifero(Animal):
    def amamantar(self):
        print("El animal está siendo amamantado")
        
class Ave(Animal):
    def volar(self):
        print("El animal está volando")
        
class Murcielago(Mamifero,Ave):
    pass

mur=Murcielago()
mur.comer()
mur.amamantar()
mur.volar()
print(Murcielago.mro())