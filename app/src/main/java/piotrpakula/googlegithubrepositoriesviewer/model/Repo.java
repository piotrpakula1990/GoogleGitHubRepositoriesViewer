package piotrpakula.googlegithubrepositoriesviewer.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Repo implements Serializable{

    final class Owner implements Serializable {

        @SerializedName("received_events_url")
        private String receivedEventsUrl;

        @SerializedName("organizations_url")
        private String organizationsUrl;

        @SerializedName("avatar_url")
        private String avatarUrl;

        @SerializedName("gravatar_id")
        private String gravatarId;

        @SerializedName("gists_url")
        private String gistsUrl;

        @SerializedName("starred_url")
        private String starredUrl;

        @SerializedName("site_admin")
        private Boolean siteAdmin;

        private String type;

        private String url;

        private Integer id;

        @SerializedName("html_url")
        private String htmlUrl;

        @SerializedName("following_url")
        private String followingUrl;

        @SerializedName("events_url")
        private String eventsUrl;

        private String login;

        @SerializedName("subscriptions_url")
        private String subscriptionsUrl;

        @SerializedName("repos_url")
        private String reposUrl;

        @SerializedName("followers_url")
        private String followersUrl;

    }

    @SerializedName("has_issues")
    private Boolean hasIssues;

    @SerializedName("teams_url")
    private String teamsUrl;

    @SerializedName("compare_url")
    private String compareUrl;

    @SerializedName("releases_url")
    private String releasesUrl;

    @SerializedName("keys_url")
    private String keysUrl;

    @SerializedName("has_pages")
    private Boolean hasPages;

    private String description;

    @SerializedName("milestones_url")
    private String milestonesUrl;

    @SerializedName("has_wiki")
    private Boolean hasWiki;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("archive_url")
    private String archiveUrl;

    @SerializedName("subscribers_url")
    private String subscribersUrl;

    @SerializedName("contributors_url")
    private String contributorsUrl;

    @SerializedName("pushed_at")
    private String pushedAt;

    private Boolean fork;

    @SerializedName("svn_url")
    private String svnUrl;

    @SerializedName("collaborators_url")
    private String collaboratorsUrl;

    @SerializedName("subscription_url")
    private String subscriptionUrl;

    @SerializedName("clone_url")
    private String cloneUrl;

    @SerializedName("trees_url")
    private String treesUrl;

    private String homepage;

    private String url;

    private Integer size;

    @SerializedName("notifications_url")
    private String notificationsUrl;

    @SerializedName("deployments_url")
    private String deploymentsUrl;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("branches_url")
    private String branchesUrl;

    private Owner owner;

    @SerializedName("issue_events_url")
    private String issueEventsUrl;

    private String language;

    @SerializedName("forks_count")
    private Integer forksCount;

    @SerializedName("contents_url")
    private String contentsUrl;

    @SerializedName("watchers_count")
    private Integer watchersCount;

    @SerializedName("blobs_url")
    private String blobsUrl;

    @SerializedName("commits_url")
    private String commitsUrl;

    @SerializedName("has_downloads")
    private Boolean hasDownloads;

    @SerializedName("git_commits_url")
    private String gitCommitsUrl;

    @SerializedName("private")
    private Boolean hasPrivateRepo;

    @SerializedName("default_branch")
    private String defaultBranch;

    @SerializedName("open_issues")
    private Integer openIssues;

    private String id;

    @SerializedName("downloads_url")
    private String downloadsUrl;

    @SerializedName("mirror_url")
    private String mirrorUrl;

    @SerializedName("comments_url")
    private String commentsUrl;

    private String name;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("stargazers_count")
    private Integer stargazersCount;

    @SerializedName("assignees_url")
    private String assigneesUrl;

    @SerializedName("pulls_url")
    private String pullsUrl;

    private String watchers;

    @SerializedName("stargazers_url")
    private String stargazersUrl;

    @SerializedName("hooks_url")
    private String hooksUrl;

    @SerializedName("languages_url")
    private String languagesUrl;

    @SerializedName("issues_url")
    private String issuesUrl;

    @SerializedName("git_tags_url")
    private String gitTagsUrl;

    @SerializedName("merges_url")
    private String mergesUrl;

    @SerializedName("git_refs_url")
    private String gitRefsUrl;

    @SerializedName("open_issues_count")
    private Integer openIssuesCount;

    @SerializedName("ssh_url")
    private String sshUrl;

    @SerializedName("html_url")
    private String htmlUrl;

    private Integer forks;

    @SerializedName("statuses_url")
    private String statusesUrl;

    @SerializedName("forks_url")
    private String forksUrl;

    @SerializedName("issue_comment_url")
    private String issueCommentUrl;

    @SerializedName("labels_url")
    private String labelsUrl;

    @SerializedName("git_url")
    private String gitUrl;

    @SerializedName("tags_url")
    private String tagsUrl;

    @SerializedName("full_name")
    private String fullName;

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public Boolean getHasPrivateRepo() {
        return hasPrivateRepo;
    }

    public void setHasPrivateRepo(Boolean hasPrivateRepo) {
        this.hasPrivateRepo = hasPrivateRepo;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getWatchers() {
        return watchers;
    }

    public void setWatchers(String watchers) {
        this.watchers = watchers;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatarUrl() {
        return owner.avatarUrl;
    }

}
