package piotrpakula.googlegithubrepositoriesviewer.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import piotrpakula.googlegithubrepositoriesviewer.R;
import piotrpakula.googlegithubrepositoriesviewer.model.Repo;
import piotrpakula.googlegithubrepositoriesviewer.service.GitHubService;
import piotrpakula.googlegithubrepositoriesviewer.service.RestClient;
import piotrpakula.googlegithubrepositoriesviewer.view.component.RepoViewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoriesActivity extends AppCompatActivity {

    @BindView(R.id.repositories_list) ListView repoList;
    @BindView(R.id.repositories_progress_bar) ProgressBar progressBar;

    @BindString(R.string.repo_key) String REPO_KEY;
    @BindString(R.string.on_failure_message) String ON_FAILURE_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repositories);
        ButterKnife.bind(this);
        asynchronousCallGitHub();
    }

    @OnItemClick(R.id.repositories_list)
    public void onItemClickListener(int position){
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(REPO_KEY, (Repo) repoList.getAdapter().getItem(position));
        startActivity(intent);
    }

    public void asynchronousCallGitHub() {
        GitHubService gitHubService = new RestClient().getGitHubService();
        Call<List<Repo>> request = gitHubService.getListRepositories();
        request.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                progressBar.setVisibility(View.GONE);
                repoList.setAdapter(new RepoViewAdapter((LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE), response.body()));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), ON_FAILURE_MESSAGE, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
