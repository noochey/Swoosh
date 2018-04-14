package com.selfhack.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.selfhack.swoosh.utilities.EXTRA_LEAGUE
import com.selfhack.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please choose a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onWomenClicked(view: View){
        selectedLeague = "women"
        buttonLeagueMen.isChecked = false
        buttonLeagueCoed.isChecked = false
    }

    fun onMenClicked(view: View){
        selectedLeague = "men"
        buttonLeagueWomen.isChecked = false
        buttonLeagueCoed.isChecked = false
    }

    fun onCoedClicked(view: View){
        selectedLeague = "co-ed"
        buttonLeagueMen.isChecked = false
        buttonLeagueWomen.isChecked = false
    }
}
