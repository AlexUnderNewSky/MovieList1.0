package adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movielist.R;

import java.util.ArrayList;

import data.Review;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewiewHolder>{

    private ArrayList<Review> reviews;

    @NonNull
    @Override
    public ReviewiewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review_item, viewGroup, false);
        return new ReviewiewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewiewHolder reviewiewHolder, int i) {
        Review review = reviews.get(i);
        reviewiewHolder.textViewContent.setText(review.getContent());
        reviewiewHolder.textViewAuthor.setText(review.getAuthor());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    class ReviewiewHolder extends RecyclerView.ViewHolder {

        private TextView textViewAuthor;
        private TextView textViewContent;

        public ReviewiewHolder(@NonNull View itemView) {
            super(itemView);
            textViewAuthor = itemView.findViewById(R.id.textViewAuthor);
            textViewContent = itemView.findViewById(R.id.textViewContent);
        }
    }
}
