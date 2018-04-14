package com.selfhack.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.selfhack.swoosh.R
import com.selfhack.swoosh.utilities.EXTRA_LEAGUE
import com.selfhack.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for $league $skill league near you"
    }
}
