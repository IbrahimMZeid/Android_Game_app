package controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.projecttry.HomeRVModel;

import java.util.ArrayList;

import Utils.Utils;
import model.Games;
import model.Users;

public class DatabaseHandller extends SQLiteOpenHelper {
    public DatabaseHandller(@Nullable Context context) {
        super(context, Utils.DATABASE_NAME, null, Utils.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE_SQL_USER = "CREATE TABLE " + Utils.TABLE_NAME_USERS
                + '(' + Utils.KEY_EMAIL + " varchar(100) PRIMARY KEY not null ," +
                Utils.KEY_NAME + " varchar(100)  not null ," +
                Utils.KEY_PASSWORD + " varchar(100) not null " +
                ')';
        String CREATE_TABLE_SQL_GAME = "CREATE TABLE " + Utils.TABLE_NAME_GAMES +
                '(' +
                Utils.KEY_TITLE + " varchar(100) PRIMARY KEY not null ," +
                Utils.KEY_SUBTITLE + " varchar(100)  not null ," +
                Utils.KEY_HOMEPAGE + " varchar(100) not null ," +
                Utils.KEY_URL + " varchar(100) not null ," +
                Utils.KEY_CONTENT + " TEXT not null ," +
                Utils.KEY_STATE + " varchar(10) not null " +
                ')';
        String CREATE_TABLE_SQL_GAME_FAVOURITE = "CREATE TABLE " + Utils.TABLE_NAME_GAMES_FAVOURITE +
                '(' + Utils.KEY_TITLE + " varchar(100) not null, " +
                Utils.KEY_EMAIL + " varchar(100) not null ," +
                " PRIMARY KEY " + '(' + Utils.KEY_TITLE + ',' + Utils.KEY_EMAIL + ')' + ',' +
                " FOREIGN KEY " + '(' + Utils.KEY_EMAIL + ')' + " REFERENCES " + Utils.TABLE_NAME_USERS + '(' + Utils.KEY_EMAIL + ')'
                + ')';

        Log.i("sql", CREATE_TABLE_SQL_GAME);
        sqLiteDatabase.execSQL(CREATE_TABLE_SQL_USER);
        sqLiteDatabase.execSQL(CREATE_TABLE_SQL_GAME);
        sqLiteDatabase.execSQL(CREATE_TABLE_SQL_GAME_FAVOURITE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Utils.TABLE_NAME_USERS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Utils.TABLE_NAME_GAMES);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Utils.TABLE_NAME_GAMES_FAVOURITE);


        onCreate(sqLiteDatabase);
    }

