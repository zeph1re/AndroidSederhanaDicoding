package and5.finalproject.androidsederhanadicoding

import and5.finalproject.androidsederhanadicoding.data.Game
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeAdapter internal constructor(private val listGame : ArrayList<Game>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var gamePict: ImageView = itemView.findViewById(R.id.image_game)
        var tvGameName: TextView = itemView.findViewById(R.id.tv_game_name)
        var tvGamePopular: TextView = itemView.findViewById(R.id.tv_game_popularity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val homeView: View = LayoutInflater.from(parent.context).inflate(R.layout.home_adapter, parent, false)
        return ViewHolder(homeView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.gamePict)

        holder.tvGameName.text = game.name
        holder.tvGamePopular.text = game.popularity

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listGame[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }


    interface OnItemClickCallback {
        fun onItemClicked(data: Game)
    }
}