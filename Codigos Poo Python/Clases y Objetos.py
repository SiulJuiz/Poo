class Celular:
    def __init__(self,marca,modelo,camara) :
        self.marca=marca
        self.modelo=modelo
        self.camara=camara
        
    def llamar(self):
        print("Iniciaste una llamada desde tu "+self.marca)
        
    def colgar(self):
        print("Terminanste la llamada desde tu "+self.marca)
        
celular1=Celular("Samsung","S23","48MP")
celular2=Celular("Apple","Iphone 15 Pro","60MP")

celular2.llamar()
print(celular1.camara)