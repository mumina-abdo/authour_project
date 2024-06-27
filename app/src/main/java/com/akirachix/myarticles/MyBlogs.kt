package com.akirachix.myarticles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyBlogs(var authorsList:List<AthourD>):RecyclerView.Adapter<BlogsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.auothor_profile_item,parent,false)
        return BlogsViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val author = authorsList[position]
        holder.tvAuthor.text=author.name
        holder.tvTitle.text=author.title
        holder.tvDate.text=author.date


    }

    override fun getItemCount(): Int {
        return authorsList.size
    }
}




class BlogsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvAuthor=itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)

}