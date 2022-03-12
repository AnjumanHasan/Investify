package thoseITgirls.investify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class loginAs : AppCompatActivity() {

    lateinit var businessButton: Button
    lateinit var investorButton: Button
    lateinit var loginText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_as)

        businessButton.setOnClickListener{
            val intent = Intent(this,businessSignup::class.java)
            startActivity(intent)
        }

    }
}