package tatsunomiya.com.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human = Human("鈴木" ,25)
 //  どうやってHumanインスタンスを二個作って、 関数hobbyを実行しようか？
        //  Humanクラスのコンストラクタはname とageしか入れる事しかできませんでした。
        


        human.say()
        Log.d("tasunomiya", "私の名前は" + human.name + "です"  )
        Log.d("tatshunomiya", "私の歳は" + human.age + "です")

        human.think()
        Log.d("tashunomiya" ,"私は" + human.hobby()+"について考える")



    }
}
