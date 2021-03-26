@file:Suppress("PackageName")

package counter.s1071467

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    var counter:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

        fun add(v:View) {
         if(v==btn){
             counter++
         }else if(v==btn2){
             counter+=2
         }
         txv.text=counter.toString()

     }

}