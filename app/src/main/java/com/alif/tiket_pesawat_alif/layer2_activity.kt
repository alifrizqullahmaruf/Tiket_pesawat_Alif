package com.alif.tiket_pesawat_alif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import android.widget.DatePicker
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText

class layer2_activity : AppCompatActivity() {


    private var count = 0
    private lateinit var countText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layer2)

        countText = findViewById(R.id.countText)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val decrementButton: Button = findViewById(R.id.decrementButton)
        val backIcon: ImageView = findViewById(R.id.backIcon)

        val submitButton: Button = findViewById(R.id.Button_submit)


        submitButton.setOnClickListener {
            val intent = Intent(this, layer3_activity::class.java)

            // Mendapatkan nilai dari komponen-komponen di activity_layer2.xml
            val namaPenumpang = findViewById<TextInputEditText>(R.id.nama_penumpang_edittext).text.toString()
            val keberangkatan = findViewById<Spinner>(R.id.Spin_Keberangkatan).selectedItem.toString()
            val tujuan = findViewById<Spinner>(R.id.Spin_Tujuan).selectedItem.toString()
            val tanggalKeberangkatan = findViewById<DatePicker>(R.id.Ed_Tanggal_keberangkatan)
            val tipeKelas = findViewById<Spinner>(R.id.Spin_Tipe_kelas).selectedItem.toString()

            // Menyimpan data sebagai "extra" dalam Intent
            intent.putExtra("nama_penumpang", namaPenumpang)
            intent.putExtra("keberangkatan", keberangkatan)
            intent.putExtra("tujuan", tujuan)
            intent.putExtra("tanggal_keberangkatan", tanggalKeberangkatan.year.toString() + "-" + (tanggalKeberangkatan.month + 1).toString() + "-" + tanggalKeberangkatan.dayOfMonth.toString())
            intent.putExtra("tipe_kelas", tipeKelas)

            startActivity(intent)
        }


        submitButton.setOnClickListener {
            val intent = Intent(this, layer3_activity::class.java)
            startActivity(intent)
        }

        incrementButton.setOnClickListener {
            count++
            updateCount()
        }

        decrementButton.setOnClickListener {
            if (count > 0) {
                count--
                updateCount()
            }
        }

        // Mengatur click listener untuk backIcon
        backIcon.setOnClickListener {
            // Membuat Intent untuk kembali ke activity_main
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateCount() {
        countText.text = count.toString()
    }
}
