import requests


# API地址
url = "http://10.100.32.114:5000/photo"
# 图片地址
file_path = '3.jpg'
# 图片名
file_name = file_path.split('/')[-1]
# 二进制打开图片
file = open(file_path, 'rb')
# 拼接参数
files = {'file': (file_name, file, 'image/jpg')}

# 发送post请求到服务器端
r = requests.post(url, files=files)
print(r.text)
# 获取服务器返回的图片，字节流返回
result = r.content
# 字节转换成图片
print(result)
file.close()