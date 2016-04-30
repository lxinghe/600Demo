package com.lu_xinghe.project600final;

/**
 * Created by Edward on 04/25/16.
 */
import android.app.Activity;
import android.content.Intent;
public class Util_changeTheme
{
    private static int sTheme;
    public final static int THEME_DEFAULT = 0;
    public final static int THEME_ONE = 1;
    public final static int THEME_TWO = 2;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
                break;
            case THEME_DEFAULT:

                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_ONE:
                activity.setTheme(R.style.AppTheme2);
                break;
            case THEME_TWO:
                activity.setTheme(R.style.AppTheme3);
                break;
        }
    }
}
