package tatsunomiya.com.myapplication

import android.util.Log

open class Human: Animal,Thinkable {


         var hobby = String

    constructor(name: String, age: Int): super(name,age) {



    }

//    override fun say() {
////        Log.d("tatsunomiya","私の名前は" + this.name + "歳は" +this.age +"です" )
////    }
////
////
////    override fun think() {
////        Log.d("tatshunomiya"+ "私は"+"("+ this.hobby + "歳)"  ,  "について考える" )
////    }

    override fun say() {
        Log.d("tatsunomiya","私の名前は"+this.name +"です　歳は"+ this.age + "です")
    }


     override fun think() {

        Log.d("tatshunomiya","私は"+this.hobby +   "について考える)" )
    }

}

