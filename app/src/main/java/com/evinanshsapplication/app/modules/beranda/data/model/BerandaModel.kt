package com.evinanshsapplication.app.modules.beranda.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BerandaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pratama)

)
