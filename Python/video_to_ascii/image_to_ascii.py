import os
import numpy
import sys
from PIL import Image

def main(filepath: str):
    #读取图片
    img = Image.open(filepath)
    #调整图片尺寸
    tsize = os.get_terminal_size()
    img = img.resize((tsize.columns, tsize.lines), Image.ANTIALIAS)
    #
    img_gray = img.convert("L")
    #灰度图转换成字符矩阵
    img_array = numpy.array(img_gray, "f")

    chars = list("!$@%^&*(+}:;'\<?qwet.fhksd fbsdksihgbcna42385787067964lkgns ")

    for line in img_array:
        char_line = list()
        for num in line:
            index = (num/255)*(len(chars)-1)
            char_line.append(chars[int(index)])
        print("".join(char_line))


if __name__ == "__main__":
    filepath = sys.argv[1]
    if os.path.exists(filepath):
        main(filepath)
    else:
        print("File not found")