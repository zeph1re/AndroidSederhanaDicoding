package and5.finalproject.androidsederhanadicoding.data

import and5.finalproject.androidsederhanadicoding.R
import java.util.ArrayList

object GameData {

    private val gameNames = arrayOf(
        "Counter Strike: Global Offensive",
        "Dota 2",
        "Lost Ark",
        "Apex Legends",
        "MutliVersus",
        "Grand Theft Auto V",
        "Team Fortress 2",
        "Destiny 2",
        "ARK: Suvival Evolved",
        "Left 4 Dead",
        "Pummel Party"
    )

    private val gameDetails = arrayOf(
        "Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago. CS: GO features new maps, characters, weapons, and game modes, and delivers updated versions of the classic CS content (de_dust2, etc.).",
        "Every day, millions of players worldwide enter battle as one of over a hundred Dota heroes. And no matter if it's their 10th hour of play or 1,000th, there's always something new to discover. With regular updates that ensure a constant evolution of gameplay, features, and heroes, Dota 2 has taken on a life of its own.",
        "Embark on an odyssey for the Lost Ark in a vast, vibrant world: explore new lands, seek out lost treasures, and test yourself in thrilling action combat in this action-packed free-to-play RPG.",
        "Apex Legends is the award-winning, free-to-play Hero Shooter from Respawn Entertainment. Master an ever-growing roster of legendary characters with powerful abilities, and experience strategic squad play and innovative gameplay in the next evolution of Hero Shooter and Battle Royale.",
        "MultiVersus is a platform fighter that lets you team up with your friends using some of the most iconic characters including Batman, Shaggy, & more. Find your favorite fighter combos and save the Multiverse!",
        "Grand Theft Auto V for PC offers players the option to explore the award-winning world of Los Santos and Blaine County in resolutions of up to 4k and beyond, as well as the chance to experience the game running at 60 frames per second.",
        "Nine distinct classes provide a broad range of tactical abilities and personalities. Constantly updated with new game modes, maps, equipment and, most importantly, hats!",
        "Destiny 2 is an action MMO with a single evolving world that you and your friends can join anytime, anywhere, absolutely free.",
        "Stranded on the shores of a mysterious island, you must learn to survive. Use your cunning to kill or tame the primeval creatures roaming the land, and encounter other players to survive, dominate... and escape!",
        "From Valve (the creators of Counter-Strike, Half-Life and more) comes Left 4 Dead, a co-op action horror game for the PC and Xbox 360 that casts up to four players in an epic struggle for survival against swarming zombie hordes and terrifying mutant monsters.",
        "Pummel Party is a 4-8 player online and local-multiplayer party game. Pummel friends or AI using a wide array of absurd items in the board mode and compete to destroy friendships in the unique collection of minigames."
    )

    private val gamePictures = intArrayOf(
        R.drawable.csgo,
        R.drawable.dota2,
        R.drawable.lost_ark,
        R.drawable.apex_legend,
        R.drawable.multi_versus,
        R.drawable.gta5,
        R.drawable.team_fortess_2,
        R.drawable.destiny_2,
        R.drawable.ark,
        R.drawable.l4d,
        R.drawable.pummel_party,
    )

    private val gamePopulatiry = arrayOf(
        "87.92",
        "82.66",
        "73.20",
        "85.46",
        "89.51",
        "84.30",
        "92.85",
        "83.29",
        "81.79",
        "94.28",
        "87.67"

    )

    val listGameData : ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices){
                val game = Game()
                game.name = gameNames[position]
                game.detail = gameDetails[position]
                game.photo = gamePictures[position]
                game.popularity = gamePopulatiry[position]
                list.add(game)
            }
            return list
        }


}