package nyc.c4q.fragments2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    View rootView;
    TextView textView1;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        rootView= inflater.inflate(R.layout.fragment_second, container, false);
        textView1=(TextView) rootView.findViewById(R.id.fragment2_textview);
       Bundle bundle= getArguments();
       String textString=bundle.getString("text01");
       textView1.setText(textString);
        return rootView;
    }

}
