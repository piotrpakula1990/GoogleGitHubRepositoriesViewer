package piotrpakula.googlegithubrepositoriesviewer.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static final String BASE_URL = "https://api.github.com/";
    private GitHubService gitHubService = null;

    private void initializeRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        gitHubService = retrofit.create(GitHubService.class);
    }

    public GitHubService getGitHubService() {
        if (gitHubService == null )
            initializeRetrofit();
        return gitHubService;
    }
}