    public String addUser(Users user) {
        if (!getUserBYEmail(user.getEmail())) {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Utils.KEY_EMAIL, user.getEmail());
            contentValues.put(Utils.KEY_NAME, user.getUsername());
            contentValues.put(Utils.KEY_PASSWORD, user.getPassword());
            long result = sqLiteDatabase.insert(Utils.TABLE_NAME_USERS, null, contentValues);
            sqLiteDatabase.close();
            if (result == -1) {
                return "Not Add";
            }
            return "Add";
        }
        return "The User is already exists";
    }

    public boolean getUserBYEmail(String email) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql = "SELECT * FROM " + Utils.TABLE_NAME_USERS +
                " WHERE " + Utils.KEY_EMAIL + " = " + '\'' + email + '\'';
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
        sqLiteDatabase.close();
            return true;
        }
        sqLiteDatabase.close();
        return false;
    }

    public Users getUser(String email, String password) {
        Users user = new Users();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql = "SELECT * FROM " + Utils.TABLE_NAME_USERS +
                " WHERE " + Utils.KEY_EMAIL + " = " + '\'' + email + '\'' +
                " and " +
                Utils.KEY_PASSWORD + " = " + '\'' + password + '\'';
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            user.setEmail(cursor.getString(0));
            user.setUsername(cursor.getString(1));
            user.setPassword(cursor.getString(2));
            cursor.close();
            sqLiteDatabase.close();
        } else
            return null;
        return user;
    }

    public String updateUserPass(String email, String newPassword) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utils.KEY_PASSWORD, newPassword);
        int d = sqLiteDatabase.update(Utils.TABLE_NAME_USERS, contentValues, Utils.KEY_EMAIL + " = " + '\'' + email + '\'', null);
        sqLiteDatabase.close();
        if (d == 0) {
            return "Not Found";
        }
        return "Upd";
    }

    public String updateUserUsername(String email, String username) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utils.KEY_NAME, username);
        int d = sqLiteDatabase.update(Utils.TABLE_NAME_USERS, contentValues, Utils.KEY_EMAIL + " = " + '\'' + email + '\'', null);
        sqLiteDatabase.close();
        if (d == 0) {
            return "Not Found";
        }
        return "Upd";
    }

    public void addGame(HomeRVModel game) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utils.KEY_TITLE, game.getTitle());
        contentValues.put(Utils.KEY_SUBTITLE, game.getSubTitle());
        contentValues.put(Utils.KEY_HOMEPAGE, game.getHomeImageUrl());
        contentValues.put(Utils.KEY_URL, game.getUrl());
        contentValues.put(Utils.KEY_CONTENT, game.getContent());
        contentValues.put(Utils.KEY_STATE, game.getState());
        long result = sqLiteDatabase.insert(Utils.TABLE_NAME_GAMES, null, contentValues);
        sqLiteDatabase.close();

    }

    public String addGameFavourite(String email, String title) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utils.KEY_EMAIL, email);
        contentValues.put(Utils.KEY_TITLE, title);

        long result = sqLiteDatabase.insert(Utils.TABLE_NAME_GAMES_FAVOURITE, null, contentValues);
        sqLiteDatabase.close();
        if (result == -1) {
            return "Not Add";
        }
        return "Add";
    }

    public ArrayList<HomeRVModel> getFavouriteGame(String email) {
        ArrayList<HomeRVModel> games = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql = "SELECT " + Utils.KEY_TITLE + " FROM " + Utils.TABLE_NAME_GAMES_FAVOURITE+
                " WHERE " + Utils.KEY_EMAIL + " = " + '\'' + email + '\'';
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String title = cursor.getString(0);
                games.add(getGameFromTitle(title));
            } while (cursor.moveToNext());
        }
        return games;
    }

    public HomeRVModel getGameFromTitle(String title) {
        HomeRVModel game = new HomeRVModel();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql1 = "SELECT * FROM " + Utils.TABLE_NAME_GAMES +
                " WHERE " + Utils.KEY_TITLE + " = " + '\'' + title + '\'';
        Cursor cursor = sqLiteDatabase.rawQuery(sql1, null);
        if (cursor.moveToFirst()) {
            game.setTitle(cursor.getString(0));
            game.setSubTitle(cursor.getString(1));
            game.setHomeImageUrl(cursor.getString(2));
            game.setUrl(cursor.getString(3));
            game.setContent(cursor.getString(4));
            game.setState(cursor.getString(5));
        }
        return game;
    }

    public String getFavouriteGameToDetails(String email,String title) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql = "SELECT " + Utils.KEY_TITLE + " FROM " + Utils.TABLE_NAME_GAMES_FAVOURITE +
                " WHERE " + Utils.KEY_TITLE + " = " + '\'' + title + '\'' +
                " and " +
                Utils.KEY_EMAIL + " = " + '\'' + email + '\'';
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            return "Found";
        }
        return null;
    }


    public ArrayList<HomeRVModel> getGame() {
        ArrayList<HomeRVModel> games = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String sql1 = "SELECT * FROM " + Utils.TABLE_NAME_GAMES;
        Cursor cursor1 = sqLiteDatabase.rawQuery(sql1, null);

        if (cursor1.moveToFirst()) {
            do {
                HomeRVModel game = new HomeRVModel();
                game.setTitle(cursor1.getString(0));
                game.setSubTitle(cursor1.getString(1));
                game.setHomeImageUrl(cursor1.getString(2));
                game.setUrl(cursor1.getString(3));
                game.setContent(cursor1.getString(4));
                game.setState(cursor1.getString(5));
                games.add(game);
            } while (cursor1.moveToNext());

            cursor1.close();
            sqLiteDatabase.close();
        } else
            return null;
        return games;
    }

    public String deleteGame(String email, String title) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        int res = sqLiteDatabase.delete(Utils.TABLE_NAME_GAMES_FAVOURITE,
                Utils.KEY_EMAIL + " = " + '\'' + email + '\'' + " AND " + Utils.KEY_TITLE + " = " + '\'' + title + '\'',
                null);
        if (res == 0) {
            return "Not Found";
        }
        return "del";
    }
}
