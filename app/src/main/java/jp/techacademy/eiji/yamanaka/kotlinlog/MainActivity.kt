package jp.techacademy.eiji.yamanaka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log     // 追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("たかし", 3,"夢")

        human.say()
        human.think()

        val human2 = Human("はなこ", 10,"希望")

        human2.say()
        human2.think()
    }
}
