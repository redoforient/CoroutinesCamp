package com.hencoder.coroutinescamp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val data = getData()
    val processedData = processData(data)
    textView.text = processedData
  }

  private fun getData(): String {
    // 假设这个函数比较耗时，需要放在后台
    return "hen_coder"
  }

  private fun processData(data: String): String {
    // 假设这个函数也比较耗时，需要放在后台
    return data.split("_") // 把 "hen_coder" 拆成 ["hen", "coder"]
      .map { it.capitalize() } // 把 ["hen", "coder"] 改成 ["Hen", "Coder"]
      .reduce { acc, s -> acc + s } // 把 ["Hen", "Coder"] 改成 "HenCoder"
  }
}