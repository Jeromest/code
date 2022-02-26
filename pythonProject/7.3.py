# 将文本写入到指定单元格中
import xlwt

workbook = xlwt.Workbook(encoding='gbk')
sheet1 = workbook.add_sheet('sheet1', cell_overwrite_ok=True)
sheet1.write(4, 2, "人生苦短，我用Python！")    # 注意行和列的值从0开始
workbook.save("7.3.xls")

