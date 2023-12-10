package com.evinanshsapplication.app.modules.beranda.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.beranda.`data`.model.BerandaModel
import org.koin.core.KoinComponent

class BerandaVM : ViewModel(), KoinComponent {
  val berandaModel: MutableLiveData<BerandaModel> = MutableLiveData(BerandaModel())

  var navArguments: Bundle? = null
}
