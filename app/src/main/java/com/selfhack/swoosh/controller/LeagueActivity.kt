package com.selfhack.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.selfhack.swoosh.R
import com.selfhack.swoosh.model.Player
import com.selfhack.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please choose a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onWomenClicked(view: View){
        player.league = "women"
        buttonLeagueMen.isChecked = false
        buttonLeagueCoed.isChecked = false
    }

    fun onMenClicked(view: View){
        player.league = "men"
        buttonLeagueWomen.isChecked = false
        buttonLeagueCoed.isChecked = false
    }

    fun onCoedClicked(view: View){
        player.league = "co-ed"
        buttonLeagueMen.isChecked = false
        buttonLeagueWomen.isChecked = false
    }
}
