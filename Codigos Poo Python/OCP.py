class Notificador:
    def __init__(self,usuario,mensaje) :
        self.usuario=usuario
        self.mensaje=mensaje
        
    def notificar(self):
        raise NotImplementedError
    
class NotificadorEmail(Notificador):
    def Notificar(self):
        print(f"Enviado email a: {self.usuario.email}")

class NotificadorSMS(Notificador):
    def Notificar(self):
        print(f"Enviado SMS a: {self.usuario.sms}")
        
class NotificadorWhats(Notificador):
    def Notificar(self):
        print(f"Enviado SMS a: {self.usuario.whats}")
        
class NotificadorTwit(Notificador):
    def Notificar(self):
        print(f"Enviado SMS a: {self.usuario.twit}")
        
