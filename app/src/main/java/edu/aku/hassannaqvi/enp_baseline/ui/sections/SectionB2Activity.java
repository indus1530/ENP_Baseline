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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionB2Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionB2Activity extends AppCompatActivity {

    private static final String TAG = "SectionB2Activity";
    ActivitySectionB2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b2);
        bi.setForm(modb);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);

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
            startActivity(new Intent(this, SectionC1Activity.class));
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
        if (!modb.getB202w().isEmpty() && !modb.getB202m().isEmpty() && !modb.getB202y().isEmpty()) {
            if (Integer.parseInt(modb.getB202w()) + Integer.parseInt(modb.getB202m()) + Integer.parseInt(modb.getB202y()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b202w, "All Values Can't be zero");
        }
        if (!modb.getB204w().isEmpty() && !modb.getB204m().isEmpty()) {
            if (Integer.parseInt(modb.getB204w()) + Integer.parseInt(modb.getB204m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b204w, "All Values Can't be zero");
        }
        if (!modb.getB21201().isEmpty() && !modb.getB21202().isEmpty()) {
            if (Integer.parseInt(modb.getB21201()) + Integer.parseInt(modb.getB21202()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b21101, "All Values Can't be zero");
        }
        if (!modb.getB222h().isEmpty() && !modb.getB222m().isEmpty()) {
            if (Integer.parseInt(modb.getB222h()) + Integer.parseInt(modb.getB222m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b222h, "All Values Can't be zero");
        }
        return true;
    }

}