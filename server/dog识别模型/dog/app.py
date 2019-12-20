import datetime
import json
import os
os.environ["TF_CPP_MIN_LOG_LEVEL"] = "2"
import re

from flask import Flask, request, render_template
from werkzeug import run_simple
import tensorflow as tf
from flask_cors import *
graph = tf.get_default_graph()
from server import Predict

app = Flask(__name__)
CORS(app, supports_credentials=True)

# app.debug = True

@app.route('/', methods=['GET', 'POST'])
def hello_world():
    return 'Please visit http://10.100.32.114:5000/photo to identify dog breeds (This is Cyan Xin)'


@app.route('/photo', methods=['GET', 'POST'])
def identify_breed():
    if request.method == 'POST':
        if not request.files:  # 检测是否有数据
            return 'fail'

        # print('请求方式为------->', request.method)
        # args = request.args.get("name") or "args没有参数"
        # print('args参数是------->', args)
        # form = request.form.get('name') or 'form 没有参数'
        # print('form参数是------->', form)

        img = request.files['file']
        img_name = img.filename
        # print(img_name)
        # img_name = r
        # th.join('D:\\PyCharmWorks\\dog\\local\\images', img_name)
        # 年-月-日 时:分:秒
        nowTime = datetime.datetime.now().strftime('%Y-%m-%d_%H_%M_%S')
        # 年-月-日
        dayTime = datetime.datetime.now().strftime('%Y_%m_%d')
        # 时:分:秒
        hourTime = datetime.datetime.now().strftime('%H_%M_%S')
        # print(nowTime + '\n' + dayTime + '\n' + hourTime)
        img_name = dayTime + '_' + hourTime + '.jpg'
        # print(img_name)
        img_path = os.path.normpath("%s\%s" % (r".\local\images", img_name))
        img.save(img_path)
        # print(img_path)
        # url图片路径
        # url = img_path
        # print(url)

        global graph
        with graph.as_default():
            breed = Predict(img_path)

        return json.dumps(breed)
    return render_template('photo.html')


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=False)
