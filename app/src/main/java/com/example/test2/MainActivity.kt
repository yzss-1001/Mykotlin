package com.example.test2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var button: Array<Button?> = arrayOfNulls(1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button[0] = findViewById(R.id.denglu)
        val numberListener = NumberListener()


//        val user_id = findViewById<EditText>(R.id.username)
//        Toast.makeText(this,user_id.toString(),Toast.LENGTH_SHORT).show()


        for (numb in button) {
            numb?.setOnClickListener(numberListener)

        }


    }
    inner class NumberListener : View.OnClickListener {
        override fun onClick(v: View?) {
            var user_id = findViewById(R.id.username) as EditText
            var getuser_id  =user_id.text.toString()
            var user_password = findViewById(R.id.password) as EditText
            var getuser_password  =user_password.text.toString()
            println(getuser_id)
            println(getuser_password)
            if(getuser_id=="v_101")
            {
                if(getuser_password=="123456"){
                    Toast.makeText(this@MainActivity, "登录成功！", Toast.LENGTH_LONG).show()


                }else{
                    Toast.makeText(this@MainActivity, "密码错误！", Toast.LENGTH_LONG).show()

                }
            }else{
                Toast.makeText(this@MainActivity, "用户不存在！", Toast.LENGTH_LONG).show()
            }




//            val  user_id = button[1]?.getTag(0).toString()
//            val  user_pasword = button[2]?.getTag(0).toString()
//            println(user_id)
//            println(user_pasword)






//            var user_id = button[1]?.text.toString()
//            var user_password  = button[1]?.text.toString()
//
//
//
//
//            if (user_id=="v_101" && user_password=="123456"){
//                Toast.makeText(this@MainActivity, "登录成功！", Toast.LENGTH_LONG).show()
//
//            }else{
//                Toast.makeText(this@MainActivity, "用户不存在！", Toast.LENGTH_LONG).show()
//
//            }



        }
    }



}