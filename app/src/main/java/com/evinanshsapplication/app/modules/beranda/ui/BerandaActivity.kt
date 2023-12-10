package com.evinanshsapplication.app.modules.beranda.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityBerandaBinding
import com.evinanshsapplication.app.modules.beranda.`data`.viewmodel.BerandaVM
import com.evinanshsapplication.app.modules.meditation.ui.MeditationActivity
import com.evinanshsapplication.app.modules.workout.ui.WorkoutActivity
import kotlin.String
import kotlin.Unit

class BerandaActivity : BaseActivity<ActivityBerandaBinding>(R.layout.activity_beranda) {
  private val viewModel: BerandaVM by viewModels<BerandaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.berandaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnMeditation.setOnClickListener {
      val destIntent = MeditationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnWorkout.setOnClickListener {
      val destIntent = WorkoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BERANDA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BerandaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
