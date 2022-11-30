package com.example.practiceforandroid.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movimientos")
public class Movimientos {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name ="tipo")
    public static String tipo;
    @ColumnInfo(name ="motivo")
    public static String motivo;
    @ColumnInfo(name ="latitud")
    public static String latitud;
    @ColumnInfo(name ="longitud")
    public static String longitud;
    @ColumnInfo(name ="url")
    public static String url;
}
