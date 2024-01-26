def decorador(funcion):
    def funcion_modificada():
        print("Antes de nada")
        funcion()
    return funcion_modificada
    
# def saludo():
#     print ("Hola Luis")  
        
# saludo_mod=decorador(saludo)
# saludo_mod()
@decorador
def saludo():
    print("Hola Luis")
    
saludo()