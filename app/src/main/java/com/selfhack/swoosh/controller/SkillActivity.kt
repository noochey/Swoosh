package com.selfhack.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.selfhack.swoosh.utilities.EXTRA_LEAGUE
import com.selfhack.swoosh.R
import com.selfhack.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill  = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSkillFinishClicked(view: View){
        if(skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please choose a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View){
        skill = "beginner"
        buttonBallerSkill.isChecked = false
    }

    fun onBallerClicked(view: View){
        skill = "baller"
        buttonBeginnerSkill.isChecked = false
    }
}
