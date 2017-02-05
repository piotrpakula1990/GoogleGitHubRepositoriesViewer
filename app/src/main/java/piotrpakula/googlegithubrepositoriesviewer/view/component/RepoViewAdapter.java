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
import piotrpakula.googlegithubrepositoriesviewer.utils.RepositoriesUtils;

public class RepoViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Repo> listRepositories;

//    private static final Map<String, Integer> iconsId = new HashMap<>();
//    static {
//        iconsId.put("Java", R.drawable.blue_circle);
//        iconsId.put("C", R.drawable.green_circle);
//        iconsId.put("JavaScript", R.drawable.orange_circle);
//        iconsId.put("Python", R.drawable.pink_circle);
//        iconsId.put("Go", R.drawable.purple_circle);
//        iconsId.put("HTML", R.drawable.red_circle);
//    }

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
            view = inflater.inflate(R.layout.repo_list_layout, parent, false);
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
            return (RepositoriesUtils.iconsId.get(repo.getLanguage()) == null)
                    ? getResourceDrawable(R.drawable.yellow_circle) //default
                    : getResourceDrawable(RepositoriesUtils.iconsId.get(repo.getLanguage()));
        }

        private Drawable getResourceDrawable(Integer drawableId) {
            return ResourcesCompat.getDrawable(context.getResources(), drawableId, null);
        }
    }
}