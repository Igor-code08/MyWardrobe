package com.example.mywardrobe

class ClothingAdapter(private val clothingList: List<ClothingItem>) : RecyclerView.Adapter<ClothingAdapter.ClothingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.clothing_item, parent, false)
        return ClothingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ClothingViewHolder, position: Int) {
        val currentItem = clothingList[position]
        holder.imageView.setImageResource(currentItem.imageResourceId)
        holder.textViewTitle.text = currentItem.title
        holder.textViewDescription.text = currentItem.description
    }

    override fun getItemCount() = clothingList.size

    inner class ClothingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewClothing)
        val textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle)
        val textViewDescription: TextView = itemView.findViewById(R.id.textViewDescription)
    }
}
