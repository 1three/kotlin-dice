package com.three.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.three.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val leftDice = binding.leftDice
        val rightDice = binding.rightDice

        binding.diceStartBtn.setOnClickListener {
            val leftRandom = Random.nextInt(1, 6)
            val rightRandom = Random.nextInt(1, 6)

            if (leftRandom == rightRandom) {
                Toast.makeText(this, "더블!", Toast.LENGTH_LONG).show()
            }

            when (leftRandom) {
                1 -> leftDice.setImageResource(R.drawable.dice_1)
                2 -> leftDice.setImageResource(R.drawable.dice_2)
                3 -> leftDice.setImageResource(R.drawable.dice_3)
                4 -> leftDice.setImageResource(R.drawable.dice_4)
                5 -> leftDice.setImageResource(R.drawable.dice_5)
                6 -> leftDice.setImageResource(R.drawable.dice_6)
                else -> leftDice.setImageResource(R.drawable.dice_1)
            }
            when (rightRandom) {
                1 -> rightDice.setImageResource(R.drawable.dice_1)
                2 -> rightDice.setImageResource(R.drawable.dice_2)
                3 -> rightDice.setImageResource(R.drawable.dice_3)
                4 -> rightDice.setImageResource(R.drawable.dice_4)
                5 -> rightDice.setImageResource(R.drawable.dice_5)
                6 -> rightDice.setImageResource(R.drawable.dice_6)
                else -> rightDice.setImageResource(R.drawable.dice_1)
            }
        }
    }
}