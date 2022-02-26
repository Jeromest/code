#CalBIMv1.py
height, weight = eval(input("请输入身高（m）和体重（kg），用逗号隔开："))
BIM = weight / pow(height, 2)
print("BIM数值为：{:.2f}".format(BIM))
who = ""
if BIM < 18.5:
    who = "偏瘦"
elif 18.5 <=BIM < 25:
    who = "正常"
elif 25 <= BIM < 30:
    who = "偏胖"
else:
    who = "肥胖"
print("BIM指数为：国际'{0}'".format(who))