package com.vitassalvantes.mrbezirker;

/**
 * @author VitasSalvantes
 * @version 1.0
 */
public class Bezirk {
    /**
     * District name (link to string resource in values)
     */
    private final int name;

    /**
     * District history (link to string resource in values)
     */
    private final int history;

    /**
     * District statistics (link to string resource in values)
     */
    private final int statistics;

    /**
     * District attractions (link to string resource in values)
     */
    private final int attractions;

    /**
     * District legends (link to string resource in values)
     */
    private final int legends;

    /**
     * Link to resource in drawable
     */
    private final int imageResourceId;  // TODO add images for all districts

    /**
     * Constructor that initializes all variables
     */
    private Bezirk(int name, int history, int statistics, int attractions, int legends, int imageResourceId) {
        this.name = name;
        this.history = history;
        this.statistics = statistics;
        this.attractions = attractions;
        this.legends = legends;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Getter for {@link Bezirk#name}
     */
    public int getName() {
        return name;
    }

    /**
     * Getter that returns content ({@link Bezirk#history}, {@link Bezirk#statistics}, {@link Bezirk#attractions} or {@link Bezirk#legends}) depending on the selected section
     */
    public int getContent(int section) {
        switch (section) {
            case 0:
                return history;

            case 1:
                return statistics;

            case 2:
                return attractions;

            case 3:
                return legends;

            default:
                return 0;
        }
    }

    /**
     * Getter for {@link Bezirk#imageResourceId}
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Array that contains objects that are all districts of Hamburg (in layouts and arrays objects must be in alphabetical order)
     */
    public static final Bezirk[] bezirke = {
            new Bezirk(R.string.altona_name,
                    R.string.altona_history,
                    R.string.altona_statistics,
                    R.string.altona_attractions,
                    R.string.altona_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.bergedorf_name,
                    R.string.bergedorf_history,
                    R.string.bergedorf_statistics,
                    R.string.bergedorf_attractions,
                    R.string.bergedorf_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.eimsbüttel_name,
                    R.string.eimsbüttel_history,
                    R.string.eimsbüttel_statistics,
                    R.string.eimsbüttel_attractions,
                    R.string.eimsbüttel_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.hamburg_mitte_name,
                    R.string.hamburg_mitte_history,
                    R.string.hamburg_mitte_statistics,
                    R.string.hamburg_mitte_attractions,
                    R.string.hamburg_mitte_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.hamburg_nord_name,
                    R.string.hamburg_nord_history,
                    R.string.hamburg_nord_statistics,
                    R.string.hamburg_nord_attractions,
                    R.string.hamburg_nord_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.harburg_name,
                    R.string.harburg_history,
                    R.string.harburg_statistics,
                    R.string.harburg_attractions,
                    R.string.harburg_legends,
                    R.drawable.hamburg),

            new Bezirk(R.string.wandsbek_name,
                    R.string.wandsbek_history,
                    R.string.wandsbek_statistics,
                    R.string.wandsbek_attractions,
                    R.string.wandsbek_legends,
                    R.drawable.hamburg)
    };
}