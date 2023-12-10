package com.evinanshsapplication.app.modules.meditation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.meditation.`data`.model.MeditationModel
import com.evinanshsapplication.app.modules.meditation.`data`.model.MeditationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MeditationVM : ViewModel(), KoinComponent {
  val meditationModel: MutableLiveData<MeditationModel> = MutableLiveData(MeditationModel())

  var navArguments: Bundle? = null

  val meditationList: MutableLiveData<MutableList<MeditationRowModel>> =
      MutableLiveData(mutableListOf())
}
