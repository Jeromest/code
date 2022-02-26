print("----------猜数字游戏----------")
temp = input("请输入一个数：")
guess = int(temp)
while guess != 6:
    temp = input("猜错了，重新输入：")
    guess = int(temp)
    if guess == 6:
        print("猜对了，真棒！")
    else:
        if guess > 6:
            print("大了！")
        else:
            print("小了！")
print("游戏结束！")
