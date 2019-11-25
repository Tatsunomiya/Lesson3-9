package tatsunomiya.com.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("鈴木" ,25,"プログラミング")
        val human2 = Human("田中",25, "プログラミング")
 //  どうやってHumanインスタンスを二個作って、 関数hobbyを実行しようか？
        //  Humanクラスのコンストラクタはname とageしか入れる事しかできませんでした。

//        2019-11-20 23:51:27.464 14631-14631/tatsunomiya.com.myapplication D/tasunomiya: 私の名前は鈴木です
//        2019-11-20 23:51:27.464 14631-14631/tatsunomiya.com.myapplication D/tatshunomiya: 私の歳は25です
//        2019-11-20 23:51:27.464 14631-14631/tatsunomiya.com.myapplication D/tatshunomiya: 私はkotlin.jvm.internal.StringCompanionObject@b877e05について考える)
//        2019-11-20 23:51:27.465 14631-14631/tatsunomiya.com.myapplication D/tatshunomiya: 私はkotlin.jvm.internal.StringCompanionObject@b877e05について考える)

        //Humanクラスにhobbyを引数に渡したコンストラクタが必要なのはわかるのですが、どう作ればいいのかもうわかないので質問します



        human.say()
        Log.d("tasunomiya", "私の名前は" + human.name + "です" +"年は" + human.age + "歳です" )
//        Log.d("tatshunomiya", "年は" + human.age + "歳です")

        human2.think()
        Log.d("tashunomiya" ,"私は" + human2.hobby+"について考える")



    }
}
