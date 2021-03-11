package com.example.im_gul_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        c_One.setOnClickListener{ poser("1",true) }
        c_Two.setOnClickListener{ poser("2",true) }
        c_Three.setOnClickListener{ poser("3",true) }
        c_Four.setOnClickListener{ poser("4",true) }
        c_Five.setOnClickListener{ poser("5",true) }
        c_Six.setOnClickListener{ poser("6",true) }
        c_Seven.setOnClickListener{ poser("7",true) }
        c_Eight.setOnClickListener{ poser("8",true) }
        c_Nine.setOnClickListener{ poser("9",true) }
        c_Zero.setOnClickListener{ poser("0",true) }

        c_Plus.setOnClickListener{ poser("+",false) }
        c_Minus.setOnClickListener{ poser("-",false) }
        c_Dio.setOnClickListener{ poser("/",false) }
        c_Ymnozh.setOnClickListener{ poser("*",false) }
        c_Lskob.setOnClickListener{ poser("(",false) }
        c_Pskob.setOnClickListener{ poser(")",false) }


        c_back.setOnClickListener{

            с_Expression.text = ""
            с_Result.text = ""

        }


        c_Rovno.setOnClickListener{
            try {
                val Star_Platinum = ExpressionBuilder(с_Expression.text.toString()).build()
                val Crazy_Diamond = Star_Platinum.evaluate()
                val Echos = Crazy_Diamond.toLong()
                if (Crazy_Diamond == Echos.toDouble())
                    с_Result.text = Echos.toString()
                else
                    с_Result.text = Crazy_Diamond.toString()





            }
            catch(e: Exception)
            {
                Log.d("Ащипка!", "Код228: Взлом Жёппы!"+e.message)
            }
        }




    }



    fun poser(string: String, clear: Boolean) {

//        if (c_Result.text.isNotEmpty())
//        {
//
//
//
//        }


            if (clear) {
                с_Result.text = ""
                с_Expression.append(string)
            }


            else{ с_Expression.append(с_Result.text)
                с_Expression.append(string)
                с_Result.text = ""
            }
        }


    }
