package escalante.elmer.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var numero1: Double = 0.0
    var oper: Int = 0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_num1 = findViewById(R.id.tv_num1)
        tv_num2 = findViewById(R.id.tv_num2)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnIgual: Button = findViewById(R.id.btnIgual)

        btnIgual.setOnClickListener {
            var numero2: Double = tv_num2.text.toString().toDouble()
            var resp: Double = 0.0

            when(oper){
                1 -> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }

            tv_num2.setText(resp.toString())
            tv_num1.setText("")
        }

        btnBorrar.setOnClickListener {
            tv_num1.setText("")
            tv_num2.setText("")
            numero1 = 0.0
            numero2 = 0.0
            oper = 0
        }
    }

    fun presionarDigito(view: View){
        //val tv_num2: TextView = findViewById(R.id.tv_num2)
        var num2: String = tv_num2.text.toString()

        when(view.id){
            R.id.btn0 -> tv_num2.setText(num2 + "0")
            R.id.btn0 -> tv_num2.setText(num2 + "1")
            R.id.btn0 -> tv_num2.setText(num2 + "2")
            R.id.btn0 -> tv_num2.setText(num2 + "3")
            R.id.btn0 -> tv_num2.setText(num2 + "4")
            R.id.btn0 -> tv_num2.setText(num2 + "5")
            R.id.btn0 -> tv_num2.setText(num2 + "6")
            R.id.btn0 -> tv_num2.setText(num2 + "7")
            R.id.btn0 -> tv_num2.setText(num2 + "8")
            R.id.btn0 -> tv_num2.setText(num2 + "9")
            R.id.btnPunto -> tv_num2.setText(num2 + ".")
        }
    }

    fun clicOperacion(view: View){
        numero1 = tv_num2.text.toString().toDouble()
        var num2_text: String = tv_num2.text.toString()
        tv_num2.setText("")
        whem(view.id){
            R.id.btnSuma ->{
                tv_num1.setText(num2_text + "+")
                oper = 1
        }
            R.id.btnRestar ->{
                tb_num1.setText(num2_text + "-")
                oper = 2
        }
            R.id.btnMultiplicar ->{
                tv_num1.setText(num2_text + "*")
                oper = 3
        }
            R.id.btnDividir ->{
                tb_num1.setText(num2_text + "/")
                oper = 4
        }
        }

    }
}
