from socket import *
import time
phone = socket(AF_INET, SOCK_STREAM)
phone.connect(('127.0.0.1', 8080))
