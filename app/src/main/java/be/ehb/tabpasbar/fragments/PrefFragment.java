package be.ehb.tabpasbar.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import be.ehb.tabpasbar.R;

public class PrefFragment extends PreferenceFragmentCompat {

    public static PrefFragment newInstance() {

        Bundle args = new Bundle();

        PrefFragment fragment = new PrefFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
