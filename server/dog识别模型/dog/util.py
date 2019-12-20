import cv2


def load_breeds():
    dog_names = []
    with open('breeds.txt') as f:
        for item in f:
            dog_names.append(item.strip())
    return dog_names


# g = load_breeds()
# print(g)

# 如果img_path路径表示的图像检测到了脸，返回"True"
def face_detector(img_path):
    # 提取预训练的人脸检测模型
    face_cascade = cv2.CascadeClassifier('haarcascades/haarcascade_frontalface_alt.xml')
    img = cv2.imread(img_path)
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray)
    return len(faces) > 0
