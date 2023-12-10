package com.evinanshsapplication.app.modules.meditation.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MeditationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pratama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTab: String? = MyApp.getInstance().resources.getString(R.string.lbl_workout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)

)
