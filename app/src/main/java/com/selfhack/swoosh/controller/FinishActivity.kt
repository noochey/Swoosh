package com.selfhack.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.selfhack.swoosh.R
import com.selfhack.swoosh.model.Player
import com.selfhack.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you"
    }
}
