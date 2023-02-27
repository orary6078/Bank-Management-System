import turtle
from tkinter import Button
import time

tr = turtle.Turtle()
wn = turtle.Screen()
wn.addshape('C:\\Users\\anmol\\Downloads\\pig.gif')
tr.shape('C:\\Users\\anmol\\Downloads\\pig.gif')
tr.penup()

def do_something():
    while True:
        for i in range(10):
            tr.sety(tr.ycor() + i)
        for j in range(10):
            tr.sety(tr.ycor() - j)



canvas = wn.getcanvas()
button = Button(canvas.master, text='Moved', command=do_something)
button.pack()

turtle.mainloop()
