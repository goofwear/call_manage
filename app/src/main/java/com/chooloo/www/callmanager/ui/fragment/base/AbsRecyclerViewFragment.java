package com.chooloo.www.callmanager.ui.fragment.base;

import android.os.Bundle;

import com.chooloo.www.callmanager.R;
import com.chooloo.www.callmanager.ui.activity.MainActivity;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

public abstract class AbsRecyclerViewFragment extends BaseFragment {

    public @BindView(R.id.recycler_view) RecyclerView mRecyclerView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getActivity() instanceof MainActivity) {
            MainActivity activity = (MainActivity) getActivity();
            activity.syncFABAndFragment();
        }
    }
}
