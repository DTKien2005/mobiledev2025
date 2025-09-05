package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class ForecastFragment extends Fragment {
    public ForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(0xFFFFFFFF);

        TextView dayTextView = view.findViewById(R.id.dayTextView);
        ImageView weatherIcon = view.findViewById(R.id.weatherIcon);

        String currentDay = getCurrentDay();
        dayTextView.setText(currentDay);  // You can update this based on the current day

        // Set the image resource for the ImageView (weather icon)
        weatherIcon.setImageResource(R.drawable.cloud_icon);

        return view;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
    private String getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.SUNDAY: return "Sunday";
            case Calendar.MONDAY: return "Monday";
            case Calendar.TUESDAY: return "Tuesday";
            case Calendar.WEDNESDAY: return "Wednesday";
            case Calendar.THURSDAY: return "Thursday";
            case Calendar.FRIDAY: return "Friday";
            case Calendar.SATURDAY: return "Saturday";
            default: return "Unknown";
        }
    }
}