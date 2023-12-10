package com.evinanshsapplication.app.modules.profil.ui

import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityProfilBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.profil.`data`.viewmodel.ProfilVM
import kotlin.String
import kotlin.Unit

class ProfilActivity : BaseActivity<ActivityProfilBinding>(R.layout.activity_profil) {
  private val viewModel: ProfilVM by viewModels<ProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageArrowleftOne.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFIL_ACTIVITY"

  }
}
