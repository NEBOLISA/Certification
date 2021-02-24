package com.hfad.certification;
import android.provider.BaseColumns;

public  class CertificationContractClass {
    public CertificationContractClass() {
    }
    public static final class ProductsEntry implements BaseColumns {
        public static final String TABLE_NAME = "products";
        public static final String PRODUCTS_ID = "products_id";
        public static final String PRODUCTS_NAME ="products_name";
        public static final String PRODUCT_QUANTITY ="products_quantity";
        public static final String CATEGORY_NAME ="category_name";
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE" + TABLE_NAME + "(" + _ID +"INTEGER PRIMARY KEY" + PRODUCTS_ID +"TEXT NOT NULL"
           + PRODUCTS_NAME + "TEXT,NOT NULL" + PRODUCT_QUANTITY + "INTEGER NOT NULL)";
    }
    public static final class CategoryEntry implements BaseColumns{
        public static final String TABLE_NAME ="category";
        public static final String CATEGORY_NAME ="category_name";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE" + TABLE_NAME + "(" + _ID + "INTEGER PRIMARY KEY" + CATEGORY_NAME + "" +
                        "TEXT NOT NULL)";
    }
}
