# jpeg转为png
# import cv2
# image = cv2.imread('dog.jpeg')
# cv2.imwrite('dog.png', image)
# cv2.imshow('dog', image)
# cv2.waitKey(0)

# 灰度图
# import cv2
# image = cv2.imread('dog.jpeg', flags=cv2.IMREAD_GRAYSCALE)
# cv2.imshow('dog', image)
# cv2.waitKey(0)

# 边缘检测
# import cv2
#
# img = cv2.imread('dog.png', flags=cv2.IMREAD_GRAYSCALE)
# GBlur = cv2.GaussianBlur(img, (3, 3), 0)
# canny = cv2.Canny(GBlur, 50, 150)
# cv2.imshow('img', img)
# cv2.imshow('canny', canny)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

# 高通滤波器
# import cv2
# import numpy as np
# from scipy import ndimage
#
# kernel_3x3 = np.array([
#     [-1, -1, -1],
#     [-1, 8, -1],
#     [-1, -1, -1],
# ])
#
# kernel_5x5 = np.array([
#     [-1, -1, -1, -1, -1],
#     [-1, -1, 2, -1, -1],
#     [-1, 2, 4, 2, -1],
#     [-1, -1, 2, -1, -1],
#     [-1, -1, -1, -1, -1],
# ])
#
# img = cv2.imread('dog.png', flags=cv2.IMREAD_GRAYSCALE)
# k3 = ndimage.convolve(img, kernel_3x3)
# k5 = ndimage.convolve(img, kernel_5x5)
#
# GBlur = cv2.GaussianBlur(img, (11, 11), 0)
# g_hpf = img - GBlur
#
# cv2.imshow('img', img)
# cv2.imshow('3x3', k3)
# cv2.imshow('5x5', k5)
# cv2.imshow('g_hpf', g_hpf)
# cv2.waitKey()
# cv2.destroyAllWindows()


# 边界框、最小矩形区域、最小闭圆的轮廓
# encoding:utf-8
import cv2
import numpy as np

# 读取图片
img = cv2.imread('dog.png', cv2.IMREAD_UNCHANGED)
# 降低分辨率，也可以不降低
# img = cv2.pyrDown(img)

# 对图像进行二值化操作
ret, thresh = cv2.threshold(cv2.cvtColor(img.copy(), cv2.COLOR_BGR2GRAY), 127, 255, cv2.THRESH_BINARY)

# 检测轮廓，
# 输入的三个参数分别为：输入图像、层次类型、轮廓逼近方法
# 因为这个函数会修改输入图像，所以上面的步骤使用copy函数将原图像做一份拷贝，再处理
# 返回的三个返回值分别为：修改后的图像、图轮廓、层次
image, contours, hier = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

for c in contours:
    # 边界框
    x, y, w, h = cv2.boundingRect(c)
    cv2.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)

    # 最小矩形区域
    rect = cv2.minAreaRect(c)
    box = cv2.boxPoints(rect)
    box = np.int0(box)
    cv2.drawContours(img, [box], 0, (0, 0, 255), 3)

    # 最小闭圆
    (x, y), radius = cv2.minEnclosingCircle(c)
    center = (int(x), int(y))
    radius = int(radius)
    img = cv2.circle(img, center, radius, (255, 0, 0), 2)
cv2.imshow('image', image)
cv2.drawContours(img, contours, -1, (255, 0, 0), 1)
cv2.imshow("contours", img)
cv2.waitKey(0)