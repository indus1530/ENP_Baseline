package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.modb;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionB1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionB1Activity extends AppCompatActivity {


    private static final String TAG = "SectionB1Activity";
    ActivitySectionB1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b1);
        bi.setModb(modb);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        modb.setB101(String.valueOf(MainApp.bCount + 1));

        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {
    }


    private boolean updateDB() {
        /*if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SB42, mwra.sB42toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionB2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!modb.getB104y().isEmpty() && !modb.getB104m().isEmpty() && !modb.getB104w().isEmpty()) {
            if (Integer.parseInt(modb.getB104y()) + Integer.parseInt(modb.getB104m()) + Integer.parseInt(modb.getB104w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b104y, "All Values Can't be zero");
        }
        if (!modb.getB105d().isEmpty() && !modb.getB105m().isEmpty() && !modb.getB105w().isEmpty()) {
            if (Integer.parseInt(modb.getB105d()) + Integer.parseInt(modb.getB105m()) + Integer.parseInt(modb.getB105w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b105d, "All Values Can't be zero");
        }
        if (!modb.getB115h().isEmpty() && !modb.getB115m().isEmpty()) {
            if (Integer.parseInt(modb.getB115h()) + Integer.parseInt(modb.getB115m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b115h, "All Values Can't be zero");
        }
        return true;
    }
}