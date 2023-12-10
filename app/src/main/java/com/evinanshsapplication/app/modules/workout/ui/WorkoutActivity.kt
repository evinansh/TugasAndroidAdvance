package com.evinanshsapplication.app.modules.workout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityWorkoutBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.workout.`data`.viewmodel.WorkoutVM
import kotlin.String
import kotlin.Unit

class WorkoutActivity : BaseActivity<ActivityWorkoutBinding>(R.layout.activity_workout) {
  private val viewModel: WorkoutVM by viewModels<WorkoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.workoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WORKOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
