package piotrpakula.googlegithubrepositoriesviewer.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import piotrpakula.googlegithubrepositoriesviewer.R;
import piotrpakula.googlegithubrepositoriesviewer.model.Repo;

public class DetailsActivity extends AppCompatActivity {

    private Repo repo;

    @BindView(R.id.details_full_name) TextView fullName;
    @BindView(R.id.details_description) TextView description;
    @BindView(R.id.details_watchers_count) TextView watchers;
    @BindView(R.id.details_stars_count) TextView stars;
    @BindView(R.id.details_forks_count) TextView forks;

    @BindString(R.string.repo_key) String REPO_KEY;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_details);
            ButterKnife.bind(this);
            repo = (Repo) getIntent().getSerializableExtra(REPO_KEY);
            updateWith(repo);
        }

    private void updateWith(Repo repo) {
        fullName.setText(repo.getFullName());
        description.setText(repo.getDescription());
        watchers.setText(String.valueOf(repo.getWatchersCount()));
        stars.setText(String.valueOf(repo.getStargazersCount()));
        forks.setText(String.valueOf(repo.getForks()));
    }
}
