package software.ulpgc;

import java.util.StringJoiner;

public class Title {
    private final String id;
    private final String Type;
    private final String primaryTitle;
    private final String originalTitle;
    private final String isAdult;
    private final String startYear;
    private final String endYear;
    private final String runtimeMinutes;
    private final String genres;

    public Title(String id, String type, String primaryTitle, String originalTitle, String isAdult, String startYear, String endYear, String runtimeMinutes, String genres) {
        this.id = id;
        Type = type;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
        this.genres = genres;
    }


    public String getId() {
        return id;
    }

    public String getType() {
        return Type;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getIsAdult() {
        return isAdult;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Title.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("Type='" + Type + "'")
                .add("primaryTitle='" + primaryTitle + "'")
                .add("originalTitle='" + originalTitle + "'")
                .add("isAdult='" + isAdult + "'")
                .add("startYear='" + startYear + "'")
                .add("endYear='" + endYear + "'")
                .add("runtimeMinutes='" + runtimeMinutes + "'")
                .add("genres='" + genres + "'")
                .toString();
    }
}
