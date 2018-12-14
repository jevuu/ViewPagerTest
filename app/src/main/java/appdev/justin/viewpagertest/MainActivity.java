package appdev.justin.viewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPagerOne = findViewById(R.id.pager);
        fpa adapter = new fpa(getSupportFragmentManager());
        viewPagerOne.setAdapter(adapter);
    }
}

class fpa extends FragmentPagerAdapter {
    public fpa(FragmentManager fm) { super(fm); }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) return new MonFragment();
        else if (position == 1) return new TueFragment();
        else return new WedFragment();
    }

    @Override
    public int getCount() { return 3; }
}

/*
public class MonFragment extends Fragment {
    //public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment_monday, container, false);
        Bundle args = getArguments();
        TextView txtDay = getActivity().findViewById(R.id.txtDay);
        txtDay.setText("Monday");
        return rootView;
    }
}

public class TueFragment extends Fragment {
    //public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment_monday, container, false);
        Bundle args = getArguments();
        TextView txtDay = getActivity().findViewById(R.id.txtDay);
        txtDay.setText("Tuesday");
        return rootView;
    }
}*/
