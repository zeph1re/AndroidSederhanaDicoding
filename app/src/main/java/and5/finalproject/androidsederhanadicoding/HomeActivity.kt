package and5.finalproject.androidsederhanadicoding

import and5.finalproject.androidsederhanadicoding.data.Game
import and5.finalproject.androidsederhanadicoding.data.GameData
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var rvHome : RecyclerView
    private var list = ArrayList<Game>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvHome = findViewById(R.id.home_rv)
        rvHome.setHasFixedSize(true)

        list.addAll(GameData.listGameData)
        showRecyclerList()

        val actionBar = supportActionBar
        actionBar?.setIcon(R.drawable.ic_account)
        actionBar?.title = "List Game App"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.profile) {
            startActivity(Intent(this, AboutActivity::class.java))
            Toast.makeText(this, "Go To Profile", Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }



    private fun showRecyclerList(){
        rvHome.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL , false)
        val listGameAdapter = HomeAdapter(list)
        rvHome.adapter = listGameAdapter

        listGameAdapter.setOnItemClickCallback(object : HomeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Game) {
                showSelectedGame(data)
                val intent = Intent (this@HomeActivity , DetailActivity::class.java )
                intent.putExtra("EXTRA_DATA", data)
                startActivity(intent)
            }
        })
    }

    private fun showSelectedGame(game: Game) {
        Toast.makeText(this, "You choose " + game.name, Toast.LENGTH_SHORT).show()
    }


}


