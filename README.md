# ActiviyAnim

###alpha渐变透明度动画效果
###scale渐变尺寸伸缩动画效果
###translate画面转换位置移动动画效果
###rotate画面转移旋转动画效果
```
Animation类所具有的属性及意义。关于Animation类的官方文档位置为：《Animation》
android:duration        动画持续时间，以毫秒为单位
android:fillAfter          如果设置为true，控件动画结束时，将保持动画最后时的状态
android:fillBefore       如果设置为true,控件动画结束时，还原到开始动画前的状态
android:fillEnabled    与android:fillBefore 效果相同，都是在动画结束时，将控件还原到初始化状态
android:repeatCount 重复次数
android:repeatMode	重复类型，有reverse和restart两个值，reverse表示倒序回放，restart表示重新放一遍，必须与repeatCount一起使用才能看到效果。因为这里的意义是重复的类型，即回放时的动作。
android:interpolator  设定插值器，其实就是指定的动作效果，比如弹跳效果等，不在这小节中讲解，后面会单独列出一单讲解。
```
 ==================================================
  ```
  scale标签是缩放动画，可以实现动态调控件尺寸的效果，有下面几个属性：

  android:fromXScale    起始的X方向上相对自身的缩放比例，浮点值，比如1.0代表自身无变化，0.5代表起始时缩小一倍，2.0代表放大一倍；
  android:toXScale        结尾的X方向上相对自身的缩放比例，浮点值；
  android:fromYScale    起始的Y方向上相对自身的缩放比例，浮点值，
  android:toYScale        结尾的Y方向上相对自身的缩放比例，浮点值；
  android:pivotX            缩放起点X轴坐标，可以是数值、百分数、百分数p 三种样式，比如 50、50%、50%p，当为数值时，表示在当前View的左上角，即原点处加上50px，做为起始缩放点；如果是50%，表示在当前控件的左上角加上自己宽度的50%做为起始点；如果是50%p，那么就是表示在当前的左上角加上父控件宽度的50%做为起始点x轴坐标。（具体意义，后面会举例演示）
  android:pivotY           缩放起点Y轴坐标，取值及意义跟android:pivotX一样。

  alpha标签——调节透明度
  android:fromAlpha   动画开始的透明度，从0.0 --1.0 ，0.0表示全透明，1.0表示完全不透明
  android:toAlpha       动画结束时的透明度，也是从0.0 --1.0 ，0.0表示全透明，1.0表示完全不透明

 rotate标签——旋转
 1、自身属性
 android:fromDegrees     开始旋转的角度位置，正值代表顺时针方向度数，负值代码逆时针方向度数
 android:toDegrees         结束时旋转到的角度位置，正值代表顺时针方向度数，负值代码逆时针方向度数
 android:pivotX               缩放起点X轴坐标，可以是数值、百分数、百分数p 三种样式，比如 50、50%、50%p，具体意义已在scale标签中讲述，这里就不再重讲
 android:pivotY               缩放起点Y轴坐标，可以是数值、百分数、百分数p 三种样式，比如 50、50%、50%p

 translate标签 —— 平移
 1、自身属性
 android:fromXDelta     起始点X轴坐标，可以是数值、百分数、百分数p 三种样式，比如 50、50%、50%p，具体意义已在scale标签中讲述，这里就不再重讲
 android:fromYDelta    起始点Y轴从标，可以是数值、百分数、百分数p 三种样式；
 android:toXDelta         结束点X轴坐标
 android:toYDelta        结束点Y轴坐标
  ```
  ==================================================
  ### translate 平移动画 android:fromYDelta 从手机屏幕的多少开始移动
  ### android:toYDelta 移动到什么位置  android:duration 所需时间
  ### alpha 透明动画   fromAlpha 开始的透明度  toAlpha 结束的透明度
   ==================================================
  ```  浮点型值：
          fromAlpha 属性为动画起始时透明度
          toAlpha   属性为动画结束时透明度
          说明:
          0.0表示完全透明
          1.0表示完全不透明
                       以上值取0.0-1.0之间的float数据类型的数字

          长整型值：
          duration  属性为动画持续时间
          说明:
                       时间以毫秒为单位
  ```
   ==================================================
  ###* matrix(n,n,n,n,n,n)	定义 2D 转换，使用六个值的矩阵。	测试
  ### matrix3d(n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n)	定义 3D 转换，使用 16 个值的 4x4 矩阵。
  ### translate(x,y)	定义 2D 转换。	测试
 ### translate3d(x,y,z)	定义 3D 转换。
  ### translateX(x)	定义转换，只是用 X 轴的值。	测试
  ### translateY(y)	定义转换，只是用 Y 轴的值。	测试
 ###  translateZ(z)	定义 3D 转换，只是用 Z 轴的值。
 ###  scale(x,y)	定义 2D 缩放转换。	测试
  ### scale3d(x,y,z)	定义 3D 缩放转换。
  ### scaleX(x)	通过设置 X 轴的值来定义缩放转换。	测试
 ###  scaleY(y)	通过设置 Y 轴的值来定义缩放转换。	测试
  ### scaleZ(z)	通过设置 Z 轴的值来定义 3D 缩放转换。
  ### rotate(angle)	定义 2D 旋转，在参数中规定角度。	测试
 ###  rotate3d(x,y,z,angle)	定义 3D 旋转。
  ### rotateX(angle)	定义沿着 X 轴的 3D 旋转。	测试
  ### rotateY(angle)	定义沿着 Y 轴的 3D 旋转。	测试
  ### rotateZ(angle)	定义沿着 Z 轴的 3D 旋转。	测试
  ### skew(x-angle,y-angle)	定义沿着 X 和 Y 轴的 2D 倾斜转换。	测试
  ### skewX(angle)	定义沿着 X 轴的 2D 倾斜转换。	测试
 ###  skewY(angle)	定义沿着 Y 轴的 2D 倾斜转换。	测试
 ###  perspective(n)
   ==================================================
```
  val intent = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
            when (position) {
                0 -> {//淡入淡出效果
                    overridePendingTransition(R.anim.fade, R.anim.hold);
                }
                1 -> {//放大淡出效果
                    overridePendingTransition(
                        R.anim.my_scale_action,
                        R.anim.my_alpha_action
                    );
                }


<set xmlns:android="http://schemas.android.com/apk/res/android">
	<translate android:fromYDelta="100%p" android:toYDelta="0" android:duration="2000"/>
	<alpha android:fromAlpha="0.0" android:toAlpha="1.0" android:duration="2000" />
</set>



```
·具体动画请查看 <https://blog.csdn.net/weixin_37160260/article/details/79916058>