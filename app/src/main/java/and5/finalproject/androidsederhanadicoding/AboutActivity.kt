package and5.finalproject.androidsederhanadicoding

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val imageProfile = findViewById<ImageView>(R.id.my_image)
        Glide.with(this)
            .load(R.drawable.profile_photo)
            .apply(RequestOptions())
            .into(imageProfile)

        val nameProfile = findViewById<TextView>(R.id.my_text_name)
        nameProfile.text = "Arlinno Ganda Saputra"

        val emailProfile = findViewById<TextView>(R.id.my_text_email)
        emailProfile.text = "arlinnog1122@gmail.com"

        var actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setTitle("My Profile")
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                doSomething()
                startActivity(Intent(this, HomeActivity::class.java))
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun doSomething(){
        Toast.makeText(this, "Welcome Home", Toast.LENGTH_SHORT).show()
    }
}