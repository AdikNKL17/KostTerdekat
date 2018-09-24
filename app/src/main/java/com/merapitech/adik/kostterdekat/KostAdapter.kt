package com.merapitech.adik.kostterdekat

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.AnkoContext


class KostAdapter(var list: ArrayList<Kost> = arrayListOf()) : RecyclerView.Adapter<KostAdapter.MyKostHolder>() {
    


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KostAdapter.MyKostHolder {
        return MyKostHolder(KostListUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: KostAdapter.MyKostHolder, position: Int) {
        val kost = list[position]


        holder.imgUrl.setImageResource(kost.imgUrl)
        holder.namaKost.text = kost.namaKost
        holder.alamatKost.text = kost.alamatKost
        holder.hargaKost.text = "${kost.hargaKost}"
    }

    inner class MyKostHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUrl: ImageView
        var namaKost : TextView
        var alamatKost : TextView
        var hargaKost : TextView

        init {
            imgUrl = itemView.findViewById(KostListUI.kostThumbnail)
            namaKost = itemView.findViewById(KostListUI.namaKost)
            alamatKost = itemView.findViewById(KostListUI.alamatKost)
            hargaKost = itemView.findViewById(KostListUI.hargaKost)
        }
    }
}