package com.evinanshsapplication.app.modules.meditation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityMeditationBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.meditation.`data`.model.MeditationRowModel
import com.evinanshsapplication.app.modules.meditation.`data`.viewmodel.MeditationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MeditationActivity : BaseActivity<ActivityMeditationBinding>(R.layout.activity_meditation) {
  private val viewModel: MeditationVM by viewModels<MeditationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val meditationAdapter = MeditationAdapter(viewModel.meditationList.value?:mutableListOf())
    binding.recyclerMeditation.adapter = meditationAdapter
    meditationAdapter.setOnItemClickListener(
    object : MeditationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MeditationRowModel) {
        onClickRecyclerMeditation(view, position, item)
      }
    }
    )
    viewModel.meditationList.observe(this) {
      meditationAdapter.updateData(it)
    }
    binding.meditationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMeditation(
    view: View,
    position: Int,
    item: MeditationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MEDITATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MeditationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
