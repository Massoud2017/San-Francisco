package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class PopularPlaceFragment extends Fragment {

    public PopularPlaceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.Alcatraz_Island), R.drawable.alcatraz, getString(R.string.info_alctraz), R.drawable.contactone, getString(R.string.phone_number), R.drawable.mapimage, getString(R.string.address_number)));
        locations.add(new Location(getString(R.string.Union_Square), R.drawable.union_square, getString(R.string.info_Union_square), R.drawable.contactone, getString(R.string.phone_number), R.drawable.mapimage, getString(R.string.address_number)));
        locations.add(new Location(getString(R.string.golden_gate), R.drawable.goldengatebridge_001, getString(R.string.san_francisco), R.drawable.contactone, getString(R.string.phone_number), R.drawable.mapimage, getString(R.string.address_number)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
