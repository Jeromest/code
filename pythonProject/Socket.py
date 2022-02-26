from socket import *
phone = socket(AF_INET, SOCK_STREAM)
phone.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1)
phone.bind(('127.0.0.1', 8080))
phone.listen(5)
conn, client_addr = phone.accept()
