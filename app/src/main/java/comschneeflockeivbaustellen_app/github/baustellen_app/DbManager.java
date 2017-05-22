package comschneeflockeivbaustellen_app.github.baustellen_app;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DbManager extends SQLiteOpenHelper {

    public static final int DATENBANK_VERSION = 1;
    public static final String DATENBANK_NAMEN = "Baustellen_App.db";

    // Aufbau der Tabelle Event
    // Account Daten
    private static final String TABELLE_ACC = "Account";
    private static final String SPALTE_ACC_ID = "ID";
    private static final String SPALTE_ACC_GESCHLECHT = "Geschlecht";
    private static final String SPALTE_ACC_GRAD = "Grad";
    private static final String SPALTE_ACC_VORNAME = "Vorname";
    private static final String SPALTE_ACC_NACHNAME = "Nachname";
    private static final String SPALTE_ACC_TELEFONNUMMER = "Telfefonnummer";
    private static final String SPALTE_ACC_PASSWORD1 = "Password1";
    private static final String SPALTE_ACC_PASSWORD2 = "Password2";
    //Baustellen Daten
    //TODO
    //Baustellen Tabele struktorieren
    private static final String TABELLE_BAUSTELLEN = "Baustellen";
    private static final String SPALTE_BAUSTELLEN_NAME = "ID";
    private static final String SPALTE_BAUSTELLEN_STRASSE = "Name";
    private static final String SPALTE_BAUSTELLEN_NR = "Maschine";
    private static final String SPALTE_BAUSTELLEN_ORT = "Platzierung";
    private static final String SPALTE_BAUSTELLEN_PLZ = "Event_ID";
    private static final String SPALTE_BAUSTELLEN_BAUHERR = "Event_ID";

    public DbManager(Context cxt) {
        super(cxt, DATENBANK_NAMEN, null, DATENBANK_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + TABELLE_ACC + " (" +
                        SPALTE_ACC_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        SPALTE_ACC_VORNAME + " TEXT," +
                        SPALTE_ACC_NACHNAME + " TEXT," +
                        SPALTE_ACC_GESCHLECHT + " TEXT," +
                        SPALTE_ACC_GRAD + " TEXT,"  +
                        SPALTE_ACC_TELEFONNUMMER + " TEXT," +
                        SPALTE_ACC_PASSWORD1 + " TEXT," +
                        SPALTE_ACC_PASSWORD2 + " TEXT," +
                        ")"
        );
        //TODO
        //Tabele erstellen Baustelle
        db.execSQL(
                "CREATE TABLE " + TABELLE_BAUSTELLEN + " (" +

                        ")"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
