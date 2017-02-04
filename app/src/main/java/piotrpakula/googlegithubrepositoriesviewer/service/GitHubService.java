package piotrpakula.googlegithubrepositoriesviewer.service;

import java.util.List;

import piotrpakula.googlegithubrepositoriesviewer.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {

    @GET("users/google/repos")
    Call<List<Repo>> getListRepositories();

}
