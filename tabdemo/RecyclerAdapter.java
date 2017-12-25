package learnuptech.tabdemo;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by Abdul Rehman Bhatti on 12/24/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Hero> heroes;

    public RecyclerAdapter(List<Hero> heroes){

        this.heroes = heroes;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(heroes.get(position).getName());
        holder.Email.setText(heroes.get(position).getTeam());
     holder.Name.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
          //   Intent i = new Intent(getClass(), SingleItemFragment.class);
             // startActivity(i);
         }
     });

    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }
    public  class  MyViewHolder extends RecyclerView.ViewHolder{

           TextView Name,Email;

        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.name);
            Email = (TextView) itemView.findViewById(R.id.email);
        }
    }
}