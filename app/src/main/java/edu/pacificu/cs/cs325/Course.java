package edu.pacificu.cs.cs325;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Course {

    private String mcPrefix;
    private Integer mcNumber;

    public Course(String cPrefix, Integer cNumber) {
        mcPrefix = cPrefix;
        mcNumber = cNumber;
    }

    public Integer getMcNumber() {
        return mcNumber;
    }

    public void setMcNumber(Integer mcNumber) {
        this.mcNumber = mcNumber;
    }

    public String getMcPrefix() {
        return mcPrefix;
    }

    public void setMcPrefix(String mcPrefix) {
        this.mcPrefix = mcPrefix;
    }


}
