package pro.crazydude.scoopwhoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.scoopwhoop.R
import pro.crazydude.scoopwhoop.databinding.ItemLatestBinding
import pro.crazydude.scoopwhoop.model.LatestData

class LatestAdapter(private val dataList: ArrayList<LatestData>) : RecyclerView.Adapter<LatestAdapter.ViewHolder>() {

    class ViewHolder(itemBinding: ItemLatestBinding) :

        RecyclerView.ViewHolder(itemBinding.root) {
        var binding: ItemLatestBinding = itemBinding


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_latest,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.model = dataList[position]
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}