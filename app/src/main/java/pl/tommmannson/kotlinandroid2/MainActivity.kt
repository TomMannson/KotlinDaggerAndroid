package pl.tommmannson.kotlinandroid2

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pl.tommmannson.kotlinandroid2.databinding.ActivityMainBinding
//import kotlin.coroutines.experimental;

class MainActivity : AppCompatActivity() {

    var data : Data? = null

    var component : AppComponent? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        this.component = DaggerAppComponent.builder().appModule(AppModule())
                .build()

        this.data = component?.data();

        binding.text?.text = "${this.data?.name}"

//        async {
////            doSomething(foo)
////            ...
//        }

    }
}
