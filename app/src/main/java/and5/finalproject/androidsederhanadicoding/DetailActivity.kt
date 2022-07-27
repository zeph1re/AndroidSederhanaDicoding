package and5.finalproject.androidsederhanadicoding

import and5.finalproject.androidsederhanadicoding.data.Game
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val gameNameData = findViewById<TextView>(R.id.gameName_data)
        val gamePopularData = findViewById<TextView>(R.id.gamePopular_data)
        val gameDetailData = findViewById<TextView>(R.id.gameDeail_data)
        val gameImageData = findViewById<ImageView>(R.id.gameImage_data)

        val game = intent.getParcelableExtra<Game>("EXTRA_DATA") as Game

        gameNameData.text = game.name
        gamePopularData.text = game.popularity
        gameDetailData.text = game.detail
        Glide.with(this)
            .load(game.photo)
            .apply(RequestOptions())
            .into(gameImageData)


        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setTitle("Detail Game")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                doSomething()
                startActivity(Intent(this, HomeActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun doSomething(){
        Toast.makeText(this, "Welcome Home", Toast.LENGTH_SHORT).show()
    }


}


