package jetsetpaul.movienerd;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by pauljoiner on 8/10/16.
 */
public class ResultsAdapter extends RecyclerView.Adapter<ResultsAdapter.ProductViewHolder> {
     ArrayList<Movie> MovieListArray;
     public ResultsFragment.MovieResultsClickListener listener;

    public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titleText;
        TextView dateText;
        TextView scoreText;
        TextView popularityText;
        ImageView movieImage;
        public ProductViewHolder(View itemView){
            super(itemView);
            titleText = (TextView) itemView.findViewById(R.id.movie_title_text);
            dateText = (TextView) itemView.findViewById(R.id.movie_date_text);
            scoreText = (TextView) itemView.findViewById(R.id.movie_score_text);
            popularityText = (TextView) itemView.findViewById(R.id.movie_popularity_text);
            movieImage = (ImageView) itemView.findViewById(R.id.movie_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onResultClicked(MovieListArray.get(getAdapterPosition()).getmTitle());
            Toast.makeText(v.getContext(), MovieListArray.get(getAdapterPosition()).getmTitle(), Toast.LENGTH_SHORT).show();
        }
    }

    public ResultsAdapter(ArrayList<Movie> movieList, ResultsFragment.MovieResultsClickListener listener){
        this.listener = listener;
        MovieListArray = movieList;
    }


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_result_list_item, parent, false);

        ProductViewHolder vh = new ProductViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.titleText.setText(MovieListArray.get(position).getmTitle());
        Log.d("TAGG", MovieListArray.toString());
        holder.dateText.setText("Released " + MovieListArray.get(position).getmReleaseYear());
        holder.scoreText.setText("TMDB Score:  "+MovieListArray.get(position).getmScore());
        holder.popularityText.setText(MovieListArray.get(position).getmPopularity()+" votes");
        Context context = holder.movieImage.getContext();
        Picasso.with(context).load(Constants.TMDB_POSTER+MovieListArray.get(position).getmImage()).into(holder.movieImage);
    }

    @Override
    public int getItemCount() {
        return MovieListArray.size();
    }


}
