package uah.gist.javi.smartpark;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Javi on 08/02/2015.
 */
public class ActionActivity extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.actionlayout, container, false);
        return rootView;
    }
}
