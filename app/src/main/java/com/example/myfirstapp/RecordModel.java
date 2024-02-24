package com.example.myfirstapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class RecordModel implements Parcelable {
    private String recordValue;
    private String recordDate;

    public RecordModel(String recordValue, String recordDate) {
        this.recordValue = recordValue;
        this.recordDate = recordDate;
    }

    protected RecordModel(Parcel in) {
        recordValue = in.readString();
        recordDate = in.readString();
    }

    public static final Creator<RecordModel> CREATOR = new Creator<RecordModel>() {
        @Override
        public RecordModel createFromParcel(Parcel in) {
            return new RecordModel(in);
        }

        @Override
        public RecordModel[] newArray(int size) {
            return new RecordModel[size];
        }
    };

    public String getRecordValue() {
        return recordValue;
    }

    public void setRecordValue(String recordValue) {
        this.recordValue = recordValue;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(recordValue);
        dest.writeString(recordDate);
    }
}
