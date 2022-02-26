# 将字符串写入到7.2.txt
f = open("./7.2.txt", "w+")
strings = input("请输入字符串：")
list2 = ["{}\t{}".format(strings, len(strings))]
f.writelines(list2)
f.close()
