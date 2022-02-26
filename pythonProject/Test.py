# import numpy
# print("Hello World!")
# print(dir(numpy.who()))
# with open('F:\\Test.txt', 'w') as f:
#     for i in range(1,1000):
#         print('Hello World!', file=f, end=" ")

# 1.
# temp = float(input("输入一个华氏温度："))
# # res = ((temp-32)*5)/9
# # print("摄氏温度为：", res)

# 2.
# length = float(input("输入长："))
# width = float(input("输入宽："))
# area = length * width
# print("矩形面积为：", area)

# 3.
# stu1 = float(input("输入第一个学生成绩："))
# stu2 = float(input("输入第二个学生成绩："))
# stu3 = float(input("输入第三个学生成绩："))
# res = (stu1 + stu2 + stu3) / 3
# print("三个学生的平均分为：", res)

# 4.1
# chinese = float(input("输入语文成绩："))
# math = float(input("输入数学成绩："))
# english = float(input("输入英语成绩："))
# if chinese >= 60 and math>=60 and english>=60:
#     print("恭喜，三门课都及格了！")

# 4.2
# chinese = float(input("输入语文成绩："))
# math = float(input("输入数学成绩："))
# english = float(input("输入英语成绩："))
# if chinese >=60 or math >= 60 or english >= 60:
#     print("很遗憾，只有一门课及格！")


# # #4.3
# chinese = float(input("输入语文成绩："))
# math = float(input("输入数学成绩："))
# english = float(input("输入英语成绩："))
# if chinese >= 60 and (math>=90 or english>=90):
#     print("语文及格了，数学或英语很优秀，请继续努力！")

# -*- coding: cp936 -*-
# score=int(input('请输入成绩（0～100）：'))
# if score > 100:
#     grade = "输入错误！"
# elif score >= 90:
#     grade = 'A'
# elif score >= 80:
#     grade = 'B'
# elif score >= 70:
#     grade = 'C'
# elif score >= 60:
#     grade = 'D'
# elif score >= 0:
#     grade = 'E'
# else:
#     grade = "输入错误！"
# print(grade)


# -*- coding: cp936 -*-


# num=6
# while True:
#     guess=int(input('请输入你猜的数（0～9）：'))
#     if guess == num:
#         print("恭喜！你猜中了！")
#         break;
#     elif guess > num:
#         print("太大")
#     else:
#         print("太小")


# n = 1
# s = 0
# print("n\ts")
# while s < 1000:
#     s += n * n
#     print(n, "\t", s)
#     n += 1
#
# print("累计和不超过的最大项数n=", n - 2)


# n = 2
# s = 0
# while n <= 1000:
#     flag = True
#     for i in range(2, n // 2 + 1):
#         if n % i == 0:
#             flag = False
#             break
#     if flag:
#         print(n)
#         s = s + n
#     n = n + 1
#
# print('和为：', s)

# # 4.1
# list1 = []
# sum1, sum2 = 0, 0
# a = int(input("请输入一个正整数（-1结束）："))
#
# while a != -1:
#     list1.append(a)
#     if a % 2 != 0:
#         sum1 += a
#     else:
#         sum2 += a
#     a = int(input("请输入一个正整数（-1结束）："))
#
# print("列表为：", list1)
# print("奇数和：", sum1, "，偶数和：", sum2, sep="")


# # 4.3
# print("请输入10个奇数：")
# count=0
# list1=[]
#
# while count<10:
#     a=int(input("请输入数字："))
#     if a%2!=0:
#         list1.append(a)
#         count+=1
#     else:
#         print("输入的不是奇数！")
# print("列表为：" , list1)
# print("和：",sum(list1))
# print("平均值：",sum(list1)/len(list1))


# # 4.5
# list1 = [2.3, 4.5, 24, 17, 1, 7.8, 39, 21, 0.5, 1.2, 4, 1, 0.3]
# s1 = 0
# s2 = 0
# s3 = 0
# s4 = 0
# dict1 = {}
# for i in list1:
#     if i >= 10:
#         s1 += 1
#     elif i >= 5:
#         s2 += 1
#     elif i >= 3:
#         s3 += 1
#     else:
#         s4 += 1
# dict1['platinum'] = s1
# dict1['gold'] = s2
# dict1['silver'] = s3
# dict1['ordinary'] = s4
# print(dict1)


# # 4.7
# list1 = [int(input("请输入第" + str(i + 1) + "个数字：")) for i in range(5)]
# for i, x in enumerate(list1):
#     print('下标：', i, '   值：', x)
# avg = sum(list1) / len(list1)
# list2 = [i for i in list1 if i > avg]
# print("平均值：", avg)
# print(list2)

# 4.9
# list1 = [1, 9, 8, 7, 6, 5, 13, 3, 2, 1]
# print("原列表：", list1)
# list1 = [i for i in list1 if i % 2 == 0]
# print("删除其中所有奇数：", list1)

import requests
from lxml import etree







