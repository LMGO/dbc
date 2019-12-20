import numpy as np
from util import face_detector, load_breeds
from extract_bottleneck_features import *
from keras.applications.resnet50 import ResNet50
from keras.preprocessing import image
from keras.applications.resnet50 import preprocess_input
from tqdm import tqdm
from keras.layers import GlobalAveragePooling2D
from keras.layers import Dense
from keras.models import Sequential
import os
os.environ["TF_CPP_MIN_LOG_LEVEL"] = "2"

def path_to_tensor(img_path):
    # 用PIL加载RGB图像为PIL.Image.Image类型
    img = image.load_img(img_path, target_size=(224, 224))
    # 将PIL.Image.Image类型转化为格式为(224, 224, 3)的3维张量
    x = image.img_to_array(img)
    # 将3维张量转化为格式为(1, 224, 224, 3)的4维张量并返回
    return np.expand_dims(x, axis=0)


def paths_to_tensor(img_paths):
    list_of_tensors = [path_to_tensor(img_path) for img_path in tqdm(img_paths)]
    return np.vstack(list_of_tensors)


def paths_to_tensor(img_paths):
    list_of_tensors = [path_to_tensor(img_path) for img_path in tqdm(img_paths)]
    return np.vstack(list_of_tensors)


def ResNet50_predict_labels(img_path):
    # 返回img_path路径的图像的预测向量
    img = preprocess_input(path_to_tensor(img_path))
    return np.argmax(ResNet50_model.predict(img))


def dog_detector(img_path):
    prediction = ResNet50_predict_labels(img_path)
    return ((prediction <= 268) & (prediction >= 151))


ResNet50_model = ResNet50(weights='imagenet')
Resnet50_model = Sequential()
Resnet50_model.add(GlobalAveragePooling2D(input_shape=(1,1,2048)))
Resnet50_model.add(Dense(133, activation='softmax'))
# Resnet50_model.summary()
Resnet50_model.compile(loss='categorical_crossentropy', optimizer='rmsprop', metrics=['accuracy'])
# TODO: 加载具有最佳验证loss的模型权重
Resnet50_model.load_weights('model/weights.best.Resnet50.h5')


def Resnet50_predict_breed(img_path):
    # 提取bottleneck特征
    bottleneck_feature = extract_Resnet50(path_to_tensor(img_path))
    # 获取预测向量
    predicted_vector = Resnet50_model.predict(bottleneck_feature)
    dog_names = load_breeds()
    # 返回此模型预测的狗的品种
    return dog_names[np.argmax(predicted_vector)]


def Predict(img_path):
    # img = cv2.imread(img_path)
    # 将BGR图像转变为RGB图像以打印
    # cv_rgb = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
    # plt.imshow(cv_rgb)
    # plt.show()
    if face_detector(img_path) > 0:
        print("Hello, Human")
        print("You look like a ... in dog world")
        breed = Resnet50_predict_breed(img_path)
        print(breed)
        return breed
    elif dog_detector(img_path) == True:
        print("Hello, Dog")
        print("You are a ... ")
        breed = Resnet50_predict_breed(img_path)
        print(breed)
        return breed
    else:
        print("Error Input: Not a dog or people")
        return "Error Input: Not a dog or people"

#
# Predict('1.jpg')