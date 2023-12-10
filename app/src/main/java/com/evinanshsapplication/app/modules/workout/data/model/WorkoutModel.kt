package com.evinanshsapplication.app.modules.workout.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WorkoutModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_workout_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLevel: String? = MyApp.getInstance().resources.getString(R.string.lbl_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMins: String? = MyApp.getInstance().resources.getString(R.string.lbl_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalories: String? = MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCal: String? = MyApp.getInstance().resources.getString(R.string.lbl_cal)

)
