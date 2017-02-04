package piotrpakula.googlegithubrepositoriesviewer.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import piotrpakula.googlegithubrepositoriesviewer.R;
import piotrpakula.googlegithubrepositoriesviewer.model.Repo;

public class RepoViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Repo> listRepositories;

    public RepoViewAdapter(LayoutInflater inflater, List<Repo> listRepositories){
        this.inflater = inflater;
        this.listRepositories = listRepositories;
    }

    @Override
    public int getCount() {
        return listRepositories.size();
    }

    @Override
    public Repo getItem(int position) {
        return listRepositories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_repository, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.updateWith(listRepositories.get(position));

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.name) TextView name;
        @BindView(R.id.language_icon) ImageView languageIcon;
        @BindView(R.id.description) TextView description;
        @BindView(R.id.language) TextView language;
        @BindView(R.id.stargazers_count) TextView stargazersCount;
        @BindView(R.id.forks) TextView forks;

        private Context context;

        private ViewHolder(View view) {
            ButterKnife.bind(this, view);
            context = view.getContext();
        }

        void updateWith(Repo repo){
            name.setText(repo.getName());
            description.setText(repo.getDescription());
            language.setText(repo.getLanguage());
            stargazersCount.setText(String.valueOf(repo.getStargazersCount()));
            forks.setText(String.valueOf(repo.getForks()));
            languageIcon.setBackground(getLanguageIcon(repo));
        }

        private Drawable getLanguageIcon(Repo repo) {
            if(repo.getLanguage() == null) {
                return getResourceDrawable(R.drawable.yellow_circle);
            } else if (repo.getLanguage().equals("Java")) {
                return getResourceDrawable(R.drawable.blue_circle);
            } else if (repo.getLanguage().equals("C#")) {
                return getResourceDrawable(R.drawable.green_circle);
            } else if (repo.getLanguage().equals("JavaScript")) {
                return getResourceDrawable(R.drawable.orange_circle);
            } else if (repo.getLanguage().equals("Python")) {
                return getResourceDrawable(R.drawable.pink_circle);
            } else if (repo.getLanguage().equals("Go")) {
                return getResourceDrawable(R.drawable.purple_circle);
            } else if (repo.getLanguage().equals("HTML")) {
                return getResourceDrawable(R.drawable.red_circle);
            } else {
                return getResourceDrawable(R.drawable.yellow_circle);
            }
        }

        private Drawable getResourceDrawable(int drawableId) {
            return ResourcesCompat.getDrawable(context.getResources(), drawableId, null);
        }
    }
}