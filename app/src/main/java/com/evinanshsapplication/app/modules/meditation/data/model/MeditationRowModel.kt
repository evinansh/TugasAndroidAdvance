package com.evinanshsapplication.app.modules.meditation.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MeditationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_reduce_your_str)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBADGE: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMins: String? = MyApp.getInstance().resources.getString(R.string.lbl_mins2)

)
