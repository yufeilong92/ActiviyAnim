# ActiviyAnim
 ================================================== ==================================================
  ### translate 平移动画 android:fromYDelta 从手机屏幕的多少开始移动
  ### android:toYDelta 移动到什么位置  android:duration 所需时间
  ### alpha 透明动画   fromAlpha 开始的透明度  toAlpha 结束的透明度
   ================================================== ==================================================
    浮点型值：
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
   ================================================== ==================================================
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
   ================================================== ==================================================
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