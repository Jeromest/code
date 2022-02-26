import turtle as t

#背景
game = t.Screen()
game.title("乒乓游戏")
game.bgcolor("black")
game.setup(800, 600)
game.tracer(0)

#球拍1
p1 = t.Turtle()
p1.ht()
p1.up()
p1.speed(0)
p1.color("yellow")
p1.shape("square")
p1.shapesize(5, 1)
p1.goto(-350, 0)
p1.st()

def p1_up():
    y = p1.ycor()
    y = y + player_speed
    p1.sety(y)

def p1_down():
    y = p1.ycor()
    y = y - player_speed
    p1.sety(y)


#球拍2
p2 = t.Turtle()
p2.ht()
p2.up()
p2.speed(0)
p2.color("yellow")
p2.shape("square")
p2.shapesize(5, 1)
p2.goto(350, 0)
p2.st()

def p2_up():
    y = p2.ycor()
    y = y + player_speed
    p2.sety(y)

def p2_down():
    y = p2.ycor()
    y = y - player_speed
    p2.sety(y)


game.listen()
game.onkey(p1_up, "w")
game.onkey(p1_down, "s")
game.onkey(p2_up, "Up")
game.onkey(p2_down, "Down")


#乒乓
pp = t.Turtle()
pp.up()
pp.speed(0)
pp.color("white")
pp.shape("circle")
pp.st()
pp.x = 2
pp.y = 2

player_speed = 10
gamer1 = 0
gamer2 = 0

while True:
    game.update()
    pp.setx(pp.xcor() + pp.x)
    pp.sety(pp.ycor() + pp.y)

    if(pp.ycor() > 290) or (pp.ycor() < -290):
        pp.y *= -1

    # if(pp.xcor() > 390) or (pp.xcor() < -390):
    #     pp.x *= -1

    #接球
    # y_up = p2.ycor()+50
    # y_down = p2.ycor()-50
    if(pp.ycor() < p2.ycor() + 50 and pp.ycor() < p2.ycor() - 50 and pp.xcor() > 340):
        pp.x *= -1
        pp.setx(339)

    if(pp.ycor() < p1.ycor() + 50 and pp.ycor() > p1.ycor() - 50 and pp.xcor() < -340):
        pp.x *= -1
        pp.setx(-339)

    #球出界
    if(pp.xcor() > 380):
        pp.goto(0, 0)
        gamer1 += 1
        print("gamer1得分")
    if (pp.xcor() < -380):
        pp.goto(0, 0)
        gamer2 += 1
        print("gamer2得分")




game.mainloop()