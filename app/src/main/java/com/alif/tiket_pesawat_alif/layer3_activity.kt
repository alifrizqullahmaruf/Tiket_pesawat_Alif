package com.alif.tiket_pesawat_alif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alif.tiket_pesawat_alif.databinding.ActivityLayer3Binding

class layer3_activity : AppCompatActivity() {
    private lateinit var binding: ActivityLayer3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayer3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_layer3)

        val namaPenumpangTextView = findViewById<TextView>(R.id.Nama_Penumpang)
        val keberangkatanTextView = findViewById<TextView>(R.id.Keberangkatan_tempat)
        val tujuanTextView = findViewById<TextView>(R.id.Tujuan_tempat)
        val tanggalKeberangkatanTextView = findViewById<TextView>(R.id.Tanggal_pemesanan)
        val tipeKelasTextView = findViewById<TextView>(R.id.Tipe_Kelas)

        // Mengambil data dari Intent
        val intent = intent
        val namaPenumpang = intent.getStringExtra("nama_penumpang")
        val keberangkatan = intent.getStringExtra("keberangkatan")
        val tujuan = intent.getStringExtra("tujuan")
        val tanggalKeberangkatan = intent.getStringExtra("tanggal_keberangkatan")
        val tipeKelas = intent.getStringExtra("tipe_kelas")
//
//        // Mengisi TextView dengan data yang diterima
//        namaPenumpangTextView.text = namaPenumpang
//        keberangkatanTextView.text = keberangkatan
//        tujuanTextView.text = tujuan
//        tanggalKeberangkatanTextView.text = tanggalKeberangkatan
//        tipeKelasTextView.text = tipeKelas



        // Mengatur tindakan klik pada backIcon
        binding.backIcon.setOnClickListener {
            // Tambahkan kode untuk kembali ke activity_layer2.xml di sini
            onBackPressed()
        }
    }
}
