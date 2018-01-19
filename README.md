# RecyclerviewCustomAdapter

Generic Recyclerview Adapter


//How to use 
//write you own adapter extend BaseAdapter
public class Adapter extends BaseAdapter<Model, Adapter.NameHolder> {

    public Adapter(Context context) {
        super(context);
    }

    @Override
    public NameHolder getViewHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
        return new NameHolder(inflater.inflate(R.layout.item_list,parent,false));
    }

    public class NameHolder extends BaseViewHolder<Model>{
        TextView name;

        public NameHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }

        @Override
        public void onBindView(Context context, Model data, int position) {
            name.setText(data.getName());
        }
    }
}

//adapter = new Adapter(this);
//adapter.setData(your list here );
//recyclerView.setAdapter(adapter);

//if your using callback to activity on item Click 

public class Adapter extends BaseAdapter<Model, Adapter.NameHolder> {
    
    Callback callback;
    public Adapter(Context context, Callback callback) {
        super(context);
        this.callback = callback;
    }

    @Override
    public NameHolder getViewHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
        return new NameHolder(inflater.inflate(R.layout.item_list,parent,false));
    }

    public class NameHolder extends BaseViewHolder<Model>{
        TextView name;

        public NameHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }

        @Override
        public void onBindView(Context context, Model data, final int position) {
            name.setText(data.getName());
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onItemClick(position);
                }
            });
        }
    }
}
        //adapter.addData(your list here);
        //adapter.addElement(T);
        //adapter.clear();//remove all items
        //adapter.removeItemAt(0); //remove item at position





