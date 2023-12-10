package com.evinanshsapplication.app.modules.workout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.workout.`data`.model.WorkoutModel
import org.koin.core.KoinComponent

class WorkoutVM : ViewModel(), KoinComponent {
  val workoutModel: MutableLiveData<WorkoutModel> = MutableLiveData(WorkoutModel())

  var navArguments: Bundle? = null
}
