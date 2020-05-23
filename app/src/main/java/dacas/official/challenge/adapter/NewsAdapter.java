package dacas.official.challenge.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import dacas.official.challenge.ui.news.News;
import dacas.official.challenge.R;
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    LayoutInflater inflater;
    List<News> Newses;
    private Context context;
    public NewsAdapter(Context ctx, List<News> newses){
        this.inflater = LayoutInflater.from(ctx);
        this.Newses = newses;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_news,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(Newses.get(position).getTitle());
        holder.author.setText(Newses.get(position).getAuthor());
        Picasso.get().load(Newses.get(position).getImage()).into(holder.coverImage);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,author;
        ImageView coverImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.contentTitle);
            author = itemView.findViewById(R.id.contentAuthor);
            coverImage = itemView.findViewById(R.id.coverImage);

            // handle onClick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
