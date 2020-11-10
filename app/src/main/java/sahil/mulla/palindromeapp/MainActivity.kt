package sahil.mulla.palindromeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myedit=findViewById<EditText>(R.id.editTextTextPersonName)
        val mytv =findViewById<TextView>(R.id.textView)
        val btn =findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val num = myedit.text.toString().trim()
            if (isPalindromeString(num)) {
                mytv.text =("$num is a Palindrome String")
            } else {
                mytv.text =("$num is not a Palindrome String")
            }
        })

    }
    fun isPalindromeString(inputStr: String): Boolean {
        val sb = StringBuilder(inputStr)

        val reverseStr = sb.reverse().toString()

        return inputStr.equals(reverseStr, ignoreCase = true)
    }
}