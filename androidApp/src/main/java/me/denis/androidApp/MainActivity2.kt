package me.denis.androidApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val zero: Button = findViewById(R.id.zero_btn)
        val one: Button = findViewById(R.id.one_btn)
        val two: Button = findViewById(R.id.two_btn)
        val three: Button = findViewById(R.id.three_btn)
        val four: Button = findViewById(R.id.four_btn)
        val five: Button = findViewById(R.id.five_btn)
        val six: Button = findViewById(R.id.six_btn)
        val seven: Button = findViewById(R.id.seven_btn)
        val eight: Button = findViewById(R.id.eight_btn)
        val nine: Button = findViewById(R.id.nine_btn)
        val division: Button = findViewById(R.id.division_btn)
        val multiplication: Button = findViewById(R.id.multiplication_btn)
        val plus: Button = findViewById(R.id.plus_btn)
        val minus: Button = findViewById(R.id.minus_btn)
        val ac: Button = findViewById(R.id.AC_btn)
        val math_operation: TextView = findViewById(R.id.math_operation)
        val result_text: TextView = findViewById(R.id.result_text)
        val back_btn: Button = findViewById(R.id.back_btn)
        val equally: Button = findViewById(R.id.equally_btn)
        val percent: Button = findViewById(R.id.percent_btn)
        val step: Button = findViewById(R.id.step_btn)
        val dot: Button = findViewById(R.id.dot_btn)
        val lg: Button = findViewById(R.id.lg_btn)
        val ln: Button = findViewById(R.id.ln_btn)
        val sin: Button = findViewById(R.id.sin_btn)
        val cos: Button = findViewById(R.id.cos_btn)
        val tg: Button = findViewById(R.id.tg_btn)
        val skob1: Button = findViewById(R.id.skob1_btn)
        val skob2: Button = findViewById(R.id.skob2_btn)
        val koren: Button = findViewById(R.id.koren_btn)
        val pi: Button = findViewById(R.id.PI_btn)
        if (math_operation.text.toString().isNotEmpty()) {
            val radioGroup: RadioGroup = findViewById(R.id.Radio)
            var count_two = 0
            var count_eight = 0
            radioGroup.setOnCheckedChangeListener { _, isChecked ->
                when (isChecked) {
                    R.id.two -> {
                        if (count_eight > 0) {
                            val parsed = "${math_operation.text}".toInt(8)
                            math_operation.text = parsed.toString(2)
                            count_eight = 0
                        } else math_operation.text = Integer.toBinaryString("${math_operation.text}".toInt())
                        count_two++
                        markButtonDisable(percent)
                        markButtonDisable(multiplication)
                        markButtonDisable(step)
                        markButtonDisable(dot)
                        markButtonDisable(pi)
                        markButtonDisable(division)
                        markButtonDisable(sin)
                        markButtonDisable(cos)
                        markButtonDisable(tg)
                        markButtonDisable(ln)
                        markButtonDisable(lg)
                        markButtonDisable(koren)
                        markButtonDisable(skob1)
                        markButtonDisable(skob2)
                        markButtonDisable(seven)
                        markButtonDisable(eight)
                        markButtonDisable(nine)
                        markButtonDisable(four)
                        markButtonDisable(five)
                        markButtonDisable(six)
                        markButtonDisable(two)
                        markButtonDisable(three)
                        markButtonDisable(minus)
                        markButtonDisable(plus)
                    }
                    R.id.eight -> {
                        if (count_two > 0) {
                            val parsed = "${math_operation.text}".toInt(2)
                            math_operation.text = parsed.toString(8)
                            count_two = 0
                        } else math_operation.text = Integer.toOctalString("${math_operation.text}".toInt())
                        count_eight++
                        markButtonDisable(percent)
                        markButtonDisable(multiplication)
                        markButtonDisable(step)
                        markButtonDisable(dot)
                        markButtonDisable(pi)
                        markButtonDisable(division)
                        markButtonDisable(sin)
                        markButtonDisable(cos)
                        markButtonDisable(tg)
                        markButtonDisable(ln)
                        markButtonDisable(lg)
                        markButtonDisable(koren)
                        markButtonDisable(skob1)
                        markButtonDisable(skob2)
                        markButtonDisable(nine)
                        markButtonDisable(minus)
                        markButtonDisable(plus)
                    }
                    R.id.ten -> {
                        if (count_two > 0) {
                            val twos = "${math_operation.text}".toInt(2)
                            math_operation.text = twos.toString(10)
                            count_two = 0
                        }
                        if (count_eight > 0) {
                            val ten = "${math_operation.text}".toInt(2)
                            math_operation.text = ten.toString(10)
                            count_eight = 0
                        }
                    }
                }
            }
        }
        pi.setOnClickListener { setTextFields("π") }
        zero.setOnClickListener{ setTextFields("0")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        one.setOnClickListener{ setTextFields("1")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        two.setOnClickListener{ setTextFields("2")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        three.setOnClickListener{ setTextFields("3")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        four.setOnClickListener{ setTextFields("4")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        five.setOnClickListener{ setTextFields("5")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        six.setOnClickListener{ setTextFields("6")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        seven.setOnClickListener{ setTextFields("7")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        eight.setOnClickListener{ setTextFields("8")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        nine.setOnClickListener{ setTextFields("9")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(percent)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(step)
        }
        division.setOnClickListener{ setTextFields("÷")
            markButtonDisable(division)
            markButtonEnable(dot)
            markButtonEnable(sin)
            markButtonEnable(cos)
            markButtonEnable(tg)
            markButtonEnable(lg)
            markButtonEnable(ln)
        }
        multiplication.setOnClickListener{ setTextFields("*")
            markButtonEnable(dot)
            markButtonDisable(multiplication)
            markButtonEnable(sin)
            markButtonEnable(cos)
            markButtonEnable(tg)
            markButtonEnable(lg)
            markButtonEnable(ln)
        }
        plus.setOnClickListener{ setTextFields("+")
            markButtonEnable(dot)
            markButtonDisable(plus)
            markButtonEnable(sin)
            markButtonEnable(cos)
            markButtonEnable(tg)
            markButtonEnable(lg)
            markButtonEnable(ln)
        }
        minus.setOnClickListener{ setTextFields("-")
            markButtonEnable(dot)
            markButtonDisable(minus)
            markButtonEnable(sin)
            markButtonEnable(cos)
            markButtonEnable(tg)
            markButtonEnable(lg)
            markButtonEnable(ln)
        }
        percent.setOnClickListener{ setTextFields("+/-")
        }
        dot.setOnClickListener {
            setTextFields(".")
            markButtonDisable(dot)
        }
        step.setOnClickListener{
            setTextFields("^")
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(dot)
            markButtonDisable(sin)
            markButtonDisable(tg)
            markButtonDisable(cos)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
        }
        sin.setOnClickListener {
            setTextFields("sin(")
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(tg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
            markButtonDisable(cos)
        }
        cos.setOnClickListener {
            setTextFields("cos(")
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
        }
        tg.setOnClickListener {
            setTextFields("tan(")
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
        }
        lg.setOnClickListener {
            setTextFields("log10(")
            markButtonDisable(sin)
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(tg)
            markButtonDisable(cos)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
        }
        ln.setOnClickListener {
            setTextFields("log(")
            markButtonDisable(sin)
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(percent)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(tg)
            markButtonDisable(cos)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
        }
        skob1.setOnClickListener {
            setTextFields("(")
        }
        skob2.setOnClickListener {
            setTextFields(")")
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(sin)
            markButtonEnable(tg)
            markButtonEnable(cos)
            markButtonEnable(lg)
            markButtonEnable(ln)
            markButtonEnable(koren)
        }
        koren.setOnClickListener {
            setTextFields("sqrt(")
            markButtonDisable(dot)
            markButtonDisable(plus)
            markButtonDisable(minus)
            markButtonDisable(multiplication)
            markButtonDisable(division)
            markButtonDisable(sin)
            markButtonDisable(tg)
            markButtonDisable(cos)
            markButtonDisable(lg)
            markButtonDisable(ln)
            markButtonDisable(step)
            markButtonDisable(koren)
        }
        ac.setOnClickListener{
            math_operation.text = ""
            result_text.text = ""
            markButtonEnable(dot)
            markButtonEnable(plus)
            markButtonEnable(minus)
            markButtonEnable(multiplication)
            markButtonEnable(division)
            markButtonEnable(sin)
            markButtonEnable(tg)
            markButtonEnable(cos)
            markButtonEnable(lg)
            markButtonEnable(ln)
            markButtonEnable(step)
            markButtonEnable(koren)
            markButtonEnable(pi)
            markButtonEnable(seven)
            markButtonEnable(eight)
            markButtonEnable(nine)
            markButtonEnable(four)
            markButtonEnable(five)
            markButtonEnable(six)
            markButtonEnable(one)
            markButtonEnable(two)
            markButtonEnable(three)
            markButtonEnable(skob1)
            markButtonEnable(skob2)
        }
        if ("${result_text.text}" != "") {
            markButtonEnable(percent)
            percent.setOnClickListener {
                if ("${result_text.text}".toDouble() > 0) result_text.text = ("${result_text.text}".toDouble() * -1).toString()
                else result_text.text = "${result_text.text}"
            }
        }
        else markButtonDisable(percent)
        val orientation_btn: TextView = findViewById(R.id.orientation_btn)
        orientation_btn.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        back_btn.setOnClickListener{
            val str = math_operation.text.toString()
            if(str.isNotEmpty())
            {
                math_operation.text = str.substring(0, str.length-1)
            }
            result_text.text = ""
        }
        equally.setOnClickListener {
            markButtonEnable(dot)
            markButtonEnable(ln)
            markButtonEnable(lg)
            markButtonEnable(sin)
            markButtonEnable(cos)
            markButtonEnable(tg)

            try {
                val ex = ExpressionBuilder(math_operation.text.toString()).build()
                val result = ex.evaluate()

                val longRes = result.toLong()
                if(result == longRes.toDouble())
                    result_text.text = longRes.toString()
                else
                    result_text.text = result.toString()
            } catch (e: Exception) {
                val log = Log.d("Ошибка", "сообщение: ${e.message}")
                if (e.message == "Expression can not be empty")
                {
                    Toast.makeText(this,"Введите число", Toast.LENGTH_SHORT).show()
                }
                Toast.makeText(this,"Ошибка: ${e.message}", Toast.LENGTH_SHORT).show()
            }
            if ("${result_text.text}" != " " || "${result_text.text}" != "")
            {
                markButtonEnable(percent)
                percent.setOnClickListener {
                    if ("${result_text.text}".toDouble() > 0) result_text.text = ("${result_text.text}".toDouble() * -1).toString()
                    else result_text.text = "${result_text.text}"
                }
            }
            if ("${result_text.text}" != " " || "${result_text.text}" != "") {
                Log.d("Ошибка", "сообщение: ${result_text.text}")
                if ("${result_text.text}" == " -Infinity" || "${result_text.text}" == "-Infinity") {
                    Toast.makeText(this, "Не вычисляется!", Toast.LENGTH_SHORT).show()
                    result_text.text = "Не вычисляется"
                }
            }
        }
    }
    fun setTextFields(str: String){
        val math_operation = findViewById<TextView>(R.id.math_operation)
        val result_text: TextView = findViewById(R.id.result_text)
        if(result_text.text != ""){
            math_operation.text = result_text.text
            result_text.text = ""
        }
        math_operation.append(str)
    }
    private fun markButtonDisable(button: Button) {
        button.isEnabled = false
        button.setTextColor(ContextCompat.getColor(this, R.color.white))
        button.setBackgroundColor(ContextCompat.getColor(this, R.color.grey))
    }
    private fun markButtonEnable(button: Button) {
        button.isEnabled = true
        button.setTextColor(ContextCompat.getColor(this, R.color.orange))
        button.setBackgroundColor(ContextCompat.getColor(this, R.color.whiter))
    }
}

