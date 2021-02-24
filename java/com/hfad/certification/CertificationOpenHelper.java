package com.hfad.certification;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class CertificationOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="certification.db";
    private static final int DATABASE_VERSION=1;
    public CertificationOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

db.execSQL(CertificationContractClass.ProductsEntry.SQL_CREATE_TABLE);
db.execSQL(CertificationContractClass.CategoryEntry.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
