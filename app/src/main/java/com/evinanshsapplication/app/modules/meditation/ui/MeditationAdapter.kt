package com.evinanshsapplication.app.modules.meditation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.databinding.RowMeditationBinding
import com.evinanshsapplication.app.modules.meditation.`data`.model.MeditationRowModel
import kotlin.Int
import kotlin.collections.List

class MeditationAdapter(
  var list: List<MeditationRowModel>
) : RecyclerView.Adapter<MeditationAdapter.RowMeditationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMeditationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_meditation,parent,false)
    return RowMeditationVH(view)
  }

  override fun onBindViewHolder(holder: RowMeditationVH, position: Int) {
    val meditationRowModel = MeditationRowModel()
    // TODO uncomment following line after integration with data source
    // val meditationRowModel = list[position]
    holder.binding.meditationRowModel = meditationRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MeditationRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MeditationRowModel
    ) {
    }
  }

  inner class RowMeditationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMeditationBinding = RowMeditationBinding.bind(itemView)
  }
}
