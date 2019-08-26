# -*- coding: utf-8 -*-
"""
Editor de Spyder

Este es un archivo temporal.
"""

import numpy as np

def main():
    a = (np.random.rand(1,4)*10+1)
    b = (np.random.rand(1,4)*10+1)
    """print(a)
    print("tamaño: ", a.size)"""
    
    """c= (np.random.rand(2,4))
    print(c)
    print("tamaño: ", c.size)
    print("dimensión: ", c.shape)
    print("rows: ", c.shape[0])
    print("colums: ", c.shape[1])
    print(c[1,1])"""
    
    print(a)
    print(b)
    s = 0
    
    print("shape: ", a.shape)
    
    for i in range(0, a.shape[1]):
        s = s + a[:,i]*b[:,i]
    print(s)
    
    print(np.dot(a,b.T))
    
def func():
    a = (np.random.randint(1,20,(3,5)))
    print(a, "\n")
    #print(a[0,1])
    #print(a[2])
    #print(a[1,:])
    #print(a[:,:])
    #print(a[:,2])
    print (a[:,:-1])
    
if __name__=="__main__":
   func() 