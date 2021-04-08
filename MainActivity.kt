package com.example.sanjay.DiceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener {
            Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
            Thread.sleep(1000)
            RollDice()

        }


    }



    private fun RollDice() {
         val dice = Dice(6)
        val diceroll=dice.Roll()
        val diceimage: ImageView = findViewById(R.id.imageView2)
        val txtview: TextView = findViewById(R.id.textView3)
        txtview.text = diceroll.toString()


        when(diceroll){
            1 -> diceimage.setImageResource(R.drawable.dice_1)
            2 -> diceimage.setImageResource(R.drawable.dice_2)
            3 -> diceimage.setImageResource(R.drawable.dice_3)
            4 -> diceimage.setImageResource(R.drawable.dice_4)
            5 -> diceimage.setImageResource(R.drawable.dice_5)
            6 -> diceimage.setImageResource(R.drawable.dice_6)

        }
    }
}
class Dice(val numsides:Int){
    fun Roll() :Int{
        return (1..numsides).random()
    }
}