package com.alif.tiket_pesawat_alif
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alif.tiket_pesawat_alif.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            loginBtn.setOnClickListener {
                val intentToSecondActivity = Intent(this@MainActivity, layer2_activity::class.java)
                startActivity(intentToSecondActivity)
            }
        }
        // Tambahkan tindakan klik untuk ikon GitHub
        binding.githubIcon.setOnClickListener {
            val githubUrl = "https://github.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
            startActivity(intent)
        }

        // Tambahkan tindakan klik untuk ikon Google
        binding.googleIcon.setOnClickListener {
            val googleUrl = "https://www.google.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(googleUrl))
            startActivity(intent)
        }

        // Tambahkan tindakan klik untuk ikon Facebook
        binding.facebookIcon.setOnClickListener {
            val facebookUrl = "https://id-id.facebook.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: dipanggil")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: dipanggil")
    }
}
