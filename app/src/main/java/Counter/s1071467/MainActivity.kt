package Counter.s1071467

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
         if(v.id == R.id.btn){
             counter++
         }else{
             counter=0
         }
         txv.text=counter.toString()

     }

}