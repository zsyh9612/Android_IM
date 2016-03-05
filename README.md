# Android IM

## 做一个即时通讯的app  

### 需要的素材:  
网络请求、ListView等等的，基本都是大家上学期学过的东西  

### 要求:  
界面的样式可以自己决定，但是即时通讯主就是一个朋友列表，然后每个点进去可以聊天，另外既然有了朋友， 那么就肯定有一些登陆注册的方法了。

### 关于后端:  
现在比较难解决的的就是后端的问题了，这里可以有很多种的解决办法：

#### 1.使用OpenFire和Spark:  
这种情况就有点类似于给Spark(OpenFire的一个即时通讯）写一个Android的感觉，但是你也可以只以来和 服务器联通的方法，其余的全都自己写，我之
前就是这么搞的。

![p1](art/justwe.png)

我写的示例：就是里面的那个demo（其实没什么参考性）
教程：[WebIm教程](http://www.cnblogs.com/lfk-dsk/)

#### 2.使用Bmob云后端：

就是这个东西，跑在他们服务器上的后端，数据交流通过传递对象的方式进行插入表，或者删除条目。 

之前群里的那个扫二维码同步笔记的东西就用了
这个。
Bmob提供了Im的一个Demo：[Bomb-IM](https://github.com/bmob/bmob-android-im-sdk)

#### 3.使用蓝牙：

并不是一个推荐的方法，因为直连不适合即时通讯，不过可以试试。

#### 4.用电脑作为服务器：

今天写完的一个http服务器：JustWe-WebServer
其余：
比如说聊天记录怎么保存啊－－－－会用到数据库 ListView做的聊天界面，怎么才能像QQ一样两侧布局啊－－－－加载两套布局 等等等等啦！

最后：
祝大家新年快乐啦！
有问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流
邮件:lfk_dsk@hotmail.com
博客: [刘丰恺](http://www.cnblogs.com/lfk-dsk/)

## License

    Copyright 2015 [刘丰恺](http://www.cnblogs.com/lfk-dsk/)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
