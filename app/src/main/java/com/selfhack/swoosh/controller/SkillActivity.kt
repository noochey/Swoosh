package com.selfhack.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.selfhack.swoosh.R
import com.selfhack.swoosh.model.Player
import com.selfhack.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
    }

    fun onSkillFinishClicked(view: View){
        if(player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please choose a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View){
        player.skill = "beginner"
        buttonBallerSkill.isChecked = false
    }

    fun onBallerClicked(view: View){
        player.skill = "baller"
        buttonBeginnerSkill.isChecked = false
    }
}
