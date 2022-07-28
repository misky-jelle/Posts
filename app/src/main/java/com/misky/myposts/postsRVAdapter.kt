package com.misky.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.misky.myposts.databinding.PostListItemBinding
import retrofit2.Retrofit

class postsRVAdapter(
    var context: Context, var post_list_item: List<Posts>
) : RecyclerView.Adapter<postsRVAdapter.postsViewHolder>() {

    override fun onBindViewHolder(holder: postsViewHolder, position: Int) {
        var currentItem = post_list_item.get(position)
        val context = holder.itemView.context

        with(holder.bindingView) {
            tvId.text = currentItem.id.toString()
            tvUserid.text = currentItem.userId.toString()
            tvTitle.text = currentItem.title
            tvBody.text = currentItem.body
        }
    }
    override fun getItemCount(): Int {
        return post_list_item.size
    }
    class postsViewHolder(var bindingView: PostListItemBinding) :
        RecyclerView.ViewHolder(bindingView.root) {
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postsViewHolder {
        var binding = PostListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return postsViewHolder(binding)
    }
}
class PostRvAdapter(var context:Context, var postList: List<Posts>): RecyclerView.Adapter<RetrofitViewHolder>() {
    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
        var currentItem = postList.get(position)
        with(holder.bindingView) {
            tvId.text= currentItem.id.toString()
            tvUserid.text = currentItem.userId.toString()
            tvTitle.text= currentItem.title
            tvBody.text = currentItem.body

        }

    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        var binding =PostListItemBinding .inflate(LayoutInflater.from(context), parent, false)
        return RetrofitViewHolder(binding)
    }
}

class RetrofitViewHolder(var bindingView: PostListItemBinding) :
    RecyclerView.ViewHolder(bindingView.root)
