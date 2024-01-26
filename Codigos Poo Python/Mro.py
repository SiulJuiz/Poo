class A:
    def hablar(self):
        print("Habla A, hi")
class B(A):
    def hablar(self):
        print("Habla B, hello")
class C(A):
    def hablar(self):
        print("Habla C, hola")
class D(B,C):
    def hablar(self):
        print("Habla D, jai")
        
d=D()  
C.hablar(d)
 