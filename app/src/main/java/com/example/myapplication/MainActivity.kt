package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stringArray = resources.getStringArray(R.array.anim_type)
        val toMutableList = stringArray.toMutableList()
        val adapter = ListAdapter(this,toMutableList)
        lv_content.adapter = adapter
        lv_content.setOnItemClickListener { parent, view, position, id ->
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
                2 -> {//转动淡出效果1
                    overridePendingTransition(
                        R.anim.scale_rotate,
                        R.anim.my_alpha_action
                    );
                }
                3 -> {//转动淡出效果2
                    overridePendingTransition(
                        R.anim.scale_translate_rotate,
                        R.anim.my_alpha_action
                    );
                }
                4 -> {//左上角展开淡出效果
                    overridePendingTransition(
                        R.anim.scale_translate,
                        R.anim.my_alpha_action
                    );
                }
                5 -> {//压缩变小淡出效果
                    overridePendingTransition(
                        R.anim.hyperspace_in,
                        R.anim.hyperspace_out
                    );
                }
                6 -> {//右往左推出效果
                    overridePendingTransition(
                        R.anim.push_left_in,
                        R.anim.push_left_out
                    );
                }
                7 -> {//下往上推出效果
                    overridePendingTransition(
                        R.anim.push_up_in,
                        R.anim.push_up_out
                    );
                }
                8 -> {//上往下推出效果
                    overridePendingTransition(
                        R.anim.push_down_in,
                        R.anim.push_down_out
                    );
                }
                9 -> {//左右交错效果
                    overridePendingTransition(
                        R.anim.slide_left,
                        R.anim.slide_right
                    );
                }
                10 -> {//放大淡出效果
                    overridePendingTransition(
                        R.anim.wave_scale,
                        R.anim.my_alpha_action
                    );

                }
                11->{//缩小效果
                    overridePendingTransition(R.anim.zoom_enter,
                        R.anim.zoom_exit);
                }
                12->{//上下交错效果
                    overridePendingTransition(R.anim.slide_up_in,
                        R.anim.slide_down_out);
                }
            }
        }
    }
}
