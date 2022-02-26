import tkinter as tk

window = tk.Tk()

window.title("Hello")
window.geometry('600x400')

var = tk.StringVar()
lab = tk.Label(window, textvariable=var, bg="white", fg="red", font=("Arial", 20), width=30, height=10)
lab.pack()
# lab.place()

on_hit = False


def hit_me():
    global on_hit
    if not on_hit:
        on_hit = True
        var.set("\u70B9\u4F60\u5988\u5462\uFF1F")
    else:
        on_hit = False
        var.set("\u522B\u778E\u51E0\u628A\u70B9\u61C2\u5417\uFF1F")


btn = tk.Button(window, text="\u70B9\u6211\uFF0C\u5FEB\u70B9", font=('Arial', 15), width=10, height=1, command=hit_me)
btn.pack()

window.mainloop()
