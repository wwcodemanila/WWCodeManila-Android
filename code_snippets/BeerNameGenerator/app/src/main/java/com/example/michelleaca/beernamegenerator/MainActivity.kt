package com.example.michelleaca.beernamegenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generate_button.setOnClickListener {

            // greetings

            var birthMonth = birthMonth_editText.text.toString()
            Log.d("Input", "Birthday Month is $birthMonth")

            var greetings = when (birthMonth) {

                "January" -> ("Hey!")
                "February" -> ("Cheers!")
                "March" -> ("Hi!")
                "April" -> ("Howdy!")
                "May" -> ("Wazzup?")
                "June" -> ("Welcome!")
                "July" -> ("Hi-ya")
                "August" -> ("Bonjour!")
                "September" -> ("Hey!")
                "October" -> ("Hi!")
                "November" -> ("Howdy!")
                "December" -> ("Wazzup?")

                else -> ("Invalid entry")
            }


            // first name from birth month


            Log.d("Input", "Birthday Month is $birthMonth")

            var firstName = when (birthMonth) {

                "January" -> ("Bourbon")
                "February" -> ("Funky")
                "March" -> ("Happy")
                "April" -> ("Earthy")
                "May" -> ("Wicked")
                "June" -> ("Crushing")
                "July" -> ("American")
                "August" -> ("Robust")
                "September" -> ("Superior")
                "October" -> ("Killer")
                "November" -> ("Golden")
                "December" -> ("Hearty")

                else -> ("Invalid entry")
            }

            Log.d("Input", "first name is $firstName")

// middle name from first initial

            var firstInitial = letter_editText.text.toString()
            Log.d("Input", "First Initial is $firstInitial")

            var middleName = when (firstInitial) {

                "A" -> ("Spirit")
                "B" -> ("Oblivion")
                "C" -> ("Ninja")
                "D" -> ("Unicorn")
                "E" -> ("Home")
                "F" -> ("Bastard")
                "G" -> ("Shine")
                "H" -> ("Beard")
                "I" -> ("Screamer")
                "J" -> ("Frothy")
                "K" -> ("Lips")
                "L" -> ("Mama")
                "M" -> ("Space")
                "N" -> ("Zombie")
                "O" -> ("Trouble")
                "P" -> ("Tornado")
                "Q" -> ("Empire")
                "R" -> ("Alien")
                "S" -> ("Pants")
                "T" -> ("Love")
                "U" -> ("Goblin")
                "V" -> ("Paradox")
                "W" -> ("Mash")
                "X" -> ("Grizzly")
                "Y" -> ("Lemonade")
                "Z" -> ("Cloud")


                else -> ("Invalid entry")
            }

            Log.d("Input", "middle name is $middleName")

// last name from last digit

            var lastDigit: String = number_editText.text.toString()
            Log.d("Input", "First Initial is $lastDigit")

            var lastName = when (lastDigit) {

                "0" -> ("Stout")
                "1" -> ("Pilsner")
                "2" -> ("Tripel")
                "3" -> ("Ale")
                "4" -> ("Wheat")
                "5" -> ("Porter")
                "6" -> ("Doppleback")
                "7" -> ("Lager")
                "8" -> ("IPA")
                "9" -> ("Saison")

                else -> ("Invalid entry")
            }

            Log.d("Input", "last name is $lastName")

            greetings_textView.text = ("$greetings")

            var beerName = ("$firstName $middleName $lastName")
            beerName_textView.text = beerName


        }
    }

}
