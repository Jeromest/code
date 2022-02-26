# 九九乘法表写入到7.1.txt
list1 = []
f = open("./7.1.txt", "w+")
for i in range(1, 10):
    for j in range(1, i + 1):
        list1 = ['{}x{}={}\t'.format(j, i, i * j)]
        f.writelines(list1)
    f.write('\n')
f.close()
