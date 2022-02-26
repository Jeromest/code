import os
import sys
import numpy
import cv2

gray_num = list("&@#$%&*~!?qwertyuioplkjhgfdsazcxvbnm123456789.")

def main(videoPath: str):
    #读取视频
    #获取视频帧 -> 一张图片
    #循环处理视频帧 -> 字符画
    #输出

    #
    #运行时进到源文件目录下
    #运行python video_to_ascii.py 视频文件
    #
    cap = cv2.VideoCapture(videoPath)   #读取视频

    while True:
        success, frame = cap.read()     #读取视频帧
        if not success:
            break
        #转换灰度图
        grayFrame = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        #调整尺寸
        tsize = os.get_terminal_size()
        fixFrame = cv2.resize(grayFrame, (tsize.columns, tsize.lines))
        img_array = numpy.array(fixFrame, "f")
        asciiFrame = ""
        for line in img_array:
            for p in line:
                #灰度像素在字符列表中的位置
                index = int((p/255)*(len(gray_num)-1))
                asciiFrame += gray_num[index]
            # asciiFrame += "\n"      #字符画帧换行
        print(asciiFrame)
    cap.release()


if __name__ == "__main__":
    if len(sys.argv) > 1 and os.path.exists(sys.argv[1]):
        main(sys.argv[1])
    else:
        print("File not found")