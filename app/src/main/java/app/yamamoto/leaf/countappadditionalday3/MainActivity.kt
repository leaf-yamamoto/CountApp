package app.yamamoto.leaf.countappadditionalday3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0
        val pienIntent: Intent = Intent(this, ERROR::class.java)
        val wowIntent: Intent = Intent(this, Success::class.java)

        numberTextView.text = "0"

        imageView5.setOnClickListener {
            number = number + 1
            numberTextView.text = number.toString()

            if (number == 10) {
                startActivity(pienIntent)
            }
            }



        imageView.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }

        imageView4.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()

        }

        imageView2.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }


        imageView3.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
        imageView6.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
        imageView7.setOnClickListener {
            startActivity(wowIntent)
        }
        imageView8.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
        imageView9.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
        imageView10.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
        imageView11.setOnClickListener {
            number = number - 1
            numberTextView.text = number.toString()
        }
    }
}

